package at.ooe.fh.mc.codespeech.interpreter.listeners;

import org.eclipse.jdt.core.dom.PrimitiveType;

import at.ooe.fh.mc.codespeech.interpreter.GrammarParser.AbstractKeywordContext;
import at.ooe.fh.mc.codespeech.interpreter.GrammarParser.AccessModifierContext;
import at.ooe.fh.mc.codespeech.interpreter.GrammarParser.BooleanKeywordContext;
import at.ooe.fh.mc.codespeech.interpreter.GrammarParser.ByteKeywordContext;
import at.ooe.fh.mc.codespeech.interpreter.GrammarParser.CharKeywordContext;
import at.ooe.fh.mc.codespeech.interpreter.GrammarParser.ClassKeywordContext;
import at.ooe.fh.mc.codespeech.interpreter.GrammarParser.CreationContext;
import at.ooe.fh.mc.codespeech.interpreter.GrammarParser.DoubleKeywordContext;
import at.ooe.fh.mc.codespeech.interpreter.GrammarParser.ElseStatementKeywordContext;
import at.ooe.fh.mc.codespeech.interpreter.GrammarParser.FinalKeywordContext;
import at.ooe.fh.mc.codespeech.interpreter.GrammarParser.FloatKeywordContext;
import at.ooe.fh.mc.codespeech.interpreter.GrammarParser.ForLoopKeywordContext;
import at.ooe.fh.mc.codespeech.interpreter.GrammarParser.IfStatementKeywordContext;
import at.ooe.fh.mc.codespeech.interpreter.GrammarParser.IntegerKeywordContext;
import at.ooe.fh.mc.codespeech.interpreter.GrammarParser.InterfaceKeywordContext;
import at.ooe.fh.mc.codespeech.interpreter.GrammarParser.MethodKeywordContext;
import at.ooe.fh.mc.codespeech.interpreter.GrammarParser.PackageKeywordContext;
import at.ooe.fh.mc.codespeech.interpreter.GrammarParser.PhraseContext;
import at.ooe.fh.mc.codespeech.interpreter.GrammarParser.PrimitiveTypeContext;
import at.ooe.fh.mc.codespeech.interpreter.GrammarParser.ProjectKeywordContext;
import at.ooe.fh.mc.codespeech.interpreter.GrammarParser.ShortKeywordContext;
import at.ooe.fh.mc.codespeech.interpreter.GrammarParser.StaticKeywordContext;
import at.ooe.fh.mc.codespeech.interpreter.GrammarParser.VoidKeywordContext;
import at.ooe.fh.mc.codespeech.interpreter.GrammarParser.WhileLoopKeywordContext;
import at.ooe.fh.mc.codespeech.interpreter.InterpreterContext;
import at.ooe.fh.mc.codespeech.interpreter.models.AccessModifier;
import at.ooe.fh.mc.codespeech.interpreter.models.ClassModel;
import at.ooe.fh.mc.codespeech.interpreter.models.ConditionalModel;
import at.ooe.fh.mc.codespeech.interpreter.models.MethodModel;
import at.ooe.fh.mc.codespeech.interpreter.models.PackageModel;
import at.ooe.fh.mc.codespeech.interpreter.models.ProjectModel;
import at.ooe.fh.mc.codespeech.interpreter.models.VariableModel;
import at.ooe.fh.mc.codespeech.interpreter.operations.creation.CreateClassOperation;
import at.ooe.fh.mc.codespeech.interpreter.operations.creation.CreateElseStatementOperation;
import at.ooe.fh.mc.codespeech.interpreter.operations.creation.CreateIfStatementOperation;
import at.ooe.fh.mc.codespeech.interpreter.operations.creation.CreateMethodOperation;
import at.ooe.fh.mc.codespeech.interpreter.operations.creation.CreatePackageOperation;
import at.ooe.fh.mc.codespeech.interpreter.operations.creation.CreateProjectOperation;
import at.ooe.fh.mc.codespeech.interpreter.operations.creation.CreateVariableOperation;
import at.ooe.fh.mc.codespeech.interpreter.operations.creation.CreateWhileLoopOperation;

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
	public void exitPrimitiveType(PrimitiveTypeContext ctx) {
		super.exitPrimitiveType(ctx);

		context.isPrimitiveType = true;
		
		VariableModel model = new VariableModel();
		model.isPrimitive = true;
		model.type = context.primitiveType;
		model.isFinal = context.isFinal;
		model.isStatic = context.isStatic;
		model.accessModifier = context.accessModifier;
		changeProperty(model);
		changeOperation(new CreateVariableOperation());
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
				
		context.accessModifier = AccessModifier.valueOf(ctx.getText().toUpperCase());
	}
		
	@Override
	public void enterPhrase(PhraseContext ctx) {
		super.enterPhrase(ctx);
		
		changePhrase(ctx.getText());
	}
	
	@Override
	public void exitCreation(CreationContext ctx) {
		super.exitCreation(ctx);
		
		context.finish();
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
}
