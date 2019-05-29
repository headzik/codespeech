package at.ooe.fh.mc.codespeech.speechrecognition.events;

import java.util.List;

import at.ooe.fh.mc.codespeech.general.events.Event;
import at.ooe.fh.mc.codespeech.speechrecognition.SpeechRecognitionListener;

public class OnErrorEvent extends Event<SpeechRecognitionListener> {
	private final Throwable throwable;

	public OnErrorEvent(List<SpeechRecognitionListener> listeners, Throwable throwable) {
		super(listeners);
		this.throwable = throwable;
	}

	@Override
	protected void execute(SpeechRecognitionListener listener) {
		listener.onError(throwable);
	}
}