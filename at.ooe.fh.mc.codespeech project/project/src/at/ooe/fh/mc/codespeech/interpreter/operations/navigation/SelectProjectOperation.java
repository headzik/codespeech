package at.ooe.fh.mc.codespeech.interpreter.operations.navigation;

import at.ooe.fh.mc.codespeech.interpreter.models.ProjectModel;
import at.ooe.fh.mc.codespeech.interpreter.operations.Operation;
import at.ooe.fh.mc.codespeech.plugin.utils.PackageExplorerManager;

public class SelectProjectOperation implements Operation {

	@Override
	public void perform(Object property) {

		if(property instanceof ProjectModel) {
			ProjectModel projectModel = (ProjectModel) property;
			
			PackageExplorerManager.reveal(projectModel.getPhrase());
		}
	}


}
