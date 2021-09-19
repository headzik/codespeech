package at.ooe.fh.mc.codespeech.interpreter.listeners;

import org.eclipse.jdt.core.dom.PrimitiveType;

import at.ooe.fh.mc.codespeech.interpreter.InterpreterContext;
import at.ooe.fh.mc.codespeech.interpreter.grammar.GrammarParser.BooleanKeywordContext;
import at.ooe.fh.mc.codespeech.interpreter.grammar.GrammarParser.ByteKeywordContext;
import at.ooe.fh.mc.codespeech.interpreter.grammar.GrammarParser.ChangeReturnTypeContext;
import at.ooe.fh.mc.codespeech.interpreter.grammar.GrammarParser.CharKeywordContext;
import at.ooe.fh.mc.codespeech.interpreter.grammar.GrammarParser.DoubleKeywordContext;
import at.ooe.fh.mc.codespeech.interpreter.grammar.GrammarParser.FloatKeywordContext;
import at.ooe.fh.mc.codespeech.interpreter.grammar.GrammarParser.IntegerKeywordContext;
import at.ooe.fh.mc.codespeech.interpreter.grammar.GrammarParser.PhraseContext;
import at.ooe.fh.mc.codespeech.interpreter.grammar.GrammarParser.PrimitiveTypeContext;
import at.ooe.fh.mc.codespeech.interpreter.grammar.GrammarParser.ShortKeywordContext;
import at.ooe.fh.mc.codespeech.interpreter.grammar.GrammarParser.SimpleTypeContext;
import at.ooe.fh.mc.codespeech.interpreter.grammar.GrammarParser.VoidKeywordContext;
import at.ooe.fh.mc.codespeech.interpreter.models.MethodModel;
import at.ooe.fh.mc.codespeech.interpreter.operations.modification.ChangeReturnTypeOperation;

public class ChangeReturnTypeKeywordListener extends BaseKeywordListener {

	ChangeReturnTypeKeywordListener(InterpreterContext context) {
		super(context);
	}
	
	@Override
	public void exitChangeReturnType(ChangeReturnTypeContext ctx) {
		super.exitChangeReturnType(ctx);
		
		MethodModel model = new MethodModel();
		model.isPrimitive = context.isPrimitiveType;
		model.primitiveType = context.primitiveType;
		model.simpleType = context.simpleType;
		changeProperty(model);
		changeOperation(new ChangeReturnTypeOperation());
		
		//context.finish();
	}
	
	@Override
	public void enterSimpleType(SimpleTypeContext ctx) {
		super.enterSimpleType(ctx);
		
		context.simpleType = ctx.getText();
	}
	
	@Override
	public void enterPrimitiveType(PrimitiveTypeContext ctx) {
		super.enterPrimitiveType(ctx);
		
		context.isPrimitiveType = true;
	}
	
	@Override
	public void enterIntegerKeyword(IntegerKeywordContext ctx) {
		super.enterIntegerKeyword(ctx);
		
		context.primitiveType = PrimitiveType.INT;
	}
	
	@Override
	public void enterBooleanKeyword(BooleanKeywordContext ctx) {
		super.enterBooleanKeyword(ctx);		

		context.primitiveType = PrimitiveType.BOOLEAN;
	}
	
	@Override
	public void enterFloatKeyword(FloatKeywordContext ctx) {
		super.enterFloatKeyword(ctx);

		context.primitiveType = PrimitiveType.FLOAT;
	}
	
	@Override
	public void enterCharKeyword(CharKeywordContext ctx) {
		super.enterCharKeyword(ctx);

		context.primitiveType = PrimitiveType.CHAR;
	}
	
	@Override
	public void enterByteKeyword(ByteKeywordContext ctx) {
		super.enterByteKeyword(ctx);

		context.primitiveType = PrimitiveType.BYTE;
	}
	
	@Override
	public void enterDoubleKeyword(DoubleKeywordContext ctx) {
		super.enterDoubleKeyword(ctx);

		context.primitiveType = PrimitiveType.DOUBLE;
	}
	
	@Override
	public void enterVoidKeyword(VoidKeywordContext ctx) {
		super.enterVoidKeyword(ctx);

		context.primitiveType = PrimitiveType.VOID;
	}
	
	@Override
	public void enterShortKeyword(ShortKeywordContext ctx) {
		super.enterShortKeyword(ctx);
		
		context.primitiveType = PrimitiveType.SHORT;
	}
	
	@Override
	public void enterPhrase(PhraseContext ctx) {
		super.enterPhrase(ctx);
		
		context.simpleType = ctx.getText();
	}

}
