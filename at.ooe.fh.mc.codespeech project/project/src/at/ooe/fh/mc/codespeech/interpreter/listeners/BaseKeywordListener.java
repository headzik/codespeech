package at.ooe.fh.mc.codespeech.interpreter.listeners;


import at.ooe.fh.mc.codespeech.interpreter.Command;
import at.ooe.fh.mc.codespeech.interpreter.InterpreterContext;
import at.ooe.fh.mc.codespeech.interpreter.grammar.GrammarBaseListener;
import at.ooe.fh.mc.codespeech.interpreter.grammar.GrammarParser.CancelContext;
import at.ooe.fh.mc.codespeech.interpreter.grammar.GrammarParser.CommandContext;
import at.ooe.fh.mc.codespeech.interpreter.models.Model;
import at.ooe.fh.mc.codespeech.interpreter.operations.Operation;

public abstract class BaseKeywordListener extends GrammarBaseListener {
		
	InterpreterContext context;
	
	BaseKeywordListener(InterpreterContext context) {
		this.context = context;
	}

	@Override
	public void enterCancel(CancelContext ctx) {
		super.enterCancel(ctx);
		
		cancel();
	}
	
	@Override
	public void enterCommand(CommandContext ctx) {
		super.enterCommand(ctx);
		
		context.remainingUtterance = ctx.getText().replace("<EOF>", "");
	}

	
	protected void changeProperty(Object object) {
		Command command = context.getCommand();
		command.setProperty(object);		
	}
	
	protected void changePhrase(String text) {
		Command command = context.getCommand();      
		Object property = command.getProperty();
		if(property instanceof Model) {
			Model model = (Model) command.getProperty();   
			if(model != null) {		
				String phrase = text;            
		        
				if(phrase.isEmpty()) {                                      
					return;                                               
				}   
				
				model.setPhrase(phrase);	
				command.setProperty((Model) model);
			}
		}
	}
	
	protected Object getProperty() {
		return context.getCommand().getProperty();
	}
	
	protected void changeOperation(Operation operation) {
		Command command = context.getCommand();
		command.setOperation(operation);
	}
	
	@Override
	public void exitCommand(CommandContext ctx) {
		super.exitCommand(ctx);
		
		context.finish();
	}
	
	protected void cancel() {
		changeOperation(null);
		changeProperty(null);
		context.finish();
		context.setCurrentListener(new InitialListener(context));
	}
}
