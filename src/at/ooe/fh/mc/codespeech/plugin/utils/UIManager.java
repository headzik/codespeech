package at.ooe.fh.mc.codespeech.plugin.utils;

import java.util.ArrayList;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.core.dom.ASTMatcher;
import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.ASTVisitor;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jdt.core.dom.TypeDeclaration;
import org.eclipse.jdt.ui.IPackagesViewPart;
import org.eclipse.jdt.ui.JavaUI;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.Document;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.ITextSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.TreeItem;
import org.eclipse.text.edits.TextEdit;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.IDE;
import org.eclipse.ui.progress.UIJob;
import org.eclipse.ui.texteditor.ITextEditor;

import at.ooe.fh.mc.codespeech.plugin.Context;
import at.ooe.fh.mc.codespeech.plugin.ast.ASTManager;

/**
 * Class that is responsible for managing currently open Editor.
 * 
 * @author Lukasz Strzelecki
 *
 */
public class UIManager {

	/**
	 * Current active editor
	 */
	private static ITextEditor activeEditor;

	/**
	 * Returns text selection
	 * 
	 * @return text selection
	 */
	private static ITextSelection getTextSelection() {
		return (ITextSelection) activeEditor.getSelectionProvider().getSelection();
	}

	/**
	 *  Sets new active editor
	 * 
	 * @param newActiveEditor
	 */
	public static void setActiveEditor(ITextEditor newActiveEditor) {
		activeEditor = newActiveEditor;
	}

	/**
	 * Returns IDocument of the active editor
	 * 
	 * @return IDocument of active editor
	 * @throws BadLocationException if IDocument could not be retrieved
	 */
	private static IDocument getIDocument() throws BadLocationException {
		return activeEditor.getDocumentProvider().getDocument(activeEditor.getEditorInput());
	}

	/**
	 * Returns ICompilationUnit of the editor
	 * 
	 * @return ICompilationUnit of the editor
	 */
	public static ICompilationUnit getICompilationUnit() {
		return JavaUI.getWorkingCopyManager().getWorkingCopy(activeEditor.getEditorInput());
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

				activeEditor.selectAndReveal(offset, 0);

				Context.currentNode = getNode();

			} catch (BadLocationException | JavaModelException exception  ) {
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

		edits.apply(document);

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
	public static void openNewEditor(ICompilationUnit compilationUnit) throws JavaModelException, PartInitException {
		Display.getDefault().asyncExec(new Runnable() {
			@Override
			public void run() {
				IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
				IFile file;
				try {
					file = (IFile) compilationUnit.getCorrespondingResource();

					revealInPackageExplorer(compilationUnit);	
					IDE.openEditor(page, file);

					Context.currentNode = getNode();
					Context.currentNode = getChildAfterCurrentLine(Context.currentNode, TypeDeclaration.class);
				} catch (JavaModelException | PartInitException e) {
					e.printStackTrace();
				}


			}
		});
	}

	/**
	 * Returns a child node that occur after the current line
	 * 
	 * @param node parent node
	 * @param childClass class of a node to find
	 * @return child node
	 */
	public static ASTNode getChildAfterCurrentLine(ASTNode node, Class<?> childClass) {
		CompilationUnit astRoot = ASTManager.getCompilationUnitAST(getICompilationUnit());

		ArrayList<ASTNode> foundNode = new ArrayList<>();

		if(node != null) {
			node.accept(new ASTVisitor() {
				@Override
				public boolean preVisit2(ASTNode visitedNode) {
					if(childClass.isInstance(visitedNode) && !node.equals(visitedNode)) {
						if(astRoot.getLineNumber(visitedNode.getStartPosition()) - 1 >= getTextSelection().getEndLine() &&
								foundNode.isEmpty()) {
							foundNode.add(visitedNode);
						} 
					}
					return super.preVisit2(visitedNode);
				}	
			});
		}
		return foundNode.isEmpty() ? null : foundNode.get(0);
	}

	/**
	 * Returns a node of the current line
	 * 
	 * 
	 * @return\ASTNode that occurs in selected line
	 * @throws JavaModelException
	 */
	private static ASTNode getNode() throws JavaModelException {
		CompilationUnit astRoot = ASTManager.getCompilationUnitAST(getICompilationUnit());

		ArrayList<ASTNode> parentNode = new ArrayList<>();
		ArrayList<ASTNode> nodeInLine = new ArrayList<>();

		astRoot.accept(new ASTVisitor() {
			@Override
			public boolean preVisit2(ASTNode node) {	
				if(node.getStartPosition() < getTextSelection().getOffset() && 
						node.getStartPosition() + node.getLength() > getTextSelection().getOffset()) {
					parentNode.clear();
					parentNode.add(node);
				} 

				if(astRoot.getLineNumber(node.getStartPosition()) - 1 == getTextSelection().getEndLine() &&
						nodeInLine.isEmpty()) {
					nodeInLine.add(node);
				} 
				return super.preVisit2(node);
			}	
		});

		if(parentNode.isEmpty()) {
			parentNode.add(astRoot);
		}
		
		return nodeInLine.isEmpty() ? parentNode.get(0) : nodeInLine.get(0);
	}

	public static void revealInPackageExplorer(Object element) {
		IWorkbenchPart activePart = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().findView(JavaUI.ID_PACKAGES);		

		if(activePart instanceof IPackagesViewPart) {
			TreeViewer treeViewer = ((IPackagesViewPart) activePart).getTreeViewer();
			selectAndReveal(treeViewer, element);
		}
	}

	public static void revealInPackageExplorer(String name) {
		IWorkbenchPart activePart = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().findView(JavaUI.ID_PACKAGES);

		if(activePart instanceof IPackagesViewPart) {
			TreeViewer treeViewer = ((IPackagesViewPart) activePart).getTreeViewer();

			// TODO: think of something better
			TreeItem [] items = treeViewer.getTree().getItems();
			for(int i = 0; i < items.length; i++) {
				if(items[i].getText().equals(name)) {
					selectAndReveal(treeViewer, items[i].getData());
					TreeItem [] children = items[i].getItems();
					for(int j = 0; j < children.length; j++) {
						if(children[j].getText().equals("src")) {
							treeViewer.expandToLevel(children[j].getData(), 1);
						}
					}
					break;
				}
			}
		}
	}

	private static void selectAndReveal(TreeViewer treeViewer, Object element) {
		treeViewer.expandToLevel(element, 1);
		treeViewer.setSelection(new StructuredSelection(element));
	}

}
