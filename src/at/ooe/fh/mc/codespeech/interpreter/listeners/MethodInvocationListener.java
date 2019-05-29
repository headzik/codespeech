package at.ooe.fh.mc.codespeech.interpreter.listeners;

import at.ooe.fh.mc.codespeech.general.utils.StringUtils;
import at.ooe.fh.mc.codespeech.interpreter.InterpreterContext;
import at.ooe.fh.mc.codespeech.interpreter.models.MethodInvocationModel;
import at.ooe.fh.mc.codespeech.interpreter.models.Model;
import at.ooe.fh.mc.codespeech.interpreter.operations.creation.CreateMethodInvocationOperation;
import at.ooe.fh.mc.codespeech.interpreter.GrammarParser.MethodInvocationContext;
import at.ooe.fh.mc.codespeech.interpreter.GrammarParser.MethodNameContext;
import at.ooe.fh.mc.codespeech.interpreter.GrammarParser.VariableNameContext;

public class MethodInvocationListener extends BaseKeywordListener {

	MethodInvocationListener(InterpreterContext context) {
		super(context);
	}
	
	@Override
	public void enterMethodName(MethodNameContext ctx) {
		super.enterMethodName(ctx);

		Model model = context.getCommand().getModel();
		if(model == null || !(model instanceof MethodInvocationModel)) {
			model = new MethodInvocationModel();
			changeModel(model);
		}
		String methodName = StringUtils.toCamelCase(ctx.getText().trim());
		((MethodInvocationModel)model).methodsToInvoke.add(methodName);
	}
	
	@Override
	public void enterVariableName(VariableNameContext ctx) {
		super.enterVariableName(ctx);

		Model model = context.getCommand().getModel();
		if(model != null || model instanceof MethodInvocationModel) {
			String variableName = StringUtils.toCamelCase(ctx.getText().trim());
			((MethodInvocationModel)model).variableName = variableName;
		}
	}

	@Override
	public void exitMethodInvocation(MethodInvocationContext ctx) {
		super.exitMethodInvocation(ctx);
		
		changeOperation(new CreateMethodInvocationOperation());
		
		context.finish();
	}
}
