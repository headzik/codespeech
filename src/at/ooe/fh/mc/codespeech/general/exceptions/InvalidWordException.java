package at.ooe.fh.mc.codespeech.general.exceptions;

@SuppressWarnings("serial")
public class InvalidWordException extends Exception {

	public InvalidWordException(String message) {
		super(message);
	}

	public InvalidWordException() { 
		super();
	}
}
