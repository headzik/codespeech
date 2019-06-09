package at.ooe.fh.mc.codespeech.interpreter.listeners;

import at.ooe.fh.mc.codespeech.interpreter.InterpreterContext;
import at.ooe.fh.mc.codespeech.plugin.utils.UIManager;

import org.eclipse.swt.widgets.Display;

import at.ooe.fh.mc.codespeech.general.utils.StringUtils;
import at.ooe.fh.mc.codespeech.general.utils.WordToNumber;
import at.ooe.fh.mc.codespeech.interpreter.GrammarParser.CreationContext;
//import at.ooe.fh.mc.codespeech.interpreter.GrammarParser.IntegerContext;
import at.ooe.fh.mc.codespeech.interpreter.GrammarParser.NavigationContext;
import at.ooe.fh.mc.codespeech.interpreter.GrammarParser.NumberContext;

public class NavigationListener extends BaseKeywordListener {

	NavigationListener(InterpreterContext context) {
		super(context);
	}

	@Override
	public void enterNumber(NumberContext ctx) {
		super.enterNumber(ctx);

		//TODO: to operation
		Display.getDefault().asyncExec(new Runnable() {
			@Override
			public void run() {
				String text = ctx.getText().trim();
				int lineNumber = StringUtils.getNumber((text)) - 1;
				if(lineNumber > 0) {
					UIManager.moveToLine(lineNumber);
				}
			}
		});
	}


	@Override
	public void exitNavigation(NavigationContext ctx) {
		super.exitNavigation(ctx); 

		//context.finish();
	}
}
