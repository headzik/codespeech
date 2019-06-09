package at.ooe.fh.mc.codespeech.interpreter.listeners;

import at.ooe.fh.mc.codespeech.interpreter.InterpreterContext;
import at.ooe.fh.mc.codespeech.interpreter.GrammarParser.AdditionContext;
import at.ooe.fh.mc.codespeech.interpreter.GrammarParser.ArrayKeywordContext;
import at.ooe.fh.mc.codespeech.interpreter.GrammarParser.ConstructorKeywordContext;
import at.ooe.fh.mc.codespeech.interpreter.GrammarParser.VariableNameContext;
import at.ooe.fh.mc.codespeech.interpreter.GrammarParser.VariableTypeContext;
import at.ooe.fh.mc.codespeech.interpreter.operations.modification.AddConstructorOperation;

public class AdditionListener extends BaseKeywordListener {

	int number;
	
	AdditionListener(InterpreterContext context) {
		super(context);
	}
	
	@Override
	public void enterConstructorKeyword(ConstructorKeywordContext ctx) {
		super.enterConstructorKeyword(ctx);
		
		changeOperation(new AddConstructorOperation());
	}
	
	@Override
	public void enterAddition(AdditionContext ctx) {
		// TODO Auto-generated method stub
		super.enterAddition(ctx);
		
		String s = ctx.getText();
	}
	
	@Override
	public void enterVariableType(VariableTypeContext ctx) {
		super.enterVariableType(ctx);		

		String s = ctx.getText();
	}
	
	@Override
	public void enterVariableName(VariableNameContext ctx) {
		// TODO Auto-generated method stub
		super.enterVariableName(ctx);
		String s = ctx.getText();
	}
	
	@Override
	public void enterArrayKeyword(ArrayKeywordContext ctx) {
		// TODO Auto-generated method stub
		super.enterArrayKeyword(ctx);

		String s = ctx.getText();
	}
}