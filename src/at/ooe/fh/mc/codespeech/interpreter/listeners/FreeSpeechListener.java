package at.ooe.fh.mc.codespeech.interpreter.listeners;

import at.ooe.fh.mc.codespeech.interpreter.InterpreterContext;
import at.ooe.fh.mc.codespeech.interpreter.grammar.GrammarParser.PhraseContext;
import at.ooe.fh.mc.codespeech.interpreter.grammar.GrammarParser.StopfreespeechContext;
import at.ooe.fh.mc.codespeech.interpreter.grammar.GrammarParser.UndoContext;
import at.ooe.fh.mc.codespeech.interpreter.operations.modification.FreeSpeechOperation;
import at.ooe.fh.mc.codespeech.interpreter.operations.modification.UndoOperation;

public class FreeSpeechListener extends BaseKeywordListener {

	FreeSpeechListener(InterpreterContext context) {
		super(context);
	}
	
	@Override
	public void enterPhrase(PhraseContext ctx) {
		super.enterPhrase(ctx);

		changeProperty(ctx.getText());
		changeOperation(new FreeSpeechOperation());
	}
	
	@Override
	public void enterStopfreespeech(StopfreespeechContext ctx) {
		super.enterStopfreespeech(ctx);

		changeProperty(null);
		changeOperation(null);
		context.continueWith(new InitialListener(context));
	}

	@Override
	public void enterUndo(UndoContext ctx) {
		changeOperation(new UndoOperation());
		
		super.enterUndo(ctx);
	}
}
