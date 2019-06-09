package at.ooe.fh.mc.codespeech.interpreter.models;

import org.eclipse.jdt.core.dom.PrimitiveType;

import at.ooe.fh.mc.codespeech.general.utils.StringUtils;
import at.ooe.fh.mc.codespeech.interpreter.operations.Operation;

public class MethodModel extends Model implements WithPhrase {

	public String name = "placeholderMethodName";
	public boolean isAbstract;
	public boolean isFinal;
	public boolean isStatic;
	public boolean isPrimitive;
	public AccessModifier accessModifier;
	public String simpleType = "";
	public PrimitiveType.Code primitiveType;
	//public List<> arguments;
	
	@Override
	public boolean isReady() {
		return !(name.isEmpty());
	}

	@Override
	public String getPhrase() {
		return name;
	}

	@Override
	public void setPhrase(String phrase) {
		this.name = StringUtils.toCamelCase(phrase);
	}
	
	
}
