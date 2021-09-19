package at.ooe.fh.mc.codespeech.interpreter.operations.navigation;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IMember;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.core.search.IJavaSearchConstants;
import org.eclipse.jdt.core.search.IJavaSearchScope;
import org.eclipse.jdt.core.search.SearchEngine;
import org.eclipse.jdt.core.search.SearchMatch;
import org.eclipse.jdt.core.search.SearchPattern;
import org.eclipse.jdt.core.search.SearchRequestor;

import at.ooe.fh.mc.codespeech.interpreter.models.ClassModel;
import at.ooe.fh.mc.codespeech.interpreter.operations.Operation;
import at.ooe.fh.mc.codespeech.plugin.utils.EditorManager;
import at.ooe.fh.mc.codespeech.plugin.utils.PackageExplorerManager;
import at.ooe.fh.mc.codespeech.plugin.utils.Searcher;

public class SelectAndOpenClassFileOperation implements Operation {

	@Override
	public void perform(Object property) {
		if(property instanceof ClassModel) {
			ClassModel classModel = (ClassModel) property;
			
			SearchPattern pattern = SearchPattern.createPattern(
					classModel.getPhrase(), IJavaSearchConstants.CLASS_AND_INTERFACE, 
					IJavaSearchConstants.DECLARATIONS, 
					SearchPattern.R_EXACT_MATCH);

			SearchRequestor requestor = new SearchRequestor() {

				@Override
				public void acceptSearchMatch(SearchMatch match) throws CoreException {	
					
					PackageExplorerManager.reveal(match.getElement());

					IMember element = (IMember) match.getElement();
					EditorManager.openNewEditor(element.getCompilationUnit());
				}
			};


			IJavaSearchScope scope;
			try {
				scope = SearchEngine.createJavaSearchScope(new IJavaElement[] {PackageExplorerManager.getSelectedProject()});
				Searcher.search(pattern, requestor, scope);
			} catch (JavaModelException e) {
				e.printStackTrace();
			} 
			
		}
	}
	
}
