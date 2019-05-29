package at.ooe.fh.mc.codespeech.speechrecognition;

import java.io.File;
import java.io.IOException;

import at.ooe.fh.mc.codespeech.general.exceptions.NotImplementedException;
import at.ooe.fh.mc.codespeech.speechrecognition.SpeechRecognizer.Mode;
import at.ooe.fh.mc.codespeech.speechrecognition.cmusphinx.PocketsphinxSetup;
import at.ooe.fh.mc.codespeech.speechrecognition.googlespeech.GoogleSpeechRecognizer;

public class SpeechRecognizerFactory {

	public static SpeechRecognizer createSpeechRecognizer(SREngineType engineType, Mode mode) throws IOException, NotImplementedException {
		
		switch(engineType) {
			case POCKETSPHINX:
				return PocketsphinxSetup.defaultSetup()
		    			.setAcousticModel(new File("model/en-us/en-us"))
		    			.setDictionary(new File("model/en-us/my-dictionary.dict"))
		    			.getRecognizer(mode);
			case GOOGLE_SPEECH:
				return new GoogleSpeechRecognizer(mode);			
	
			default:
				return null;	
		}
	}
	
	public static SpeechRecognizer createSpeechRecognizer(SREngineType engineType) throws IOException, NotImplementedException {
		return createSpeechRecognizer(engineType, Mode.CONTINUOUS_SPEECH);
	}
}
