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
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.widgets.TreeItem;
import org.eclipse.ui.ISelectionService;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;

/*
 * Class responsible for managing Package Explorer selection
 * *
 * @author Lukasz Strzelecki
 *
 */
public class PackageExplorerManager {
	
	/**
	 * Selection service of the current workbench
	 */
//	private  ISelectionService selectionService =     
//			PlatformUI.getWorkbench().getActiveWorkbenchWindow().getSelectionService(); 

	/**
	 * Selects and reveals given element in the Package explorer 
	 * 
	 * @param element element to select
	 */
	public static void selectAndReveal(IJavaElement element) {
		IWorkbenchPart activePart = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().findView(JavaUI.ID_PACKAGES);

		if(activePart instanceof IPackagesViewPart) {
			((IPackagesViewPart) activePart).selectAndReveal(element);
		}
	}
	
	/**
	 * Expands the current node in Package Explorer
	 */
	public static void expandSelectedTreeItems() {
		IWorkbenchPart activePart = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().findView(JavaUI.ID_PACKAGES);

		if(activePart instanceof IPackagesViewPart) {
			TreeViewer treeViewer = ((IPackagesViewPart) activePart).getTreeViewer();
			TreeItem [] selections = treeViewer.getTree().getSelection();
			
			for(int i = 0; i < selections.length; i++) {
				treeViewer.expandToLevel(selections[i].getData(), 1);
			}
		} 
		
	}
	
	public static IJavaElement getSelectedElement() {	
		
		ISelection selection = getSelectionService().getSelection(JavaUI.ID_PACKAGES);
	
		if(selection instanceof IStructuredSelection) {    
			Object element = ((IStructuredSelection)selection).getFirstElement();
			return (IJavaElement) element;
		}
		
		return null;
	}
	
	private static ISelectionService getSelectionService() {
		return PlatformUI.getWorkbench().getActiveWorkbenchWindow().getSelectionService();
	}
	
	/**
	 *  Returns the root of selected package
	 *  
	 * @return root of selected package
	 * @throws JavaModelException if no package is selected
	 */
	public static IPackageFragmentRoot getSelectedPackageFragmentRoot() throws JavaModelException {
		IPackageFragmentRoot packageFragmentRoot = null;
		
		ISelection selection = getSelectionService().getSelection(JavaUI.ID_PACKAGES);
		//for project explorer
//		if(selection == null) {
//			selection = PackageExplorerManager.getSelection("org.eclipse.ui.navigator.ProjectExplorer");
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

		ISelection selection = getSelectionService().getSelection(JavaUI.ID_PACKAGES);
		
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

		ISelection selection = getSelectionService().getSelection(JavaUI.ID_PACKAGES); 

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
	

	public static void reveal(Object element) {
		IWorkbenchPart activePart = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().findView(JavaUI.ID_PACKAGES);		

		if(activePart instanceof IPackagesViewPart) {
			TreeViewer treeViewer = ((IPackagesViewPart) activePart).getTreeViewer();
			selectAndReveal(treeViewer, element);
		}
	}

	public static void reveal(String name) {
		IWorkbenchPart activePart = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().findView(JavaUI.ID_PACKAGES);

		if(activePart instanceof IPackagesViewPart) {
			TreeViewer treeViewer = ((IPackagesViewPart) activePart).getTreeViewer();

			// TODO: think of something better
			TreeItem [] items = treeViewer.getTree().getItems();
			for(int i = 0; i < items.length; i++) {
				if(items[i].getText().equals(name)) {
					selectAndReveal(treeViewer, items[i].getData());
					TreeItem [] children = items[i].getItems();
					for(int j = 0; j < children.length; j++) {
						if(children[j].getText().equals("src")) {
							treeViewer.expandToLevel(children[j].getData(), 1);
						}
					}
					break;
				}
			}
		}
	}

	private static void selectAndReveal(TreeViewer treeViewer, Object element) {
		treeViewer.expandToLevel(element, 1);
		treeViewer.setSelection(new StructuredSelection(element));
	}
}
