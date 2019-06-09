package at.ooe.fh.mc.codespeech.interpreter.models;

import java.util.ArrayList;
import java.util.List;

public class MethodInvocationModel extends Model {
	
	public List<String> methodsToInvoke = new ArrayList<String>();
	public String variableName = "";
	public boolean onClass;
	
	@Override
	public boolean isReady() {
		return true;
	}
	
}
