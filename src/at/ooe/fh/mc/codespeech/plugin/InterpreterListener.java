package at.ooe.fh.mc.codespeech.plugin;

import at.ooe.fh.mc.codespeech.interpreter.Command;

public interface InterpreterListener {
	
	public void onInterpretationFinished(Command command);
}
