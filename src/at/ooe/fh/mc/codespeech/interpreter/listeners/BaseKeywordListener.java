package at.ooe.fh.mc.codespeech.interpreter.listeners;


import at.ooe.fh.mc.codespeech.interpreter.Command;
import at.ooe.fh.mc.codespeech.interpreter.GrammarBaseListener;
//import at.ooe.fh.mc.codespeech.interpreter.GrammarParser.CancelContext;
import at.ooe.fh.mc.codespeech.interpreter.InterpreterContext;
import at.ooe.fh.mc.codespeech.interpreter.GrammarParser.CancelContext;
import at.ooe.fh.mc.codespeech.interpreter.GrammarParser.CommandContext;
import at.ooe.fh.mc.codespeech.interpreter.models.Model;
import at.ooe.fh.mc.codespeech.interpreter.models.WithPhrase;
import at.ooe.fh.mc.codespeech.interpreter.operations.Operation;

public abstract class BaseKeywordListener extends GrammarBaseListener {
		
	InterpreterContext context;
	
	BaseKeywordListener(InterpreterContext context) {
		this.context = context;
	}

	@Override
	public void enterCancel(CancelContext ctx) {
		super.enterCancel(ctx);
				
		context.setCurrentListener(new InitialListener(context));
	}
	
	@Override
	public void enterCommand(CommandContext ctx) {
		super.enterCommand(ctx);
		
		context.remainingUtterance = ctx.getText().replace("<EOF>", "");
	}

	
	protected void changeModel(Model model) {
		Command command = context.getCommand();
		command.setModel(model);		
	}
	
	protected void changePhrase(String text) {
		Command command = context.getCommand();                   
		WithPhrase model = (WithPhrase) command.getModel();   
		if(model != null) {		
			String phrase = text;            
	        
			if(phrase.isEmpty()) {                                      
				return;                                               
			}   
			
			model.setPhrase(phrase);	
			command.setModel((Model) model);
		}
	}
	
	protected Model getModel() {
		return context.getCommand().getModel();
	}
	
	protected void changeOperation(Operation operation) {
		Command command = context.getCommand();
		command.setOperation(operation);
	}
	
	
//	private void storeRemainingUtterance(ParserRuleContext ctx) {
//		Token stop = ctx.getStop();
//		if(stop == null) return;
//		
//		CharStream stream = stop.getInputStream();
//		context.remainingUtterance = stream.getText(new Interval(stop.getStopIndex() + 1, stream.size())).trim();		
//	}
	
}
