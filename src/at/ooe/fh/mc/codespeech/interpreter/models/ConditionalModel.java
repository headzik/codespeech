package at.ooe.fh.mc.codespeech.interpreter.models;

public class ConditionalModel extends Model implements WithPhrase {
	public String condition = "";
	//public boolean isElse;
	
	@Override
	public boolean isReady() {
		return true; //!condition.isEmpty();
	}

	@Override
	public String getPhrase() {
		return condition;
	}

	@Override
	public void setPhrase(String phrase) {
		condition = phrase.trim();
	}
}
