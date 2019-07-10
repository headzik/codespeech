package at.ooe.fh.mc.codespeech.interpreter.listeners;

import at.ooe.fh.mc.codespeech.general.utils.StringUtils;
import at.ooe.fh.mc.codespeech.interpreter.InterpreterContext;
import at.ooe.fh.mc.codespeech.interpreter.grammar.GrammarParser.LineNavigationContext;
import at.ooe.fh.mc.codespeech.interpreter.grammar.GrammarParser.NumberContext;
import at.ooe.fh.mc.codespeech.interpreter.grammar.GrammarParser.PhraseContext;
import at.ooe.fh.mc.codespeech.interpreter.operations.navigation.LineNavigationOperation;

public class NavigationListener extends BaseKeywordListener {

	NavigationListener(InterpreterContext context) {
		super(context);
	}

	@Override
	public void enterLineNavigation(LineNavigationContext ctx) {
		super.enterLineNavigation(ctx);
		
		changeOperation(new LineNavigationOperation());
	}
		
	@Override
	public void enterPhrase(PhraseContext ctx) {
		super.enterPhrase(ctx);

		String text = ctx.getText().trim();
		int lineNumber = StringUtils.getNumber((text)) - 1;
		
		changeProperty(lineNumber);

	}

}
