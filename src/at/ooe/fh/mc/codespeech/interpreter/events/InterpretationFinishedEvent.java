package at.ooe.fh.mc.codespeech.interpreter.events;

import java.util.List;

import at.ooe.fh.mc.codespeech.general.events.Event;
import at.ooe.fh.mc.codespeech.interpreter.Command;
import at.ooe.fh.mc.codespeech.plugin.InterpreterListener;

public class InterpretationFinishedEvent extends Event<InterpreterListener> {
	
	Command command;

	public InterpretationFinishedEvent(List<InterpreterListener> listeners,
								   Command command) {
		super(listeners);
		this.command = command;
	}
	
	
	@Override
	protected void execute(InterpreterListener listener) {
		listener.onInterpretationFinished(command);
	}
}
