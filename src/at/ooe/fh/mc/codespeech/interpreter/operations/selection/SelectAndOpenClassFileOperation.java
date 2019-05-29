package at.ooe.fh.mc.codespeech.interpreter.operations.selection;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.jdt.core.IMember;
import org.eclipse.jdt.core.search.IJavaSearchConstants;
import org.eclipse.jdt.core.search.SearchMatch;
import org.eclipse.jdt.core.search.SearchPattern;
import org.eclipse.jdt.core.search.SearchRequestor;

import at.ooe.fh.mc.codespeech.interpreter.Searcher;
import at.ooe.fh.mc.codespeech.interpreter.models.Model;
import at.ooe.fh.mc.codespeech.interpreter.models.WithPhrase;
import at.ooe.fh.mc.codespeech.interpreter.operations.Operation;
import at.ooe.fh.mc.codespeech.plugin.utils.UIManager;

public class SelectAndOpenClassFileOperation implements Operation {

	@Override
	public void perform(Model model) {
		if(model instanceof WithPhrase) {
			WithPhrase nameableModel = (WithPhrase) model;

			SearchPattern pattern = SearchPattern.createPattern(
					nameableModel.getPhrase(), IJavaSearchConstants.CLASS, 
					IJavaSearchConstants.DECLARATIONS, 
					SearchPattern.R_EXACT_MATCH);

			SearchRequestor requestor = new SearchRequestor() {

				@Override
				public void acceptSearchMatch(SearchMatch match) throws CoreException {	
					UIManager.revealInPackageExplorer(match.getElement());

					IMember element = (IMember) match.getElement();
					UIManager.openNewEditor(element.getCompilationUnit());
				}
			};

			Searcher.search(pattern, requestor);
		}
	}
}
