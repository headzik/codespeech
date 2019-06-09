package at.ooe.fh.mc.codespeech.interpreter.operations.creation;

import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.JavaModelException;

import at.ooe.fh.mc.codespeech.interpreter.models.Model;
import at.ooe.fh.mc.codespeech.interpreter.models.PackageModel;
import at.ooe.fh.mc.codespeech.interpreter.operations.Operation;
import at.ooe.fh.mc.codespeech.plugin.utils.SelectionService;
import at.ooe.fh.mc.codespeech.plugin.utils.UIManager;

public class CreatePackageOperation implements Operation {

	@Override
	public void perform(Object property) {	
		if(property instanceof PackageModel) {
			PackageModel packageModel = (PackageModel) property;
			try {
				IPackageFragment fragment = null;
				IPackageFragmentRoot packageFragmentRoot = SelectionService.getSelectedPackageFragmentRoot();

				fragment = packageFragmentRoot.createPackageFragment(packageModel.name, true, null);
				UIManager.revealInPackageExplorer(fragment);
				//SelectionService.selectAndReveal(fragment);
			} catch (JavaModelException exception) {
				exception.printStackTrace();
			}
		}
	}


}
