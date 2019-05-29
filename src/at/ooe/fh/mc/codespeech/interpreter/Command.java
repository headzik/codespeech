package at.ooe.fh.mc.codespeech.interpreter;

import at.ooe.fh.mc.codespeech.interpreter.models.Model;
import at.ooe.fh.mc.codespeech.interpreter.operations.Operation;

public class Command {
	
	Model model;
	Operation operation;
		
	public void execute() {
		//model.perform(operation);
		operation.perform(model);
	}
	
	public boolean isReady() {
		return model != null && model.isReady() && operation != null;
	}

	public void setOperation(Operation operation) {
		this.operation = operation;
	}

	public Model getModel() {
		return model;
	}

	public void setModel(Model model) {
		this.model = model;
	}

}
