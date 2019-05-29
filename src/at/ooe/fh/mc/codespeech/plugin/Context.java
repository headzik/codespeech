package at.ooe.fh.mc.codespeech.plugin;


import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.ui.texteditor.ITextEditor;


public class Context {
					
	public static ASTNode currentNode;
	public static ITextEditor activeEditor;
	public static IJavaElement selectedJavaElement;
	
//	public static void setCurrentNode(ASTNode node) {
//		currentNode = node;
//	}
//	
//	public static ASTNode getCurrentNode() {
//		return currentNode;
//	}
}
