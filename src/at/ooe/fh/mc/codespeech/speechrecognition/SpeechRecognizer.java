package at.ooe.fh.mc.codespeech.speechrecognition;

import static java.lang.String.format;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import at.ooe.fh.mc.codespeech.general.events.EventHandler;
import at.ooe.fh.mc.codespeech.general.exceptions.NotImplementedException;

public abstract class SpeechRecognizer {
	
	protected final int TIMEOUT_IN_MS = 10000;
	
	public enum Mode {
		CONTINUOUS_SPEECH, 
		KEYPHRASE_SEARCH, 
		GRAMMAR
	}
	
	protected Mode mode;
		
	protected final Microphone microphone;
	protected final EventHandler eventHandler;
	
	protected List<SpeechRecognitionListener> listeners;
	
	protected RecognizerThread recognizerThread;
	
	public SpeechRecognizer() {
		listeners = new ArrayList<>();
		
		microphone = new SpeechSourceProvider().getMicrophone();
		eventHandler = new EventHandler();
	}

	public void setMode(Mode mode) throws NotImplementedException {
		this.mode = mode;
		setupMode();
	}
	
	private void setupMode() throws NotImplementedException {
		switch(mode) {
		case CONTINUOUS_SPEECH:
			setupContinuousMode();
			break;

		case KEYPHRASE_SEARCH:
			setupKeyphraseSearchMode();
			break;

		case GRAMMAR:
			setupGrammarMode();
			break;
		}
	}
	
	/**
	 * Starts recognition. Does nothing if recognition is active.
	 * 
	 * @return true if recognition was actually started
	 */
	public boolean startListening() {
		if (null != recognizerThread)
			return false;

		System.out.println( format("Start recognition \"%s\"", mode.toString()));
		//onStart();
		recognizerThread = createNewRecognizerThread();
		recognizerThread.start();
		return true;
	}

	//protected abstract void onStart();
	
	protected abstract RecognizerThread createNewRecognizerThread();
	
	/**
	 * Stops recognition. All listeners should receive final result if there is
	 * any. Does nothing if recognition is not active.
	 * 
	 * @return true if recognition was actually stopped
	 */
	public boolean stopListening(boolean listenAgain) {
 		boolean result = stopRecognizerThread(listenAgain);
		if (result) {
			System.out.println("Stop recognition");
			//onStop();
		}
		return result;
	}
	
	//protected abstract void onStop();
	
//	/**
//	 * Cancels recognition. Listeners do not receive final result. Does nothing
//	 * if recognition is not active.
//	 * 
//	 * @return true if recognition was actually canceled
//	 */
//	public boolean cancel() {
//		boolean result = stopRecognizerThread();
//		if (result) {
//			System.out.println( "Cancel recognition");
//		}
//
//		return result;
//	}

	/**
	 * Shutdown the recognizer and release the recorder
	 * @throws IOException 
	 */
	public void shutdown() throws IOException {
		microphone.close();
	}
	
	protected boolean stopRecognizerThread(boolean listenAgain) {
		if (null == recognizerThread)
			return false;

		recognizerThread.listenAgain = listenAgain;
		recognizerThread.interrupted = true;

		recognizerThread = null;
		return true;
	}
	
	/**
	 * Adds listener.
	 */
	public void addListener(SpeechRecognitionListener listener) {
		synchronized (listeners) {
			listeners.add(listener);
		}
	}

	/**
	 * Removes listener.
	 */
	public void removeListener(SpeechRecognitionListener listener) {
		synchronized (listeners) {
			listeners.remove(listener);
		}
	}
	
	protected abstract void setupContinuousMode() throws NotImplementedException;
	protected abstract void setupKeyphraseSearchMode() throws NotImplementedException;
	protected abstract void setupGrammarMode() throws NotImplementedException;
	
	protected abstract class RecognizerThread extends Thread {    
		
		public boolean listenAgain;
		public boolean interrupted;
		
		protected int timeout;
		protected final static int NO_TIMEOUT = -1;
				
		public RecognizerThread(int timeout) {
			if (timeout != NO_TIMEOUT) 
				this.timeout = timeout;
			else
				this.timeout = NO_TIMEOUT;
		}

		public RecognizerThread() {
			this(NO_TIMEOUT);
		}

		@Override
		public void run() {

			microphone.startRecording();
			
			recognize();
						
			microphone.stopRecording();				
			
			if(listenAgain) 
				startListening();
		}

		protected abstract void recognize();		
	}
		
}
