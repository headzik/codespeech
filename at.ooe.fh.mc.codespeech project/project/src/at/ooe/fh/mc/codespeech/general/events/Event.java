package at.ooe.fh.mc.codespeech.general.events;

import java.util.List;

public abstract class Event<T> implements Runnable {
			
	List<T> listeners;
	
	protected Event(List<T> listeners) {
		this.listeners = listeners;
	}
	
	public void run() {
		listeners.forEach((listener) -> {
			execute(listener);
		});
	}
			
	protected abstract void execute(T listener);
}