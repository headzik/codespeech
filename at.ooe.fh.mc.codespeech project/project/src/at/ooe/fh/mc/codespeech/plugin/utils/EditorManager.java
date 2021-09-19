package at.ooe.fh.mc.codespeech.plugin.utils;

import org.eclipse.core.resources.IFile;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.ISourceRange;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.core.ToolFactory;
import org.eclipse.jdt.core.dom.ASTMatcher;
import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.ASTVisitor;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jdt.core.formatter.CodeFormatter;
import org.eclipse.jdt.ui.JavaUI;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.Document;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.ITextSelection;
import org.eclipse.swt.widgets.Display;
import org.eclipse.text.edits.TextEdit;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.IDE;
import org.eclipse.ui.texteditor.ITextEditor;


/**
 * Class that is responsible for managing currently open Editor.
 * 
 * @author Lukasz Strzelecki
 *
 */
public class EditorManager {

	/**
	 * Current active editor
	 */
	private static ITextEditor activeEditor;

	public static ITextEditor getActiveEditor() {
		return activeEditor;
	}

	public static void setActiveEditor(ITextEditor newActiveEditor) {
		activeEditor = newActiveEditor;
	}

	/**
	 * Returns text selection
	 * 
	 * @return text selection
	 */
	static ITextSelection getTextSelection() {
		return (ITextSelection) getActiveEditor().getSelectionProvider().getSelection();
	}

	/**
	 * Returns IDocument of the active editor
	 * 
	 * @return IDocument of active editor
	 * @throws BadLocationException if IDocument could not be retrieved
	 */
	static IDocument getIDocument() throws BadLocationException {
		return getActiveEditor().getDocumentProvider().getDocument(getActiveEditor().getEditorInput());
	}

	/**
	 * Returns ICompilationUnit of the editor
	 * 
	 * @return ICompilationUnit of the editor
	 */
	public static ICompilationUnit getICompilationUnit() {
		return JavaUI.getWorkingCopyManager().getWorkingCopy(getActiveEditor().getEditorInput());
	}

	/**
	 * Moves caret to the line of a given number
	 * 
	 * @param lineNumber number of a line where caret should be placed
	 */
	public static void moveToLine(int lineNumber) {
		try {
			IDocument document = getIDocument();

			int offset = document.getLineOffset(lineNumber);

			getActiveEditor().selectAndReveal(offset, 0);

			ASTManager.findNewNode();

		} catch (BadLocationException exception  ) {
			exception.printStackTrace();
		}
	}

	/**
	 * Moves caret to the line where the given node is found
	 * 
	 * @param nodeToFind ASTNode which lines number is to be found
	 */
	public static void moveToNode(ASTNode nodeToFind) {
		ASTMatcher matcher = new ASTMatcher();

		CompilationUnit compilationUnit = ASTManager.getCompilationUnitAST(getICompilationUnit());
		compilationUnit.accept(new ASTVisitor() {

			@Override
			public boolean preVisit2(ASTNode node) {

				boolean match = matcher.safeSubtreeMatch(node, nodeToFind);
				if(match) {
					moveToLine(compilationUnit.getLineNumber(node.getStartPosition()) - 1);
				}
				return super.preVisit2(node);
			}
		});
	}

	public static int getLineOfNode(ASTNode node) {
		ASTMatcher matcher = new ASTMatcher();

		CompilationUnit compilationUnit = ASTManager.getCompilationUnitAST(getICompilationUnit());
		compilationUnit.accept(new ASTVisitor() {

			@Override
			public boolean preVisit2(ASTNode visitedNode) {

				boolean match = matcher.safeSubtreeMatch(node, visitedNode);
				if(match) {
					compilationUnit.setProperty("lineNumber", compilationUnit.getLineNumber(node.getStartPosition()) - 1);
				}
				return super.preVisit2(node);
			}
		});
		return (int) compilationUnit.getProperty("lineNumber");
	}



	/**
	 * Updates the compilation unit after changes of AST
	 * 
	 * @param edits TextEdits that where made when modifzing AST 
	 * @throws BadLocationException if location of changes are bad
	 * @throws JavaModelException if 
	 */
	public static void updateCompilationUnit(TextEdit edits) throws BadLocationException, JavaModelException {
		ICompilationUnit compilationUnit = getICompilationUnit();
		Document document = new Document(compilationUnit.getSource());

		if(edits != null) {
			edits.apply(document);
		}

		getActiveEditor().doSave(null);
		compilationUnit.getBuffer().setContents(document.get());
		compilationUnit.save(null, true);
	}

	/**
	 * Opens a file in a new editor 
	 * 
	 * @param compilationUnit to be opened
	 * @throws JavaModelException if error with Java model
	 * @throws PartInitException if error with location
	 */
	public static void openNewEditor(ICompilationUnit compilationUnit) {
		Display.getDefault().asyncExec(new Runnable() {
			@Override
			public void run() {
				IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
				IFile file;
				try {
					file = (IFile) compilationUnit.getCorrespondingResource();

					PackageExplorerManager.reveal(compilationUnit);	
					IDE.openEditor(page, file);
					ASTManager.findNewNode();
				} catch (JavaModelException | PartInitException e) {
					e.printStackTrace();
				}
			}
		});
	}

	public static int getLineNumber() {
		ITextSelection selection = (ITextSelection) getActiveEditor().getSelectionProvider().getSelection();
		int lineNumber = selection.getStartLine();
		return lineNumber;
	}

	public static void applyChanges(CompilationUnit cu) throws JavaModelException, BadLocationException {
		Document doc = new Document(getICompilationUnit().toString());
		TextEdit te = cu.rewrite(doc, 
				getICompilationUnit().getJavaProject().getOptions(true));

		updateCompilationUnit(te);

		indent();
	}

	public static void enterText(String textToEnter) throws BadLocationException, JavaModelException {
		IDocument doc = getIDocument();
		ITextSelection selection = (ITextSelection) activeEditor.getSelectionProvider().getSelection();
		int offset = selection.getOffset();

		doc.replace(offset, 0, textToEnter);
		activeEditor.selectAndReveal(offset + textToEnter.length(), 0);
		
		getICompilationUnit().save(null, true);
	}

	public static int getLineCount() throws BadLocationException {
		return getIDocument().getNumberOfLines();
	}

	public static void indent() throws JavaModelException {
		ISourceRange range = getICompilationUnit().getSourceRange();
		int start  = range.getOffset();
		int end = range.getLength();
		CodeFormatter formatter = ToolFactory.createCodeFormatter(null);
		TextEdit formatEdit = formatter.format(CodeFormatter.K_COMPILATION_UNIT, 
				getICompilationUnit().getSource(),
				start, end, 0, null);
		if (formatEdit != null && formatEdit.hasChildren()) {
			getICompilationUnit().applyTextEdit(formatEdit, null);
		} 
	}

}
