package at.ooe.fh.mc.codespeech.interpreter.operations.modification;

import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jdt.core.IJavaElement;

import at.ooe.fh.mc.codespeech.interpreter.operations.Operation;
import at.ooe.fh.mc.codespeech.plugin.utils.PackageExplorerManager;

public class DeleteProjectOperation implements Operation {

	@Override
	public void perform(Object property) {

		try {

			IJavaElement selectedElement = PackageExplorerManager.getSelectedProject();
			if(selectedElement != null) {
				IWorkspace myWorkspace = ResourcesPlugin.getWorkspace();
				IWorkspaceRoot myWorkspaceRoot = myWorkspace.getRoot();
				myWorkspaceRoot.getProject(selectedElement.getElementName()).delete(true, null);
			}
		} catch (CoreException e) {
			e.printStackTrace();
		}
	}

}
