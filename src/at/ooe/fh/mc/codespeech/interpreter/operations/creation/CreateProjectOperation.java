package at.ooe.fh.mc.codespeech.interpreter.operations.creation;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.launching.IVMInstall;
import org.eclipse.jdt.launching.JavaRuntime;
import org.eclipse.jdt.launching.LibraryLocation;
import org.eclipse.ui.progress.UIJob;

import at.ooe.fh.mc.codespeech.interpreter.models.Model;
import at.ooe.fh.mc.codespeech.interpreter.models.ProjectModel;
import at.ooe.fh.mc.codespeech.interpreter.operations.Operation;
import at.ooe.fh.mc.codespeech.plugin.utils.SelectionService;

public class CreateProjectOperation implements Operation {

	@Override
	public void perform(Model model) {	
		if(model instanceof ProjectModel) {
			ProjectModel projectModel = (ProjectModel) model;
			
			new UIJob("CreateProject") {
				
				@Override
				public IStatus runInUIThread(IProgressMonitor monitor) {
					try {
					IProject project = createProject(projectModel.name);		
					setProjectNatureToJava(project);		
					IJavaProject javaProject = JavaCore.create(project); 		
					setOutputLocation(javaProject, project.getFolder("bin"));		
					defineClassPathEntries(javaProject);				
					createAndAddSourceFolder(project, javaProject);
					SelectionService.selectAndReveal(javaProject);
					SelectionService.expandSelectedTreeItems();
					} catch(CoreException exception) {
						exception.printStackTrace();
					}
					return Status.OK_STATUS;
				}
			}.schedule();
		}		
	}

	private IProject createProject(String name) throws CoreException {
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		IProject project = root.getProject(name);
		project.create(null);
		project.open(null);
		return project;
	}

	private void setProjectNatureToJava(IProject project) throws CoreException {
		IProjectDescription description = project.getDescription();
		description.setNatureIds(new String[] { JavaCore.NATURE_ID });		
		project.setDescription(description, null);
	}
	
	private void setOutputLocation(IJavaProject javaProject, IFolder binFolder)
			throws CoreException, JavaModelException {
		binFolder.create(false, true, null);
		javaProject.setOutputLocation(binFolder.getFullPath(), null);
	}

	private void defineClassPathEntries(IJavaProject javaProject) 
			throws JavaModelException {
		List<IClasspathEntry> entries = new ArrayList<IClasspathEntry>();
		IVMInstall vmInstall = JavaRuntime.getDefaultVMInstall();
		LibraryLocation[] locations = JavaRuntime.getLibraryLocations(vmInstall);
		for (LibraryLocation element : locations) {
			entries.add(JavaCore.newLibraryEntry(element.getSystemLibraryPath(), null, null));
		}
		javaProject.setRawClasspath(entries.toArray(new IClasspathEntry[entries.size()]), null);
	}	

	private void createAndAddSourceFolder(IProject project, IJavaProject javaProject)
			throws CoreException, JavaModelException {
		//create src folder
		IFolder sourceFolder = project.getFolder("src");
		sourceFolder.create(false, true, null);
		
		//add source folder to class entries of the project
		IPackageFragmentRoot root = javaProject.getPackageFragmentRoot(sourceFolder);
		IClasspathEntry[] oldEntries = javaProject.getRawClasspath();
		IClasspathEntry[] newEntries = new IClasspathEntry[oldEntries.length + 1];
		System.arraycopy(oldEntries, 0, newEntries, 0, oldEntries.length);
		newEntries[oldEntries.length] = JavaCore.newSourceEntry(root.getPath());
		javaProject.setRawClasspath(newEntries, null);
	}
	
}
