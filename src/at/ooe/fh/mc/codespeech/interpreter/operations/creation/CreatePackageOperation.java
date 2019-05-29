package at.ooe.fh.mc.codespeech.interpreter.operations.creation;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.ui.progress.UIJob;

import at.ooe.fh.mc.codespeech.interpreter.models.Model;
import at.ooe.fh.mc.codespeech.interpreter.models.PackageModel;
import at.ooe.fh.mc.codespeech.interpreter.operations.Operation;
import at.ooe.fh.mc.codespeech.plugin.utils.SelectionService;

public class CreatePackageOperation implements Operation {

	@Override
	public void perform(Model model) {	
		if(model instanceof PackageModel) {
			PackageModel packageModel = (PackageModel) model;
			new UIJob("CreatePackage") {

				@Override
				public IStatus runInUIThread(IProgressMonitor monitor) {
					try {
						IPackageFragment fragment = null;
						IPackageFragmentRoot packageFragmentRoot = SelectionService.getSelectedPackageFragmentRoot();
						//if(packageFragmentRoot != null) {
						//IPackageFragmentRoot packageFragmentRoot = model.getRoot();
						fragment = packageFragmentRoot.createPackageFragment(packageModel.name, true, null);
						SelectionService.selectAndReveal(fragment);
						//} else {
						//	MessageDialog.openError(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(), 
						//			"Error", "Cannot create package, select destination project first!");
						//}
					} catch (JavaModelException exception) {
						exception.printStackTrace();
					}
					return Status.OK_STATUS;
				}
			}.schedule();
		}
	}
}
