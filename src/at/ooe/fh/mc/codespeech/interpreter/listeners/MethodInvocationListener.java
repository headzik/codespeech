package at.ooe.fh.mc.codespeech.interpreter.listeners;

import at.ooe.fh.mc.codespeech.general.utils.StringUtils;
import at.ooe.fh.mc.codespeech.interpreter.InterpreterContext;
import at.ooe.fh.mc.codespeech.interpreter.grammar.GrammarParser.ClassKeywordContext;
import at.ooe.fh.mc.codespeech.interpreter.grammar.GrammarParser.MethodInvocationContext;
import at.ooe.fh.mc.codespeech.interpreter.grammar.GrammarParser.MethodNamesContext;
import at.ooe.fh.mc.codespeech.interpreter.grammar.GrammarParser.ObjectKeywordContext;
import at.ooe.fh.mc.codespeech.interpreter.grammar.GrammarParser.VariableNameContext;
import at.ooe.fh.mc.codespeech.interpreter.models.MethodInvocationModel;
import at.ooe.fh.mc.codespeech.interpreter.models.Model;
import at.ooe.fh.mc.codespeech.interpreter.operations.creation.CreateMethodInvocationOperation;

public class MethodInvocationListener extends BaseKeywordListener {

	MethodInvocationListener(InterpreterContext context) {
		super(context);
	}

	@Override
	public void enterMethodInvocation(MethodInvocationContext ctx) {
		super.enterMethodInvocation(ctx);

		if(context.getCommand().getProperty() == null) {
			changeProperty(new MethodInvocationModel());
		}
	}
	
	@Override
	public void enterMethodNames(MethodNamesContext ctx) {
		super.enterMethodNames(ctx);

		Object property = context.getCommand().getProperty();
		if(property instanceof MethodInvocationModel) {
		
			MethodInvocationModel invocationModel = (MethodInvocationModel) property;
			
			String stringToParse = ctx.getText().replace(".", " . ") + " .";
			String[] parts = stringToParse.split(" ");
			String methodName = "";
			for (int i = 0; i < parts.length; i++) {  
				String currentWord = parts[i].trim();
				if(currentWord.equals(".") || currentWord.equals("dot")) {
					invocationModel.methodsToInvoke.add(StringUtils.toCamelCase(methodName));
					methodName = "";
				} else {
					methodName += " " + currentWord;
				}					
			}
		}

	}
	
	@Override
	public void enterVariableName(VariableNameContext ctx) {
		super.enterVariableName(ctx);

		Object property = context.getCommand().getProperty();
		if(property instanceof MethodInvocationModel) {
			MethodInvocationModel invocationModel = (MethodInvocationModel) property;
			String variableName = ctx.getText().trim();
			if(invocationModel.onClass) {
				variableName = StringUtils.toPascalCase(variableName);
			} else {
				variableName = StringUtils.toCamelCase(variableName);
			}
			invocationModel.variableName = variableName;
		}
	}

	@Override
	public void exitMethodInvocation(MethodInvocationContext ctx) {
		super.exitMethodInvocation(ctx);
		
		changeOperation(new CreateMethodInvocationOperation());
		
		///context.finish();
	}
	
	@Override
	public void enterClassKeyword(ClassKeywordContext ctx) {
		super.enterClassKeyword(ctx);

		Object property = context.getCommand().getProperty();
		if(property instanceof MethodInvocationModel) {
			((MethodInvocationModel) property).onClass = true;
		}
	}
	
	@Override
	public void enterObjectKeyword(ObjectKeywordContext ctx) {
		super.enterObjectKeyword(ctx);

		Object property = context.getCommand().getProperty();
		if(property instanceof MethodInvocationModel) {
			((MethodInvocationModel) property).onClass = false;
		}
	}
	
}
