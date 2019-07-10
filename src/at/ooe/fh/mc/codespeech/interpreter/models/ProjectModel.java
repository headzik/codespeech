package at.ooe.fh.mc.codespeech.interpreter.models;

import at.ooe.fh.mc.codespeech.general.utils.StringUtils;

public class ProjectModel extends Model {
	
	public String name = "PlaceholderName";

	@Override
	public String getPhrase() {
		return name;
	}

	@Override
	public void setPhrase(String name) {
		this.name = StringUtils.toPascalCase(name);
	}

}
