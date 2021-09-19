package at.ooe.fh.mc.codespeech.interpreter.operations.modification;

import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.IHandlerService;

import at.ooe.fh.mc.codespeech.interpreter.operations.Operation;
import at.ooe.fh.mc.codespeech.plugin.utils.EditorManager;

public class UndoOperation implements Operation {

	@Override
	public void perform(Object property) throws Exception {
		String commandId = "org.eclipse.ui.edit.undo";		

		IHandlerService handlerService = (IHandlerService) PlatformUI.getWorkbench().getService(IHandlerService.class);
		try {

				
			int lineNumber = EditorManager.getLineNumber();
						
			handlerService.executeCommand(commandId, null);

			EditorManager.updateCompilationUnit(null);

			EditorManager.moveToLine(lineNumber);
		} catch (Exception ex) {
			throw new RuntimeException("not found");
			// Give message
		}


	}

}
