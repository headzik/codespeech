package at.ooe.fh.mc.codespeech.speechrecognition;

import static java.lang.String.format;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import at.ooe.fh.mc.codespeech.general.events.EventHandler;
import at.ooe.fh.mc.codespeech.general.exceptions.NotImplementedException;
import at.ooe.fh.mc.codespeech.speechrecognition.events.OnTimeoutEvent;

public abstract class SpeechRecognizer {

	protected final int DEFAULT_TIMEOUT_IN_MS = 10000;

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
	
	protected boolean isOn = false;

	public SpeechRecognizer() throws NotImplementedException {	
		listeners = new ArrayList<>();

		microphone = Microphone.getDefaultMicrophone();
		eventHandler = new EventHandler();
	}


	protected void setMode(Mode mode) throws NotImplementedException {
		this.mode = mode;

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
		recognizerThread = createNewRecognizerThread();
		recognizerThread.start();
		isOn = true;
		return true;
	}

	protected abstract RecognizerThread createNewRecognizerThread();

	/**
	 * Stops recognition. All listeners should receive final result if there is
	 * any. Does nothing if recognition is not active.
	 * 
	 * @return true if recognition was actually stopped
	 */
	public boolean stopListening() {
		boolean result = stopRecognizerThread();
		if (result) {
			System.out.println("Stop recognition");
		}
		isOn = false;

		return result;
	}

	/**
	 * Shutdown the recognizer and release the recorder
	 * @throws IOException 
	 */
	public void shutdown() throws IOException {
		microphone.close();
	}

	protected boolean stopRecognizerThread() {
		if (null == recognizerThread)
			return false;

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

		protected final int DEFAULT_TIMEOUT_IN_MS = 10000;
		protected final int BUFFER_SIZE = 64000;

		public boolean finished;
		public boolean interrupted;

		protected int timeout = 0;

		public RecognizerThread(int timeout) {
			this.timeout = timeout;
		}

		public RecognizerThread() {
			this(0);
		}

		@Override
		public void run() {
			long startTime;
			long elapsedTime;

			finished = false;
			microphone.startRecording();

			beforeRecognition();

			startTime = System.currentTimeMillis();

			try {
				while(!interrupted) {	
					elapsedTime = System.currentTimeMillis() - startTime;

					if(timeOut(elapsedTime)) {
						eventHandler.post(new OnTimeoutEvent(listeners));
						break;
					}		

					byte[] bytes = new byte[BUFFER_SIZE];
					int numberOfBytes = microphone.getStream().read(bytes);

					if(numberOfBytes > 0) {					
						recognize(bytes, numberOfBytes);
						startTime = System.currentTimeMillis();
					}
				}
			} catch (Exception exception) {
				exception.printStackTrace();
			} finally {
				afterRecognition();
				microphone.stopRecording();	
				finished = true;
			}
			
//			if(listenAgain) {
//				startListening();
//			}
			
		}

		protected boolean timeOut(long elapsedTime) {
			return timeout > 0 && elapsedTime > timeout;
		}

		protected abstract void beforeRecognition();		
		protected abstract void recognize(byte [] bytes, int numberOfBytes) throws Exception;		
		protected abstract void afterRecognition();	

	}

	public boolean isOn() {
		return isOn;
	}

}
