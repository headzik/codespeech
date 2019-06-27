package at.ooe.fh.mc.codespeech.speechrecognition.cmusphinx;

import java.io.IOException;

import at.ooe.fh.mc.codespeech.general.exceptions.NotImplementedException;
import at.ooe.fh.mc.codespeech.speechrecognition.SpeechRecognizer;
import at.ooe.fh.mc.codespeech.speechrecognition.events.ResultEvent;
import at.ooe.fh.mc.codespeech.speechrecognition.events.TimeoutEvent;
import edu.cmu.sphinx.api.Configuration;
import edu.cmu.sphinx.api.Context;
import edu.cmu.sphinx.frontend.util.StreamDataSource;
import edu.cmu.sphinx.recognizer.Recognizer;
import edu.cmu.sphinx.result.Result;

/**
 * Main class to access recognizer functions. After configuration this class
 * starts a listener thread which records the data and recognizes it using
 * Pocketsphinx engine. Recognition events are passed to a client using
 * {@link RecognitionListener}
 * 
 */
public class Sphinx4SpeechRecognizer extends SpeechRecognizer {

	public static String ACOUSTIC_MODEL_PATH = "model/en-us/acoustic-sphinx4";
	public static String LANGUAGE_MODEL_PATH = "model/en-us/language-sphinx4.bin";
	public static String DICTIONARY_PATH = "model/en-us/dictionary-sphinx4.dict";
	
	private final int BUFFER_SIZE = 64000;
	
	private Configuration configuration;

    private Context context;
    private Recognizer recognizer;
	
	/**
	 * Creates speech recognizer. Recognizer holds the AudioRecord object, so you 
	 * need to call {@link release} in order to properly finalize it.
	 * 
	 * @param config The configuration object
	 * @throws IOException thrown if audio recorder can not be created for some reason.
	 * @throws NotImplementedException 
	 */
	public Sphinx4SpeechRecognizer(Mode mode) throws IOException, NotImplementedException {
		super();

		configuration = new Configuration();
		configuration.setAcousticModelPath(ACOUSTIC_MODEL_PATH);
		configuration.setDictionaryPath(DICTIONARY_PATH);

		
		// unfortunately must be called in each subclass for now, because of restriction
		// enforcing super() to be called first which creates an issue because subclass's 
		// variables that are referenced are not initialized yet
		setMode(mode);
		
        context = new Context(configuration);

        recognizer = context.getInstance(Recognizer.class);
        
        context.getInstance(StreamDataSource.class)
        .setInputStream(microphone.getStream());
        
				
	}	
	
	@Override
	public boolean startListening() {
		try {
			recognizer.allocate();
		} catch(Exception e) {
			
		}
		return super.startListening();
	}
	
	@Override
	public boolean stopListening(boolean listenAgain) {
		if(!listenAgain) recognizer.deallocate();
		return super.stopListening(listenAgain);
	}
	
	
	private void sendResult() {
    	stopListening(true);
    	try {
    	Result result = recognizer.recognize();
		if(result != null) {
			eventHandler.post(new ResultEvent(listeners, result.getBestResultNoFiller()));
		}
    	} catch(Exception e) {
    		
    	}
	}
	
	@Override
	protected RecognizerThread createNewRecognizerThread() {
		return new Sphinx4RecognizerThread(10000);
	}

	@Override
	protected void setupContinuousMode() throws NotImplementedException {
    	String languageModelPath = LANGUAGE_MODEL_PATH;
    	configuration.setLanguageModelPath(languageModelPath);  
	}

	@Override
	protected void setupKeyphraseSearchMode() throws NotImplementedException {
    	throw new NotImplementedException();
	}

	@Override
	protected void setupGrammarMode() throws NotImplementedException {
    	String grammarPath = CMUSphinxFilePaths.GRAMMAR_PATH;
    	configuration.setGrammarPath(grammarPath);
		configuration.setGrammarName("grammar");
		configuration.setUseGrammar(true);
	}
	
	private final class Sphinx4RecognizerThread extends RecognizerThread {

		public Sphinx4RecognizerThread(int timeout) {
			super(timeout);
		}
		
		@Override
		protected void recognize() {
			
			
			int numberOfBytes;

			long startTime = System.currentTimeMillis();
			try {
				while (!interrupted) {
					long timeElapsed = System.currentTimeMillis() - startTime;
					
					if (timeout != NO_TIMEOUT && timeElapsed > timeout) {
						eventHandler.post(new TimeoutEvent(listeners));
						break;
					}

					byte[] bytes = new byte[BUFFER_SIZE];

					numberOfBytes = microphone.getStream().read(bytes);
					if(numberOfBytes > 0) {
						sendResult();
						
						startTime = System.currentTimeMillis();
					}
									

				}
				
			} catch (Exception e) {
				e.printStackTrace();
			} finally {

			}
			
		}

	}

}
