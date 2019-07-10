package at.ooe.fh.mc.codespeech.plugin.menu;

import org.eclipse.core.commands.*;

import at.ooe.fh.mc.codespeech.plugin.PluginManager;

/**
 * Class extending AbstracHandler that toggles speech recognition when plugin
 * button is pressed
 * 
 * @author Lukasz Strzelecki
 *
 */
public class ToggleSpeechRecognitionHandler extends AbstractHandler {
	
	/**
	 * Method called when plugin button is pressed. Either turns on or off 
	 * speech recognition
	 */
	@Override
    public Object execute(ExecutionEvent event) throws ExecutionException {	
		   
		PluginManager.getDefault().toggle();
		
        return null;
    }
	

}