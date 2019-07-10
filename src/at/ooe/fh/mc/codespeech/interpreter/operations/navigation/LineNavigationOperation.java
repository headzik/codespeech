package at.ooe.fh.mc.codespeech.interpreter.operations.navigation;

import at.ooe.fh.mc.codespeech.interpreter.operations.Operation;
import at.ooe.fh.mc.codespeech.plugin.utils.EditorManager;

public class LineNavigationOperation implements Operation {

	@Override
	public void perform(Object property) throws Exception {
		if(property instanceof Integer) {
			int lineNumber = (Integer) property;
			int endLine = EditorManager.getLineCount();
			if(lineNumber > 0 && lineNumber < endLine) {
				EditorManager.moveToLine(lineNumber);
			}
		}

	}

}
