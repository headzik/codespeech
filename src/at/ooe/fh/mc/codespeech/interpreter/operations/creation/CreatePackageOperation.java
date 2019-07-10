package at.ooe.fh.mc.codespeech.interpreter.operations.creation;

import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.JavaModelException;

import at.ooe.fh.mc.codespeech.interpreter.models.PackageModel;
import at.ooe.fh.mc.codespeech.interpreter.operations.Operation;
import at.ooe.fh.mc.codespeech.plugin.utils.EditorManager;
import at.ooe.fh.mc.codespeech.plugin.utils.PackageExplorerManager;

public class CreatePackageOperation implements Operation {

	@Override
	public void perform(Object property) {	
		if(property instanceof PackageModel) {
			PackageModel packageModel = (PackageModel) property;
			try {
				IPackageFragment fragment = null;
				IPackageFragmentRoot packageFragmentRoot = PackageExplorerManager.getSelectedPackageFragmentRoot();

				fragment = packageFragmentRoot.createPackageFragment(packageModel.name, true, null);
				PackageExplorerManager.reveal(fragment);
				//PackageExplorerManager.selectAndReveal(fragment);
			} catch (JavaModelException exception) {
				exception.printStackTrace();
			}
		}
	}


}
