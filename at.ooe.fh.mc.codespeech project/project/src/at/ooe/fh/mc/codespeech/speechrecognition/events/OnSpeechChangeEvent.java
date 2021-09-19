package at.ooe.fh.mc.codespeech.speechrecognition.events;

import java.util.List;

import at.ooe.fh.mc.codespeech.general.events.Event;
import at.ooe.fh.mc.codespeech.speechrecognition.SpeechRecognitionListener;

public class OnSpeechChangeEvent extends Event<SpeechRecognitionListener> {
	private final boolean isStarting;

	public OnSpeechChangeEvent(List<SpeechRecognitionListener> listeners, boolean isStarting) {
		super(listeners);
		this.isStarting = isStarting;
	}

	@Override
	protected void execute(SpeechRecognitionListener listener) {
		if (isStarting) {
			listener.onBeginningOfSpeech();
		} else {
			listener.onEndOfSpeech();
		}
	}
}
