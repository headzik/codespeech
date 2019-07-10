package at.ooe.fh.mc.codespeech.interpreter.operations.modification;

import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.JavaModelException;

import at.ooe.fh.mc.codespeech.interpreter.operations.Operation;
import at.ooe.fh.mc.codespeech.plugin.utils.PackageExplorerManager;

public class DeleteTypeOrPackageOperation implements Operation {

	@Override
	public void perform(Object property) {
		IJavaElement selectedElement = PackageExplorerManager.getSelectedElement();
		if(selectedElement != null) {

			try {
				selectedElement.getJavaModel().delete(new IJavaElement [] {selectedElement}, true, null);
			} catch (JavaModelException e) {
				e.printStackTrace();
			}
		}
	}

}
