package at.ooe.fh.mc.codespeech.interpreter.listeners;

import at.ooe.fh.mc.codespeech.general.utils.StringUtils;
import at.ooe.fh.mc.codespeech.interpreter.InterpreterContext;
import at.ooe.fh.mc.codespeech.interpreter.GrammarParser.VariableNameContext;
import at.ooe.fh.mc.codespeech.interpreter.operations.modification.AddArgumentOperation;

public class AddArgumentListener extends BaseKeywordListener {

	AddArgumentListener(InterpreterContext context) {
		super(context);
	}

	@Override
	public void enterVariableName(VariableNameContext ctx) {
		super.enterVariableName(ctx);
		
		changeProperty(StringUtils.toCamelCase(ctx.getText()));
		changeOperation(new AddArgumentOperation());
	}
}
