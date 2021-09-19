package at.ooe.fh.mc.codespeech.interpreter.events;

import java.util.List;

import at.ooe.fh.mc.codespeech.general.events.Event;
import at.ooe.fh.mc.codespeech.interpreter.Command;
import at.ooe.fh.mc.codespeech.interpreter.InterpreterListener;

public class OnInterpretationFinishedEvent extends Event<InterpreterListener> {
	
	Command command;

	public OnInterpretationFinishedEvent(List<InterpreterListener> listeners,
								   Command command) {
		super(listeners);
		this.command = command;
	}
	
	
	@Override
	protected void execute(InterpreterListener listener) {
		listener.onInterpretationFinished(command);
	}
}
