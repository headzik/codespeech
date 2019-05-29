package at.ooe.fh.mc.codespeech.plugin.utils;

import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.ui.IPackagesViewPart;
import org.eclipse.jdt.ui.JavaUI;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.widgets.TreeItem;
import org.eclipse.ui.ISelectionService;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;

/*
 * Class responsible for managing Package Explorer selection
 * *
 * @author Lukasz Strzelecki
 *
 */
public class SelectionService {
	
	/**
	 * Selection service of the current workbench
	 */
	private static ISelectionService selectionService =     
			PlatformUI.getWorkbench().getActiveWorkbenchWindow().getSelectionService(); 

	/**
	 * Selects and reveals given element in the Package explorer 
	 * 
	 * @param element element to select
	 */
	public static void selectAndReveal(IJavaElement element) {
		IWorkbenchPart activePart = PlatformUI.getWorkbench().getActiveWorkbenchWindow()
				.getActivePage().getActivePart();
		
		if(activePart instanceof IPackagesViewPart) {
			((IPackagesViewPart) activePart).selectAndReveal(element);
		}
	}
	
	/**
	 * Expands the current node in Package Explorer
	 */
	public static void expandSelectedTreeItems() {
		IWorkbenchPart activePart = PlatformUI.getWorkbench().getActiveWorkbenchWindow()
				.getActivePage().getActivePart();

		if(activePart instanceof IPackagesViewPart) {
			TreeViewer treeViewer = ((IPackagesViewPart) activePart).getTreeViewer();
			TreeItem [] selections = treeViewer.getTree().getSelection();
			
			for(int i = 0; i < selections.length; i++) {
				treeViewer.expandToLevel(selections[i].getData(), 1);
			}
		}
		
	}
	
	/**
	 *  Returns the root of selected package
	 *  
	 * @return root of selected package
	 * @throws JavaModelException if no package is selected
	 */
	public static IPackageFragmentRoot getSelectedPackageFragmentRoot() throws JavaModelException {
		IPackageFragmentRoot packageFragmentRoot = null;
		
		ISelection selection = selectionService.getSelection(JavaUI.ID_PACKAGES);
		//for project explorer
//		if(selection == null) {
//			selection = selectionService.getSelection("org.eclipse.ui.navigator.ProjectExplorer");
//		}
	
		if(selection instanceof IStructuredSelection) {    
			Object element = ((IStructuredSelection)selection).getFirstElement();    
			if(element instanceof ICompilationUnit) {
				IJavaElement parent = ((ICompilationUnit) element).getParent();
				if(parent != null) {
					if(parent instanceof IPackageFragment) {
						packageFragmentRoot = (IPackageFragmentRoot)((IPackageFragment) parent).getParent();
					}
				} 
			} else if(element instanceof IPackageFragment) {
				packageFragmentRoot = (IPackageFragmentRoot)((IPackageFragment) element).getParent();
			} else if(element instanceof IPackageFragmentRoot) {
				packageFragmentRoot = (IPackageFragmentRoot) element;
			} else if (element instanceof IJavaProject) {
				IPackageFragmentRoot [] packageFragmentRoots = ((IJavaProject) element).getAllPackageFragmentRoots();
				//for project explorer
				//IPackageFragmentRoot [] packageFragmentRoots = JavaCore.create((IProject) element).getAllPackageFragmentRoots();
				for(int i = 0; i < packageFragmentRoots.length; i++) {
					if(packageFragmentRoots[i].getElementName().equals("src")) {
						packageFragmentRoot = packageFragmentRoots[i];
						break;
					}
				}

			}
		}

		return packageFragmentRoot;
	}

	/**
	 * Returns project selected in the Package Explorer
	 * 
	 * @return selected project IJavaProject
	 * @throws JavaModelException if no project is selected
	 */
	public static IJavaProject getSelectedProject() throws JavaModelException {
		IJavaProject project = null;

		ISelection selection = selectionService.getSelection(JavaUI.ID_PACKAGES);
		
		if(selection instanceof IStructuredSelection) {    
			Object element = ((IStructuredSelection)selection).getFirstElement();   
			if(element instanceof IJavaElement) {
				project = ((IJavaElement) element).getJavaProject();
			}
		}

		return project;
	}

	/**
	 * Returns package selected in the Package Explorer
	 * 
	 * @return selected package IPackageFragment
	 * @throws JavaModelException if no package is selected
	 */
	public static IPackageFragment getSelectedPackage() throws JavaModelException {
		IPackageFragment packageFragment = null;   

		ISelection selection = selectionService.getSelection(JavaUI.ID_PACKAGES); 

		if(selection instanceof IStructuredSelection) {    
			Object element = ((IStructuredSelection)selection).getFirstElement();    
			if(element instanceof ICompilationUnit) {
				IJavaElement parent = ((ICompilationUnit) element).getParent();
				if(parent != null) {
					if(parent instanceof IPackageFragment) {
						packageFragment = (IPackageFragment) parent;
					}
				} 
			} else if(element instanceof IPackageFragment) {
				packageFragment = (IPackageFragment) element;
			} else if(element instanceof IPackageFragmentRoot) {
				IPackageFragmentRoot packageFragmentRoot = (IPackageFragmentRoot) element;
				packageFragment = (IPackageFragment) packageFragmentRoot.getChildren()[0];
			} else if (element instanceof IJavaProject) {
				IPackageFragmentRoot [] packageFragmentRoots = ((IJavaProject) element).getAllPackageFragmentRoots();
				for(int i = 0; i < packageFragmentRoots.length; i++) {
					if(packageFragmentRoots[i].getElementName().equals("src")) {
						packageFragment = (IPackageFragment) packageFragmentRoots[i].getChildren()[0];
						break;
					}
				}

			}
		}
		return packageFragment;
	}
}
