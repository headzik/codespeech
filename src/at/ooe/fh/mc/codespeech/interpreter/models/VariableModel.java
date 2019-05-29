package at.ooe.fh.mc.codespeech.interpreter.models;

import org.eclipse.jdt.core.dom.PrimitiveType.Code;

import at.ooe.fh.mc.codespeech.general.utils.StringUtils;
import at.ooe.fh.mc.codespeech.interpreter.operations.Operation;

public class VariableModel extends Model implements WithPhrase {
	
	public String name = "placeholderVarName";
	public boolean isFinal;
	public boolean isStatic;
	public boolean isPrimitive;
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
	public void setPhrase(String phrase) {
		this.name = StringUtils.toCamelCase(phrase);
	}

	@Override
	public boolean isReady() {
		return !name.isEmpty();
	}
}
