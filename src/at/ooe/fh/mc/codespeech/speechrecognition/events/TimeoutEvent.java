package at.ooe.fh.mc.codespeech.speechrecognition.events;

import java.util.List;

import at.ooe.fh.mc.codespeech.general.events.Event;
import at.ooe.fh.mc.codespeech.speechrecognition.SpeechRecognitionListener;

public class TimeoutEvent extends Event<SpeechRecognitionListener> {

	public TimeoutEvent(List<SpeechRecognitionListener> listeners) {
		super(listeners);
	};
	
	@Override
	protected void execute(SpeechRecognitionListener listener) {
		listener.onTimeout();
	}
}
