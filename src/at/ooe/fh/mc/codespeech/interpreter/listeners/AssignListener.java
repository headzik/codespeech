package at.ooe.fh.mc.codespeech.interpreter.listeners;

import at.ooe.fh.mc.codespeech.general.utils.StringUtils;
import at.ooe.fh.mc.codespeech.interpreter.InterpreterContext;
import at.ooe.fh.mc.codespeech.interpreter.GrammarParser.AssignedValueContext;
import at.ooe.fh.mc.codespeech.interpreter.GrammarParser.AssignmentContext;
import at.ooe.fh.mc.codespeech.interpreter.GrammarParser.PhraseContext;
import at.ooe.fh.mc.codespeech.interpreter.GrammarParser.VariableNameContext;
import at.ooe.fh.mc.codespeech.interpreter.models.MethodInvocationModel;
import at.ooe.fh.mc.codespeech.interpreter.models.VariableModel;
import at.ooe.fh.mc.codespeech.interpreter.operations.modification.AssignOperation;

public class AssignListener extends BaseKeywordListener {

	AssignListener(InterpreterContext context) {
		super(context);
	}

	@Override
	public void enterVariableName(VariableNameContext ctx) {
		super.enterVariableName(ctx);

		VariableModel model = new VariableModel();
		model.setPhrase(ctx.getText().trim());
		changeProperty(model);
	}
	
	@Override
	public void enterAssignedValue(AssignedValueContext ctx) {
		super.enterAssignedValue(ctx);
		Object property = context.getCommand().getProperty();
		if(property instanceof VariableModel) {
			VariableModel model = (VariableModel) property;
			String variableName = ctx.getText().trim();
			model.initializator = StringUtils.toCamelCase(variableName);
		}
	}
	
//	@Override
//	public void enterPhrase(PhraseContext ctx) {
//		super.enterPhrase(ctx);
//
//		changeProperty(ctx.getText().trim());
//	}
	
	@Override
	public void exitAssignment(AssignmentContext ctx) {
		super.exitAssignment(ctx);
		
		changeOperation(new AssignOperation());
	}
}
