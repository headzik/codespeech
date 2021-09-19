package at.ooe.fh.mc.codespeech.interpreter.operations.modification;

import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jdt.core.dom.TypeDeclaration;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.Document;
import org.eclipse.text.edits.TextEdit;

import at.ooe.fh.mc.codespeech.interpreter.operations.Operation;
import at.ooe.fh.mc.codespeech.plugin.utils.ASTManager;
import at.ooe.fh.mc.codespeech.plugin.utils.EditorManager;

public class ExtensionOperation implements Operation {

	@Override
	public void perform(Object property) throws JavaModelException, BadLocationException {
		if(property instanceof String) {
			ASTNode node = ASTManager.getCurrentNode();
			if (node != null) {

				CompilationUnit cu = (CompilationUnit) node.getRoot();
				if(!(node instanceof TypeDeclaration)) {
					node = ASTManager.getNextNodeOfType(cu, TypeDeclaration.class);
					if(node == null) return;
				}
				AST ast = cu.getAST();
				cu.recordModifications();

				TypeDeclaration typeDeclaration = (TypeDeclaration) node;

				typeDeclaration.setSuperclassType(ast.newSimpleType(ast.newName((String) property)));

				Document doc = new Document(EditorManager.getICompilationUnit().toString());
				TextEdit te = cu.rewrite(doc, 
						EditorManager.getICompilationUnit().getJavaProject().getOptions(true));

				EditorManager.updateCompilationUnit(te);
				EditorManager.moveToNode(typeDeclaration);

			}
		}
	}

}
