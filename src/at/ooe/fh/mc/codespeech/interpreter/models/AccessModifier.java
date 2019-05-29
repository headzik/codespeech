package at.ooe.fh.mc.codespeech.interpreter.models;

import org.eclipse.jdt.core.dom.Modifier;

public enum AccessModifier {
	PUBLIC, PRIVATE, PROTECTED;
	
	
	public static Modifier.ModifierKeyword toASTNodeKeyword(AccessModifier accessModifier) {
		switch(accessModifier) {
			case PRIVATE:
				return Modifier.ModifierKeyword.PRIVATE_KEYWORD;
				
			case PROTECTED:
				return Modifier.ModifierKeyword.PROTECTED_KEYWORD;

			default:
				return Modifier.ModifierKeyword.PUBLIC_KEYWORD;
		}
		
	}
}