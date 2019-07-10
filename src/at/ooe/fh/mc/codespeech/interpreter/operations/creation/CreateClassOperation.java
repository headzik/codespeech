package at.ooe.fh.mc.codespeech.interpreter.operations.creation;

import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;

import at.ooe.fh.mc.codespeech.interpreter.models.ClassModel;
import at.ooe.fh.mc.codespeech.interpreter.operations.Operation;
import at.ooe.fh.mc.codespeech.plugin.utils.EditorManager;
import at.ooe.fh.mc.codespeech.plugin.utils.PackageExplorerManager;

public class CreateClassOperation implements Operation {

	@Override
	public void perform(Object property) {
		if(property instanceof ClassModel) {
			ClassModel classModel = (ClassModel) property;

			ICompilationUnit iCompilationUnit = null;

			try {
				IPackageFragment packageFragment = PackageExplorerManager.getSelectedPackage(); 	
				if(packageFragment != null) {

					StringBuffer buffer = new StringBuffer();
					if(!packageFragment.getElementName().isEmpty()) {
						buffer.append("package " + packageFragment.getElementName() + ";\n");
					}
					buffer.append("\n");
					if(classModel.isPublic) {
						buffer.append("public ");
					}
					if(classModel.isAbstract) {
						buffer.append("abstract ");
					} else if(classModel.isFinal) {
						buffer.append("final ");
					}

					if(classModel.isInterface) {
						buffer.append("interface ");
					} else {
						buffer.append("class ");
					}

					buffer.append(classModel.name + " { \n");
					buffer.append("\n");
					buffer.append("}");
					iCompilationUnit = packageFragment.createCompilationUnit(classModel.name + ".java", buffer.toString(), false, null);
								
					EditorManager.openNewEditor(iCompilationUnit);

				} else {
					MessageDialog.openError(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(), 
							"Error", "Cannot create class, select destination project/package first!");
				}
			} catch(JavaModelException | PartInitException exception) {
				exception.printStackTrace();
			} 
		}
	}

}
