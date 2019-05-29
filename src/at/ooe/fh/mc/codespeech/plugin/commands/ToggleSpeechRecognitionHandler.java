package at.ooe.fh.mc.codespeech.plugin.commands;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;

import at.ooe.fh.mc.codespeech.plugin.Activator;

/**
 * Class extending AbstracHandler that toggles speech recognition when plugin
 * button is pressed
 * 
 * @author Lukasz Strzelecki
 *
 */
public class ToggleSpeechRecognitionHandler extends AbstractHandler {

	static boolean recognizerOn = false;
	
	/**
	 * Method called when plugin button is pressed. Either turns on or off 
	 * speech recognition
	 */
	@Override
    public Object execute(ExecutionEvent event) throws ExecutionException {	
		   
		if(!recognizerOn) {	    		    	
			Activator.getDefault().turnOnRecognition();
			System.out.println("SR turned on");
		} else {	    	
			Activator.getDefault().turnOffRecognition();
			System.out.println("SR turned off");
		}

		recognizerOn = !recognizerOn;
		
        return null;
    }
	

}