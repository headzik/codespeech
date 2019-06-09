package at.ooe.fh.mc.codespeech.interpreter.models;

import org.eclipse.jdt.core.IPackageFragmentRoot;

import at.ooe.fh.mc.codespeech.general.utils.StringUtils;
import at.ooe.fh.mc.codespeech.interpreter.operations.Operation;

public class PackageModel extends Model implements WithPhrase {

	IPackageFragmentRoot packageFragmentRoot;

	public String name = "placeholder.name";
	
	@Override
	public String getPhrase() {
		return name;
	}

	@Override
	public void setPhrase(String phrase) {
		this.name = StringUtils.toDotSeparated(phrase);
	}
		
	public IPackageFragmentRoot getRoot() {
		return packageFragmentRoot;
	}
	
	@Override
	public boolean isReady() {
		return !name.isEmpty();
	}
	
	

}
