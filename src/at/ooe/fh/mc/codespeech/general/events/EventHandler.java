package at.ooe.fh.mc.codespeech.general.events;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * Class that handles events (to be extended)
 * 
 * @author Lukasz Strzelecki
 *
 */
public class EventHandler {

	final BlockingQueue<Runnable> queue = new LinkedBlockingQueue<Runnable>();
	
	/**
	 * Runs event
	 * 
	 * @param event to be run
	 */
	public void post(Runnable event) {
		//queue.add(event);
		event.run();
	}
	
//	public EventHandler() {
//		
//	}
}
