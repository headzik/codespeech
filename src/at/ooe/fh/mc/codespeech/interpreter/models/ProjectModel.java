package at.ooe.fh.mc.codespeech.interpreter.models;

import at.ooe.fh.mc.codespeech.general.utils.StringUtils;

public class ProjectModel extends Model implements WithPhrase {
	
	public String name = "PlaceholderProjectName";
	
	@Override
	public String getPhrase() {
		return name;
	}

	@Override
	public void setPhrase(String phrase) {
		this.name = StringUtils.toPascalCase(name);
	}

	@Override
	public boolean isReady() {
		return !name.isEmpty();
	}
}
