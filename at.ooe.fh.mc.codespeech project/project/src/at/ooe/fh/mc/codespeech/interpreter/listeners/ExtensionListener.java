package at.ooe.fh.mc.codespeech.interpreter.listeners;

import at.ooe.fh.mc.codespeech.general.utils.StringUtils;
import at.ooe.fh.mc.codespeech.interpreter.InterpreterContext;
import at.ooe.fh.mc.codespeech.interpreter.grammar.GrammarParser.PhraseContext;
import at.ooe.fh.mc.codespeech.interpreter.operations.modification.ExtensionOperation;

public class ExtensionListener extends BaseKeywordListener {

	ExtensionListener(InterpreterContext context) {
		super(context);	
	}

	@Override
	public void enterPhrase(PhraseContext ctx) {
		super.enterPhrase(ctx);
		
		changeProperty(StringUtils.toPascalCase(ctx.getText()));
		changeOperation(new ExtensionOperation());
	}
}
