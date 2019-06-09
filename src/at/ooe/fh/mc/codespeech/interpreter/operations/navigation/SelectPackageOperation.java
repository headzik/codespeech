package at.ooe.fh.mc.codespeech.interpreter.operations.navigation;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.core.search.IJavaSearchConstants;
import org.eclipse.jdt.core.search.IJavaSearchScope;
import org.eclipse.jdt.core.search.SearchEngine;
import org.eclipse.jdt.core.search.SearchMatch;
import org.eclipse.jdt.core.search.SearchPattern;
import org.eclipse.jdt.core.search.SearchRequestor;

import at.ooe.fh.mc.codespeech.interpreter.Searcher;
import at.ooe.fh.mc.codespeech.interpreter.models.WithPhrase;
import at.ooe.fh.mc.codespeech.interpreter.operations.Operation;
import at.ooe.fh.mc.codespeech.plugin.utils.SelectionService;
import at.ooe.fh.mc.codespeech.plugin.utils.UIManager;

public class SelectPackageOperation implements Operation {

	@Override
	public void perform(Object property) {

		if(property instanceof WithPhrase) {
			SearchPattern pattern = SearchPattern.createPattern(
					((WithPhrase) property).getPhrase(), IJavaSearchConstants.PACKAGE, 
					IJavaSearchConstants.DECLARATIONS, 
					SearchPattern.R_EXACT_MATCH);

			SearchRequestor requestor = new SearchRequestor() {

				@Override
				public void acceptSearchMatch(SearchMatch match) throws CoreException {
					UIManager.revealInPackageExplorer(match.getElement());
				}
			};

			IJavaSearchScope scope = SearchEngine.createWorkspaceScope();
			Searcher.search(pattern, requestor, scope);
		}
	}

}
