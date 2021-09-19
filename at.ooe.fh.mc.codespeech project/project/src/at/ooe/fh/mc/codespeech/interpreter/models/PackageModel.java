package at.ooe.fh.mc.codespeech.interpreter.models;

import at.ooe.fh.mc.codespeech.general.utils.StringUtils;

public class PackageModel extends Model {

	//IPackageFragmentRoot packageFragmentRoot;

	public String name = "placeholder.name";

	@Override
	public String getPhrase() {
		return name;
	}

	@Override
	public void setPhrase(String name) {
		this.name = StringUtils.toDotSeparated(name);
	}
		
//	public IPackageFragmentRoot getRoot() {
//		return packageFragmentRoot;
//	}
		

}
