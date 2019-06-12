package at.ooe.fh.mc.codespeech.interpreter.listeners;

import at.ooe.fh.mc.codespeech.interpreter.InterpreterContext;
import at.ooe.fh.mc.codespeech.interpreter.GrammarParser.PhraseContext;
import at.ooe.fh.mc.codespeech.interpreter.GrammarParser.StopfreespeechContext;
import at.ooe.fh.mc.codespeech.interpreter.operations.modification.FreeSpeechOperation;

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
		// TODO Auto-generated method stub
		super.enterStopfreespeech(ctx);
		
		context.continueWith(new InitialListener(context));
	}

}
