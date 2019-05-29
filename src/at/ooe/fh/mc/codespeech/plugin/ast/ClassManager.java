package at.ooe.fh.mc.codespeech.plugin.ast;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.progress.UIJob;

import at.ooe.fh.mc.codespeech.plugin.utils.ActiveEditorManager;
import at.ooe.fh.mc.codespeech.plugin.utils.SelectionService;

/**
 * Manager responsible for performing operations on classes
 * 
 * @author Lukasz Strzelecki
 */
public class ClassManager {

	/**
	 * Creates new class of the given name in a selected root (package or project).
	 * If no package is selected, the default package is created.
	 * 
	 * @param name name of the new class
	 */
	public void createNewClass(String name) {
		new UIJob("CreateClass") {

			@Override
			public IStatus runInUIThread(IProgressMonitor monitor) {
				ICompilationUnit iCompilationUnit = null;

				try {
					IPackageFragment packageFragment = SelectionService.getSelectedPackage(); 	
					if(packageFragment != null) {

						StringBuffer buffer = new StringBuffer();
						if(!packageFragment.getElementName().isEmpty()) {
							buffer.append("package " + packageFragment.getElementName() + ";\n");
						}
						buffer.append("\n");
						buffer.append("class " + name + " { \n");
						buffer.append("\n");
						buffer.append("}");
						iCompilationUnit = packageFragment.createCompilationUnit(name + ".java", buffer.toString(), false, null);

						ActiveEditorManager.openNewEditor(iCompilationUnit);
					} else {
						MessageDialog.openError(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(), 
								"Error", "Cannot create class, select destination project/package first!");
					}
				} catch(JavaModelException | PartInitException exception) {
					exception.printStackTrace();
				} 
				return Status.OK_STATUS;
			}
		}.schedule();

	}
}

