//package at.ooe.fh.mc.codespeech.interpreter.listeners;
//
//import org.apache.commons.lang3.text.WordUtils;
//
//import at.ooe.fh.mc.codespeech.interpreter.Command;
//import at.ooe.fh.mc.codespeech.interpreter.InterpreterContext;
//import at.ooe.fh.mc.codespeech.interpreter.GrammarParser.NameKeywordContext;
//import at.ooe.fh.mc.codespeech.interpreter.models.Model;
//import at.ooe.fh.mc.codespeech.interpreter.models.Nameable;
//
//public class NameKeywordListener extends BaseKeywordListener {
//	
//	public NameKeywordListener(InterpreterContext context) {
//		super(context);
//	}
//
////	@Override
////	public void enterNameKeyword(NameKeywordContext ctx) {
////		super.enterNameKeyword(ctx);		
////			
////		String name = context.getRemainingUtterance();
////		
////		if(name.isEmpty()) {
////			return;
////		}
////		
////		name = WordUtils.capitalize(name);
////		name = name.replace(" ", "");	
////		
////		Command command = context.getCommand();
////		Nameable model = (Nameable) command.getModel();
////		model.setName(name);		
////		command.setModel((Model) model);
////			
////		context.setCommand(command);
////		context.setCurrentListener(new InitialListener(context));
////	}
//	
//}
