package at.ooe.fh.mc.codespeech.interpreter.listeners;

import org.eclipse.jdt.core.dom.PrimitiveType;

import at.ooe.fh.mc.codespeech.general.utils.StringUtils;
import at.ooe.fh.mc.codespeech.interpreter.InterpreterContext;
import at.ooe.fh.mc.codespeech.interpreter.grammar.GrammarParser.*;
import at.ooe.fh.mc.codespeech.interpreter.models.VariableModel;
import at.ooe.fh.mc.codespeech.interpreter.operations.creation.CreateVariableOperation;
import at.ooe.fh.mc.codespeech.interpreter.operations.modification.AddConstructorOperation;
import at.ooe.fh.mc.codespeech.interpreter.operations.modification.AddParameterOperation;

public class AdditionListener extends BaseKeywordListener {
	
	AdditionListener(InterpreterContext context) {
		super(context);
	}
	
	@Override
	public void enterConstructorKeyword(ConstructorKeywordContext ctx) {
		super.enterConstructorKeyword(ctx);
		
		changeOperation(new AddConstructorOperation());
	}
	
	@Override
	public void enterSimpleType(SimpleTypeContext ctx) {
		super.enterSimpleType(ctx);
		context.simpleType = StringUtils.toPascalCase(ctx.getText());
	}
	
	@Override
	public void exitVariableType(VariableTypeContext ctx) {
		super.exitVariableType(ctx);

		VariableModel model = new VariableModel();
		model.isPrimitive = context.isPrimitiveType;
		model.type = context.primitiveType;
		model.isFinal = context.isFinal;
		model.isStatic = context.isStatic;
		model.accessModifier = context.accessModifier;
		model.isArray = context.isArray;
		model.simpleType = context.simpleType;
		changeProperty(model);
		changeOperation(new AddParameterOperation());
	}
	
	@Override
	public void enterArrayKeyword(ArrayKeywordContext ctx) {
		super.enterArrayKeyword(ctx);

		context.isArray = true;
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
	public void enterVariableName(VariableNameContext ctx) {
		super.enterVariableName(ctx);
		
		changePhrase(ctx.getText());
	}
	
	@Override
	public void enterArgumentKeyword(ArgumentKeywordContext ctx) {
		super.enterArgumentKeyword(ctx);
		
		context.continueWith(new AddArgumentListener(context));
	}
}