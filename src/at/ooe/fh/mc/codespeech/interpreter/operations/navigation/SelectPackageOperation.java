package at.ooe.fh.mc.codespeech.interpreter.operations.navigation;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.core.search.IJavaSearchConstants;
import org.eclipse.jdt.core.search.IJavaSearchScope;
import org.eclipse.jdt.core.search.SearchEngine;
import org.eclipse.jdt.core.search.SearchMatch;
import org.eclipse.jdt.core.search.SearchPattern;
import org.eclipse.jdt.core.search.SearchRequestor;
import org.eclipse.jdt.internal.core.PackageFragmentRoot;

import at.ooe.fh.mc.codespeech.interpreter.models.PackageModel;
import at.ooe.fh.mc.codespeech.interpreter.operations.Operation;
import at.ooe.fh.mc.codespeech.plugin.utils.PackageExplorerManager;
import at.ooe.fh.mc.codespeech.plugin.utils.Searcher;

public class SelectPackageOperation implements Operation {

	@Override
	public void perform(Object property) throws JavaModelException {

		if(property instanceof PackageModel) {
			PackageModel packageModel = (PackageModel) property;
			
			String packageName = "*" + packageModel.getPhrase();
			
			SearchPattern pattern = SearchPattern.createPattern(
					packageName, IJavaSearchConstants.PACKAGE, 
					IJavaSearchConstants.DECLARATIONS, 
					SearchPattern.R_PATTERN_MATCH);

			SearchRequestor requestor = new SearchRequestor() {

				@Override
				public void acceptSearchMatch(SearchMatch match) throws CoreException {
					PackageExplorerManager.reveal(match.getElement());
				}
			};
			
			IPackageFragmentRoot packageFragmentRoot;
			IPackageFragmentRoot [] packageFragmentRoots = PackageExplorerManager.getSelectedProject().getAllPackageFragmentRoots();
			for(int i = 0; i < packageFragmentRoots.length; i++) {
				if(packageFragmentRoots[i].getElementName().equals("src")) {
					packageFragmentRoot = packageFragmentRoots[i];

					IJavaSearchScope scope = SearchEngine.createJavaSearchScope(new IJavaElement[] {packageFragmentRoot});						
					Searcher.search(pattern, requestor, scope);
					
					break;
				}
			}
		}
	}

}
