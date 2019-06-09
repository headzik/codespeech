package at.ooe.fh.mc.codespeech.interpreter.operations.navigation;

import at.ooe.fh.mc.codespeech.interpreter.models.WithPhrase;
import at.ooe.fh.mc.codespeech.interpreter.operations.Operation;
import at.ooe.fh.mc.codespeech.plugin.utils.UIManager;

public class SelectProjectOperation implements Operation {

	@Override
	public void perform(Object property) {

		if(property instanceof WithPhrase) {
			UIManager.revealInPackageExplorer(((WithPhrase) property).getPhrase());
		}
	}


}
