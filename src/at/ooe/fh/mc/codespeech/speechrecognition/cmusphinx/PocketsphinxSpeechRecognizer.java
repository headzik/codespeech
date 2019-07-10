package at.ooe.fh.mc.codespeech.speechrecognition.cmusphinx;

import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import at.ooe.fh.mc.codespeech.general.exceptions.NotImplementedException;
import at.ooe.fh.mc.codespeech.speechrecognition.SpeechRecognizer;
import at.ooe.fh.mc.codespeech.speechrecognition.events.*;
import edu.cmu.pocketsphinx.*;
/**
 * Main class to access recognizer functions. After configuration this class
 * starts a listener thread which records the data and recognizes it using
 * Pocketsphinx engine. Recognition events are passed to a client using
 * {@link RecognitionListener}
 * 
 */
public class PocketsphinxSpeechRecognizer extends SpeechRecognizer {

	public static String ACOUSTIC_MODEL_PATH = "model/en-us/acoustic-pocketsphinx";
	public static String LANGUAGE_MODEL_PATH = "model/en-us/language-pocketsphinx.bin";
	public static String DICTIONARY_PATH = "model/en-us/dictionary-pocketsphinx.dict";

	private final Decoder decoder;	

	public PocketsphinxSpeechRecognizer(Mode mode) throws IOException, NotImplementedException {		
		this(PocketsphinxSetup.defaultSetup()
				.setAcousticModel(new File(ACOUSTIC_MODEL_PATH))
				.setDictionary(new File(DICTIONARY_PATH)).getConfig(), mode);
	}
	
	/**
	 * Creates speech recognizer. Recognizer holds the AudioRecord object, so you 
	 * need to call {@link release} in order to properly finalize it.
	 * 
	 * @param config The configuration object
	 * @throws IOException thrown if audio recorder can not be created for some reason.
	 * @throws NotImplementedException 
	 */
	public PocketsphinxSpeechRecognizer(Config config, Mode mode) throws IOException, NotImplementedException {
		super();

		decoder = new Decoder(config);
		
		setMode(mode);
	}	
	
	@Override
	protected RecognizerThread createNewRecognizerThread() {
		return new PocketsphinxRecognizerThread(DEFAULT_TIMEOUT_IN_MS);
	}

	@Override
	protected void setupContinuousMode()  {
		decoder.setLmFile(Mode.CONTINUOUS_SPEECH.name(), LANGUAGE_MODEL_PATH);
	}

	@Override
	protected void setupKeyphraseSearchMode() {
		decoder.setKws(Mode.KEYPHRASE_SEARCH.name(), CMUSphinxFilePaths.KEYPHRASES_PATH);
	}

	@Override
	protected void setupGrammarMode() {
		decoder.setJsgfFile(Mode.GRAMMAR.name(), CMUSphinxFilePaths.GRAMMAR_PATH);
	}

	/**
	 * Adds a search to look for the phonemes
	 *
	 * @param name
	 *          search name
	 * @param phonetic bigram model
	 * 
	 */
	public void addAllphoneSearch(String name, File file) {
		decoder.setAllphoneFile(name, file.getPath());
	}

	private final class PocketsphinxRecognizerThread extends RecognizerThread {

		public boolean listenAgain;
		
		public PocketsphinxRecognizerThread(int timeout) {
			super(timeout);
		}

		@Override
		protected void recognize(byte [] bytes, int numberOfBytes) throws Exception {
			boolean inSpeech = decoder.getInSpeech();

			ByteBuffer byteBufer = ByteBuffer.wrap(bytes, 0, numberOfBytes);
			byteBufer.order(ByteOrder.LITTLE_ENDIAN);
			short[] shorts = new short[numberOfBytes/2];
			byteBufer.asShortBuffer().get(shorts);
			decoder.processRaw(shorts, numberOfBytes/2, false, false);
			
			if (decoder.getInSpeech() != inSpeech) {
				inSpeech = decoder.getInSpeech();
				eventHandler.post(new OnSpeechChangeEvent(listeners, inSpeech));
				if(!inSpeech) {
					sendResult();
				}
			}

		}
		
		private void sendResult() {
			stopListening();
			final Hypothesis hypothesis = decoder.hyp();
			if(hypothesis != null) {
				eventHandler.post(new OnResultEvent(listeners, hypothesis.getHypstr()));
			}
			listenAgain = true;
		}

		@Override
		protected void beforeRecognition() {
			decoder.setSearch(mode.name());	    	
			decoder.startUtt();
		}

		@Override
		protected void afterRecognition() {
 			decoder.endUtt();	 			

			if(listenAgain) {
				startListening();
			}
		}


	}

}
