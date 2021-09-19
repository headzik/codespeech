package at.ooe.fh.mc.codespeech.interpreter.listeners;

import at.ooe.fh.mc.codespeech.interpreter.InterpreterContext;
import at.ooe.fh.mc.codespeech.interpreter.grammar.GrammarParser.InitializationContext;
import at.ooe.fh.mc.codespeech.interpreter.grammar.GrammarParser.PhraseContext;
import at.ooe.fh.mc.codespeech.interpreter.models.VariableModel;
import at.ooe.fh.mc.codespeech.interpreter.operations.modification.InitializeVariableOperation;

//modification ?
public class InitializationListener extends BaseKeywordListener {
	
	InitializationListener(InterpreterContext context) {
		super(context);
	}
		
	@Override
	public void enterPhrase(PhraseContext ctx) {
		super.enterPhrase(ctx);

		//change to string ?
		VariableModel model = new VariableModel();
		model.initializator = ctx.getText().trim();
		
		changeProperty(model);

	}

	@Override

	public void exitInitialization(InitializationContext ctx) {
		super.exitInitialization(ctx);
		
		changeOperation(new InitializeVariableOperation());
		
		//context.finish();
	}

}
