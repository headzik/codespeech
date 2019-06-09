package at.ooe.fh.mc.codespeech.interpreter;

import org.eclipse.jdt.core.dom.PrimitiveType;

import at.ooe.fh.mc.codespeech.interpreter.listeners.BaseKeywordListener;
import at.ooe.fh.mc.codespeech.interpreter.listeners.InitialListener;
import at.ooe.fh.mc.codespeech.interpreter.models.AccessModifier;

public class InterpreterContext {

	private Interpreter interpreter;
	private BaseKeywordListener currentListener;
	
	Command command;
    
	public String remainingUtterance;
	public boolean isAbstract;
	public boolean isFinal;
	public boolean isStatic;
	public boolean isPrimitiveType;
	public AccessModifier accessModifier;
	public String simpleType;
	public PrimitiveType.Code primitiveType;
	
	
	public InterpreterContext(Interpreter interpreter) {
		this.interpreter = interpreter;
		command = new Command();
		remainingUtterance = "";
		setCurrentListener(new InitialListener(this));
	}

	public BaseKeywordListener getCurrentListener() {
		return currentListener;
	}

	public void setCurrentListener(BaseKeywordListener newListener) {
		currentListener = newListener;
	}
		
	public Command getCommand() {
		return command;
	}

	public void setCommand(Command command) {
		this.command = command;
	}
	
	//change to notify?
	public void continueWith(BaseKeywordListener newListener) {
		setCurrentListener(newListener);
		interpreter.interpret(remainingUtterance);
	}

	//change to notify?
	public void finish() {
		interpreter.finish();
	}
	
}
