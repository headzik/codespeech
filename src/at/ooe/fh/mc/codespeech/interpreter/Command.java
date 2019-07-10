package at.ooe.fh.mc.codespeech.interpreter;

import org.eclipse.swt.widgets.Display;

import at.ooe.fh.mc.codespeech.interpreter.operations.Operation;

public class Command {

	Object property;
	Operation operation;

	public void execute() {
		//if(isSet()) {
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
		//}
	}

	public boolean isSet() {
		return operation != null;
	}
	
	public void setOperation(Operation operation) {
		this.operation = operation;
	}
	
	public Operation getOperation() {
		return operation;
	}

	public Object getProperty() {
		return property;
	}

	public void setProperty(Object property) {
		this.property = property;
	}

}
