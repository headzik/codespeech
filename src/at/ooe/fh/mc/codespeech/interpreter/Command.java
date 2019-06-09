package at.ooe.fh.mc.codespeech.interpreter;

import org.eclipse.swt.widgets.Display;

import at.ooe.fh.mc.codespeech.interpreter.models.Model;
import at.ooe.fh.mc.codespeech.interpreter.operations.Operation;

public class Command {

	Object property;
	Operation operation;

	public void execute() {
		if(operation != null) {
			Display.getDefault().asyncExec(new Runnable() {
				@Override
				public void run() {
					try {
						operation.perform(property);
					} catch(Exception e) {
						e.printStackTrace();
					}
				}
			});
		}
	}

	public void setOperation(Operation operation) {
		this.operation = operation;
	}

	public Object getProperty() {
		return property;
	}

	public void setProperty(Object property) {
		this.property = property;
	}

}
