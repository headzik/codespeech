package at.ooe.fh.mc.codespeech.interpreter.operations.modification;

import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jdt.core.dom.TypeDeclaration;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.Document;
import org.eclipse.text.edits.TextEdit;

import at.ooe.fh.mc.codespeech.interpreter.models.ClassModel;
import at.ooe.fh.mc.codespeech.interpreter.models.MethodModel;
import at.ooe.fh.mc.codespeech.interpreter.models.Model;
import at.ooe.fh.mc.codespeech.interpreter.models.WithPhrase;
import at.ooe.fh.mc.codespeech.interpreter.operations.Operation;
import at.ooe.fh.mc.codespeech.plugin.Context;
import at.ooe.fh.mc.codespeech.plugin.utils.UIManager;

public class ImplementOperation implements Operation {

	@Override
	public void perform(Object property) throws JavaModelException, BadLocationException {
		if(property instanceof String) {
			//try {
				ASTNode node = Context.currentNode;
				if (node != null) {

					while(!(node instanceof TypeDeclaration)) {					
						node = node.getParent();
						if(node == null) {
							return;
						}
					}					

					CompilationUnit cu = (CompilationUnit) node.getRoot();
					AST ast = cu.getAST();
					cu.recordModifications();
					
					TypeDeclaration typeDeclaration = (TypeDeclaration) node;

					typeDeclaration.superInterfaceTypes().add(ast.newSimpleType(ast.newName((String) property)));

					Document doc = new Document(UIManager.getICompilationUnit().toString());
					TextEdit te = cu.rewrite(doc, 
							UIManager.getICompilationUnit().getJavaProject().getOptions(true));
					
					UIManager.updateCompilationUnit(te);
					UIManager.moveToNode(typeDeclaration);
				}
		//	} catch
		}
	}

}
