package at.ooe.fh.mc.codespeech.interpreter.models;

import org.eclipse.jdt.core.dom.PrimitiveType;

import at.ooe.fh.mc.codespeech.general.utils.StringUtils;

public class MethodModel extends Model {

	public String name = "placeholderName";
	public boolean isAbstract;
	public boolean isFinal;
	public boolean isStatic;
	public boolean isPrimitive;
	public AccessModifier accessModifier;
	public String simpleType = "";
	public PrimitiveType.Code primitiveType;

	@Override
	public String getPhrase() {
		return name;
	}

	@Override
	public void setPhrase(String name) {
		this.name = StringUtils.toCamelCase(name);
	}
	
	
}
