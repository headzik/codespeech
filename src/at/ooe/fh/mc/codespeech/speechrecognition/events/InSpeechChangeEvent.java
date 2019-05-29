package at.ooe.fh.mc.codespeech.speechrecognition.events;

import java.util.List;

import at.ooe.fh.mc.codespeech.general.events.Event;
import at.ooe.fh.mc.codespeech.speechrecognition.SpeechRecognitionListener;

public class InSpeechChangeEvent extends Event<SpeechRecognitionListener> {
	private final boolean state;

	public InSpeechChangeEvent(List<SpeechRecognitionListener> listeners, boolean state) {
		super(listeners);
		this.state = state;
	}

	@Override
	protected void execute(SpeechRecognitionListener listener) {
		if (state) {
			listener.onBeginningOfSpeech();
		} else {
			listener.onEndOfSpeech();
		}
	}
}
