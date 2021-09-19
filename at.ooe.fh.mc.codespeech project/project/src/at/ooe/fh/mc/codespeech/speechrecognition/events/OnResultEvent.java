package at.ooe.fh.mc.codespeech.speechrecognition.events;

import java.util.List;

import at.ooe.fh.mc.codespeech.general.events.Event;
import at.ooe.fh.mc.codespeech.speechrecognition.SpeechRecognitionListener;

public class OnResultEvent extends Event<SpeechRecognitionListener> {
	protected final String result;

	public OnResultEvent(List<SpeechRecognitionListener> listeners, String result) {
		super(listeners);
		this.result = result;
	}

	@Override
	protected void execute(SpeechRecognitionListener listener) {
		listener.onResult(result);
	}
}
