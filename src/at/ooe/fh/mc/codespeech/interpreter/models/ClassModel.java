package at.ooe.fh.mc.codespeech.interpreter.models;

import org.apache.commons.lang3.text.WordUtils;

import at.ooe.fh.mc.codespeech.interpreter.operations.Operation;

public class ClassModel extends Model implements WithPhrase {
	
	public String name = "PlaceholderClassName";
	public boolean isAbstract;
	public boolean isFinal;
	public boolean isInterface;
	public boolean isPublic;
	
	@Override
	public String getPhrase() {
		return name;
	}

	@Override
	public void setPhrase(String phrase) {
		this.name = WordUtils.capitalize(name).replace(" ", "").trim();
	}

	@Override
	public boolean isReady() {
		return !name.isEmpty();
	}

}
