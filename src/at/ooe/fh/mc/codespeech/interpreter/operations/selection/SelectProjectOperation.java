package at.ooe.fh.mc.codespeech.interpreter.operations.selection;

import at.ooe.fh.mc.codespeech.interpreter.models.Model;
import at.ooe.fh.mc.codespeech.interpreter.models.WithPhrase;
import at.ooe.fh.mc.codespeech.interpreter.operations.Operation;
import at.ooe.fh.mc.codespeech.plugin.utils.UIManager;
public class SelectProjectOperation implements Operation {

	@Override
	public void perform(Model model) {

		if(model instanceof WithPhrase) {
			WithPhrase nameableModel = (WithPhrase) model;
			UIManager.revealInPackageExplorer(nameableModel.getPhrase());  
		}
	}

}
