package at.ooe.fh.mc.codespeech.interpreter.models;

import org.eclipse.jdt.core.dom.PrimitiveType.Code;

import at.ooe.fh.mc.codespeech.general.utils.StringUtils;

public class VariableModel extends Model {
	
	public String name = "placeholderName";
	public boolean isFinal;
	public boolean isStatic;
	public boolean isPrimitive;
	public boolean isArray;
	public Code type;
	public AccessModifier accessModifier;
	public String simpleType = "";
	public String initializator = "";
	
	public Code getType() {
		return type;
	}

	public void setType(Code type) {
		this.type = type;
	}

	@Override
	public String getPhrase() {
		return name;
	}

	@Override
	public void setPhrase(String name) {
		this.name = StringUtils.toCamelCase(name);
	}
	
}
