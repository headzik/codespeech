package at.ooe.fh.mc.codespeech.plugin.menu;

import org.eclipse.core.commands.*;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Display;

import at.ooe.fh.mc.codespeech.plugin.PluginManager;

/**
 * Class extending AbstractHandler which opens {@link CommandDialog}
 * when "Enter Command" option in IDE's menu bar is clicked.
 * 
 * @author Lukasz Strzelecki
 *
 */
public class EnterCommandHandler extends AbstractHandler {

	/**
	 * Executes EnterCommand command
	 */
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		CommandDialog dialog = new CommandDialog(Display.getCurrent().getActiveShell());
		dialog.create();
		if (dialog.open() == Window.OK) {
			//Activator.getDefault().recognizeCommand(dialog.getCommand());//, dialog.getParameter());
			PluginManager.getDefault().interpret(dialog.getCommand());
		}
		return null;
	}

}
