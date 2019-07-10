package at.ooe.fh.mc.codespeech.interpreter.models;

import org.apache.commons.lang3.text.WordUtils;

public class ClassModel extends Model {
	
	public String name = "PlaceholderClassName";
	public boolean isAbstract;
	public boolean isFinal;
	public boolean isInterface;
	public boolean isPublic = true;
	
	@Override
	public String getPhrase() {
		return name;
	}

	@Override
	public void setPhrase(String name) {
		this.name = WordUtils.capitalize(name).replace(" ", "").trim();
	}


}
