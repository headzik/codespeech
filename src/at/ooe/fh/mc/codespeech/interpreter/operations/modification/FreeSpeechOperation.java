package at.ooe.fh.mc.codespeech.interpreter.operations.modification;

import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.ITextSelection;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.texteditor.ITextEditor;

import at.ooe.fh.mc.codespeech.interpreter.models.ClassModel;
import at.ooe.fh.mc.codespeech.interpreter.operations.Operation;
import at.ooe.fh.mc.codespeech.plugin.Context;
import at.ooe.fh.mc.codespeech.plugin.utils.SelectionService;
import at.ooe.fh.mc.codespeech.plugin.utils.UIManager;

public class FreeSpeechOperation implements Operation {

	@Override
	public void perform(Object property) throws Exception {
		if(property instanceof String) {
			ICompilationUnit cu = UIManager.getICompilationUnit();

			ITextEditor activeEditor = (ITextEditor) PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor();

			
			IDocument doc = UIManager.getIDocument();
			ITextSelection selection = (ITextSelection) activeEditor
					.getSelectionProvider().getSelection();
			int offset = selection.getOffset();

			doc.replace(offset, 0, (String) property + "\n");
		}
	}

}
