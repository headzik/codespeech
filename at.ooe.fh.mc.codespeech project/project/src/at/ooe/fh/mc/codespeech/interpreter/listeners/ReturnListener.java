package at.ooe.fh.mc.codespeech.interpreter.listeners;

import at.ooe.fh.mc.codespeech.interpreter.InterpreterContext;
import at.ooe.fh.mc.codespeech.interpreter.grammar.GrammarParser.PhraseContext;
import at.ooe.fh.mc.codespeech.interpreter.grammar.GrammarParser.ReturnStatementContext;
import at.ooe.fh.mc.codespeech.interpreter.operations.modification.ReturnOperation;

public class ReturnListener extends BaseKeywordListener {

	ReturnListener(InterpreterContext context) {
		super(context);
	}

	@Override
	public void enterReturnStatement(ReturnStatementContext ctx) {
		changeOperation(new ReturnOperation());
		
		super.enterReturnStatement(ctx);
	}

	@Override
	public void enterPhrase(PhraseContext ctx) {
		changeProperty(ctx.getText());
		
		super.enterPhrase(ctx);
	}
	
}
