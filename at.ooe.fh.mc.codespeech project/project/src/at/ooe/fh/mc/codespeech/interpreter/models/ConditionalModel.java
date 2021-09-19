package at.ooe.fh.mc.codespeech.interpreter.models;

public class ConditionalModel extends Model {
	
	public String condition = "";

	@Override
	public String getPhrase() {
		return condition;
	}

	@Override
	public void setPhrase(String condition) {
		this.condition = condition.trim();
	}
}
