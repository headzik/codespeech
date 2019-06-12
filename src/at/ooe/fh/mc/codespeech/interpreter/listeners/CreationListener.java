package at.ooe.fh.mc.codespeech.interpreter.listeners;

import org.eclipse.jdt.core.dom.PrimitiveType;

import at.ooe.fh.mc.codespeech.interpreter.GrammarParser.*;
import at.ooe.fh.mc.codespeech.general.utils.StringUtils;
import at.ooe.fh.mc.codespeech.interpreter.InterpreterContext;
import at.ooe.fh.mc.codespeech.interpreter.models.*;
import at.ooe.fh.mc.codespeech.interpreter.operations.creation.*;

public class CreationListener extends BaseKeywordListener {

	public CreationListener(InterpreterContext context) {
		super(context);
	}

	@Override
	public void enterAbstractKeyword(AbstractKeywordContext ctx) {
		super.enterAbstractKeyword(ctx);

		context.isAbstract = true;
	}

	@Override
	public void enterStaticKeyword(StaticKeywordContext ctx) {
		super.enterStaticKeyword(ctx);

		context.isStatic = true;
	}

	@Override
	public void enterFinalKeyword(FinalKeywordContext ctx) {
		super.enterFinalKeyword(ctx);

		context.isFinal = true;
	}

	@Override
	public void enterProjectKeyword(ProjectKeywordContext ctx) {
		super.enterProjectKeyword(ctx);

		changeProperty(new ProjectModel());
		changeOperation(new CreateProjectOperation());
	}

	@Override
	public void enterPackageKeyword(PackageKeywordContext ctx) {
		super.enterPackageKeyword(ctx);

		changeProperty(new PackageModel());
		changeOperation(new CreatePackageOperation());
	}

	@Override
	public void enterClassKeyword(ClassKeywordContext ctx) {
		super.enterClassKeyword(ctx);

		ClassModel model = new ClassModel();
		if(context.accessModifier == AccessModifier.PUBLIC) {
			model.isPublic = true;
		}
		model.isFinal = context.isFinal;
		model.isAbstract = context.isAbstract;

		changeProperty(model);
		changeOperation(new CreateClassOperation());
	}

	@Override
	public void enterMethodKeyword(MethodKeywordContext ctx) {
		super.enterMethodKeyword(ctx);

		MethodModel model = new MethodModel();
		model.accessModifier = context.accessModifier;
		model.isPrimitive = context.isPrimitiveType;
		model.isFinal = context.isFinal;
		model.isStatic = context.isStatic;
		model.isAbstract = context.isAbstract;

		changeProperty(model);		
		changeOperation(new CreateMethodOperation());
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
		changeOperation(new CreateVariableOperation());
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
	public void enterAccessModifier(AccessModifierContext ctx) {
		super.enterAccessModifier(ctx);

		context.accessModifier = AccessModifier.valueOf(ctx.getText().trim().toUpperCase());
	}

	@Override
	public void enterPhrase(PhraseContext ctx) {
		super.enterPhrase(ctx);

		changePhrase(ctx.getText());
	}

	@Override
	public void enterSimpleType(SimpleTypeContext ctx) {
		super.enterSimpleType(ctx);
		context.simpleType = StringUtils.toPascalCase(ctx.getText());
	}

	@Override
	public void exitCreation(CreationContext ctx) {
		super.exitCreation(ctx);

		//context.finish();
	}

	@Override
	public void enterInterfaceKeyword(InterfaceKeywordContext ctx) {
		super.enterInterfaceKeyword(ctx);

		ClassModel model = new ClassModel();
		if(context.accessModifier == AccessModifier.PUBLIC) {
			model.isPublic = true;
		}
		model.isFinal = context.isFinal;
		model.isAbstract = context.isAbstract;
		model.isInterface = true;

		changeProperty(model);
		changeOperation(new CreateClassOperation());
	}


	@Override
	public void enterIfStatementKeyword(IfStatementKeywordContext ctx) {
		super.enterIfStatementKeyword(ctx);

		ConditionalModel model = new ConditionalModel();
		changeProperty(model);
		changeOperation(new CreateIfStatementOperation());
	}

	@Override
	public void enterElseStatementKeyword(ElseStatementKeywordContext ctx) {
		super.enterElseStatementKeyword(ctx);		

		ConditionalModel model = new ConditionalModel();
		changeProperty(model);
		changeOperation(new CreateElseStatementOperation());
	}

	@Override
	public void enterWhileLoopKeyword(WhileLoopKeywordContext ctx) {
		super.enterWhileLoopKeyword(ctx);

		ConditionalModel model = new ConditionalModel();
		changeProperty(model);
		changeOperation(new CreateWhileLoopOperation());
	}

	@Override
	public void enterForLoopKeyword(ForLoopKeywordContext ctx) {
		super.enterForLoopKeyword(ctx);

		ConditionalModel model = new ConditionalModel();
		changeProperty(model);
		changeOperation(new CreateWhileLoopOperation());
	}

	@Override
	public void enterArrayKeyword(ArrayKeywordContext ctx) {
		super.enterArrayKeyword(ctx);

		context.isArray = true;
	}
}
