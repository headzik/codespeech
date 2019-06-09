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

		Display.getDefault().asyncExec(new Runnable() {
			@Override
			public void run() {
				String text = ctx.getText().trim();
				if(StringUtils.isNumeric(text)) {
					try {
						UIManager.moveToLine(Integer.parseInt(text) - 1);
					} catch (NumberFormatException e) {
						e.printStackTrace();				
					}
				} else {
					int numeric = WordToNumber.convert(text);
					if(numeric >=0) {
						UIManager.moveToLine(numeric - 1);
					}
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
