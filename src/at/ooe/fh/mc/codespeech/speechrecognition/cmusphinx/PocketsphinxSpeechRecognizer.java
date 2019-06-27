/* ====================================================================
 * Copyright (c) 2014 Alpha Cephei Inc.  All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 * 1. Redistributions of source code must retain the above copyright
 *    notice, this list of conditions and the following disclaimer.
 *
 * 2. Redistributions in binary form must reproduce the above copyright
 *    notice, this list of conditions and the following disclaimer in
 *    the documentation and/or other materials provided with the
 *    distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY ALPHA CEPHEI INC. ``AS IS'' AND
 * ANY EXPRESSED OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO,
 * THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR
 * PURPOSE ARE DISCLAIMED.  IN NO EVENT SHALL CARNEGIE MELLON UNIVERSITY
 * NOR ITS EMPLOYEES BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
 * SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT
 * LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
 * DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY
 * THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
 * OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 *
 * ====================================================================
 */

package at.ooe.fh.mc.codespeech.speechrecognition.cmusphinx;

import static java.lang.String.format;

import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import at.ooe.fh.mc.codespeech.general.exceptions.NotImplementedException;
import at.ooe.fh.mc.codespeech.speechrecognition.SpeechRecognizer;
import at.ooe.fh.mc.codespeech.speechrecognition.events.InSpeechChangeEvent;
import at.ooe.fh.mc.codespeech.speechrecognition.events.ResultEvent;
import at.ooe.fh.mc.codespeech.speechrecognition.events.TimeoutEvent;
import edu.cmu.pocketsphinx.Config;
import edu.cmu.pocketsphinx.Decoder;
import edu.cmu.pocketsphinx.FsgModel;
import edu.cmu.pocketsphinx.Hypothesis;

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
	
	private final static float BUFFER_SIZE_SECONDS = 0.4f;
	private final Decoder decoder;	

	private final int BUFFER_SIZE;
	
	protected int sampleRate;  

	/**
	 * Creates speech recognizer. Recognizer holds the AudioRecord object, so you 
	 * need to call {@link release} in order to properly finalize it.
	 * 
	 * @param config The configuration object
	 * @throws IOException thrown if audio recorder can not be created for some reason.
	 * @throws NotImplementedException 
	 */
	protected PocketsphinxSpeechRecognizer(Config config, Mode mode) throws IOException, NotImplementedException {
		super();
		
		decoder = new Decoder(config);
		sampleRate = (int)decoder.getConfig().getFloat("-samprate");
		BUFFER_SIZE = Math.round(sampleRate * BUFFER_SIZE_SECONDS);
		
		// unfortunately must be called in each subclass for now, because of restriction
		// enforcing super() to be called first which creates an issue because subclass's 
		// variables that are referenced are not initialized yet
		setMode(mode);
	}	

	
//	@Override
//	protected void onStop() {
//		sendResult();
//	}

	private void sendResult() {
    	stopListening(true);
		final Hypothesis hypothesis = decoder.hyp();
		if(hypothesis != null) {
			eventHandler.post(new ResultEvent(listeners, hypothesis.getHypstr()));
		}
	}
	
	@Override
	protected RecognizerThread createNewRecognizerThread() {
		return new PocketsphinxRecognizerThread(10000);
	}

//	@Override
//	protected void onStart() {
//		decoder.setSearch(mode.name());
//	}
	
	@Override
	protected void setupContinuousMode()  {
    	File languageModel = new File(LANGUAGE_MODEL_PATH);
    	addNgramSearch(Mode.CONTINUOUS_SPEECH.name(), languageModel);  
	}

	@Override
	protected void setupKeyphraseSearchMode() {
    	File phrases = new File(CMUSphinxFilePaths.KEYPHRASES_PATH);
    	addKeyphraseSearch(Mode.KEYPHRASE_SEARCH.name(), phrases); 
	}

	@Override
	protected void setupGrammarMode() {
    	File grammar = new File(CMUSphinxFilePaths.GRAMMAR_PATH);
    	addGrammarSearch(Mode.GRAMMAR.name(), grammar); 
	}
	
	/**
	 * Returns the decoder object for advanced operation (dictionary extension, utterance
	 * data collection, adaptation and so on).
	 * 
	 * @return Decoder
	 */
	public Decoder getDecoder() {
		return decoder;
	}

	/**
	 * Gets name of the currently active search.
	 * 
	 * @return active search name or null if no search was started
	 */
	public String getSearchName() {
		return decoder.getSearch();
	}

	public void addFsgSearch(String searchName, FsgModel fsgModel) {
		decoder.setFsg(searchName, fsgModel);
	}

	/**
	 * Adds searches based on JSpeech grammar file.
	 * 
	 * @param name
	 *            search name
	 * @param file
	 *            JSGF file
	 */
	public void addGrammarSearch(String name, File file) {
		System.out.println( format("Load JSGF %s", file));
		decoder.setJsgfFile(name, file.getPath());
	}

	/**
	 * Adds searches based on JSpeech grammar string.
	 * 
	 * @param name
	 *            search name
	 * @param file
	 *            JSGF string
	 */
	public void addGrammarSearch(String name, String jsgfString) {
		decoder.setJsgfString(name, jsgfString);
	}

	/**
	 * Adds search based on N-gram language model.
	 * 
	 * @param name
	 *            search name
	 * @param file
	 *            N-gram model file
	 */
	public void addNgramSearch(String name, File file) {
		System.out.println(format("Load N-gram model %s", file));
		decoder.setLmFile(name, file.getPath());
	}

	/**
	 * Adds search based on a single phrase.
	 * 
	 * @param name
	 *            search name
	 * @param phrase
	 *            search phrase
	 */
	public void addKeyphraseSearch(String name, String phrase) {
		decoder.setKeyphrase(name, phrase);
	}

	/**
	 * Adds search based on a keyphrase file.
	 * 
	 * @param name
	 *            search name
	 * @param phrase
	 *            a file with search phrases, one phrase per line with optional weight in the end, for example
	 *            <br/>
	 *            <code>
	 *            oh mighty computer /1e-20/
	 *            how do you do /1e-10/
	 *            </code>
	 */
	public void addKeyphraseSearch(String name, File file) {
		decoder.setKws(name, file.getPath());
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

		public PocketsphinxRecognizerThread(int timeout) {
			super(timeout);
		}
		
		@Override
		protected void recognize() {
	    	decoder.setSearch(mode.name());
	    	
			decoder.startUtt();
			byte[] bytes = new byte[BUFFER_SIZE];
			boolean inSpeech = decoder.getInSpeech();

			int numberOfBytes;

			long startTime = System.currentTimeMillis();
			try {
				while (!interrupted) {
					long timeElapsed = System.currentTimeMillis() - startTime;
					
					if (timeout != NO_TIMEOUT && timeElapsed > timeout) {
						eventHandler.post(new TimeoutEvent(listeners));
						break;
					}
					
					numberOfBytes = microphone.getStream().read(bytes);
					if(numberOfBytes <= 0) continue;
					
					startTime = System.currentTimeMillis();
					
					ByteBuffer byteBufer = ByteBuffer.wrap(bytes, 0, numberOfBytes);
					byteBufer.order(ByteOrder.LITTLE_ENDIAN);
					short[] shorts = new short[numberOfBytes/2];
					byteBufer.asShortBuffer().get(shorts);
					decoder.processRaw(shorts, numberOfBytes/2, false, false);

					if (decoder.getInSpeech() != inSpeech) {
						inSpeech = decoder.getInSpeech();
                        eventHandler.post(new InSpeechChangeEvent(listeners, inSpeech));
                        if(!inSpeech) sendResult();
					}

				}

			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				decoder.endUtt();	
			}
			
		}

	}

}
