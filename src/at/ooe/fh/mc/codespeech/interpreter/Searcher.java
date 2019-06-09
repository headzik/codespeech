package at.ooe.fh.mc.codespeech.interpreter;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.jdt.core.search.IJavaSearchScope;
import org.eclipse.jdt.core.search.SearchEngine;
import org.eclipse.jdt.core.search.SearchParticipant;
import org.eclipse.jdt.core.search.SearchPattern;
import org.eclipse.jdt.core.search.SearchRequestor;

public class Searcher {

	public static void search(SearchPattern pattern,
						  	  SearchRequestor requestor,
						  	  IJavaSearchScope scope) {
		
		SearchEngine searchEngine = new SearchEngine();
		try {
			searchEngine.search(pattern, new SearchParticipant[] {
					SearchEngine.getDefaultSearchParticipant()}, scope, requestor, null);
		} catch (CoreException e) {
			e.printStackTrace();
		}
	}
}
