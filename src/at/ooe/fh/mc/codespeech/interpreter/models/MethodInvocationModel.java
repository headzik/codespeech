package at.ooe.fh.mc.codespeech.interpreter.models;

import java.util.List;

public class MethodInvocationModel extends Model {
	
	public List<String> methodsToInvoke;
	public String variableName;
	
	@Override
	public boolean isReady() {
		return true;
	}
	
}
