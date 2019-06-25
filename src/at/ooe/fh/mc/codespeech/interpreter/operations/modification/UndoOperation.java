package at.ooe.fh.mc.codespeech.interpreter.operations.modification;

import org.eclipse.jface.text.ITextSelection;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.IHandlerService;

import at.ooe.fh.mc.codespeech.interpreter.operations.Operation;
import at.ooe.fh.mc.codespeech.plugin.Context;
import at.ooe.fh.mc.codespeech.plugin.utils.UIManager;

public class UndoOperation implements Operation {

	@Override
	public void perform(Object property) throws Exception {
		String commandId = "org.eclipse.ui.edit.undo";		

		IHandlerService handlerService = (IHandlerService) PlatformUI.getWorkbench().getService(IHandlerService.class);
		try {

			
			int lineNumber = UIManager.getLineNumber();
						
			handlerService.executeCommand(commandId, null);

			UIManager.updateCompilationUnit(null);

			UIManager.moveToLine(lineNumber);
		} catch (Exception ex) {
			throw new RuntimeException("not found");
			// Give message
		}


	}

}
