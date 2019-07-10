package at.ooe.fh.mc.codespeech.speechrecognition;

import java.io.IOException;

import at.ooe.fh.mc.codespeech.general.exceptions.NotImplementedException;
import at.ooe.fh.mc.codespeech.speechrecognition.SpeechRecognizer.Mode;
import at.ooe.fh.mc.codespeech.speechrecognition.cmusphinx.PocketsphinxSpeechRecognizer;
import at.ooe.fh.mc.codespeech.speechrecognition.cmusphinx.Sphinx4SpeechRecognizer;
import at.ooe.fh.mc.codespeech.speechrecognition.googlespeech.GoogleSpeechRecognizer;

public class SpeechRecognizerFactory {

	public static SpeechRecognizer createSpeechRecognizer(SREngineType engineType, Mode mode) 
			throws IOException, NotImplementedException {
		
		switch(engineType) {
			case SPHINX4:	
				return new Sphinx4SpeechRecognizer(mode);
			case POCKETSPHINX:
				return new PocketsphinxSpeechRecognizer(mode);
			case GOOGLE_SPEECH:
				return new GoogleSpeechRecognizer(mode);
	
			default:
				return null;	
		}
	}
	
	public static SpeechRecognizer createSpeechRecognizer(SREngineType engineType) 
			throws IOException, NotImplementedException {
		return createSpeechRecognizer(engineType, Mode.CONTINUOUS_SPEECH);
	}
}
