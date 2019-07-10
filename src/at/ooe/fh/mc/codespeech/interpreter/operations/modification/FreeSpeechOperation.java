package at.ooe.fh.mc.codespeech.interpreter.operations.modification;

import at.ooe.fh.mc.codespeech.interpreter.operations.Operation;
import at.ooe.fh.mc.codespeech.plugin.utils.ASTManager;
import at.ooe.fh.mc.codespeech.plugin.utils.EditorManager;

public class FreeSpeechOperation implements Operation {

	@Override
	public void perform(Object property) throws Exception {
		if(property instanceof String) {
			EditorManager.enterText(((String) property).replace(". ", "."));
		}
	}


}
