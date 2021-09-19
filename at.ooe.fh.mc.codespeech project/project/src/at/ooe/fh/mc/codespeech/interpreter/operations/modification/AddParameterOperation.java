package at.ooe.fh.mc.codespeech.interpreter.operations.modification;

import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.SingleVariableDeclaration;
import org.eclipse.jdt.core.dom.Type;
import org.eclipse.jdt.core.dom.rewrite.ASTRewrite;
import org.eclipse.jdt.core.dom.rewrite.ListRewrite;

import at.ooe.fh.mc.codespeech.interpreter.models.VariableModel;
import at.ooe.fh.mc.codespeech.interpreter.operations.Operation;
import at.ooe.fh.mc.codespeech.plugin.utils.ASTManager;
import at.ooe.fh.mc.codespeech.plugin.utils.EditorManager;

public class AddParameterOperation implements Operation {

	@Override
	public void perform(Object property) {
		if(property instanceof VariableModel) {
			VariableModel variableModel = (VariableModel) property;

			try {
				ASTNode node = ASTManager.getCurrentNode();
				if (node != null && node instanceof MethodDeclaration) {

					AST ast = node.getAST();
					ASTRewrite rewriter = ASTRewrite.create(ast);
					ListRewrite listRewrite;
					MethodDeclaration methodDeclaration = (MethodDeclaration) node;

					SingleVariableDeclaration decl = ast.newSingleVariableDeclaration();
					decl.setName(ast.newSimpleName(variableModel.getPhrase()));
					Type type = getTypeFromModel(variableModel, ast);
					decl.setType(type);
					listRewrite = rewriter.getListRewrite(node, MethodDeclaration.PARAMETERS_PROPERTY);
					listRewrite.insertLast(decl,  null);

					EditorManager.updateCompilationUnit(rewriter.rewriteAST());
					EditorManager.moveToNode(decl);



				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	//same in create variable operation -> make managers (like at first)
	private Type getTypeFromModel(VariableModel variableModel, AST ast) {
		Type type = null;
		if(variableModel.isPrimitive) {
			type = ast.newPrimitiveType(variableModel.getType());
		} else if (!variableModel.simpleType.isEmpty()) {
			type = ast.newSimpleType(ast.newSimpleName(variableModel.simpleType));
		} else {
			return null; //throw
		}

		if(variableModel.isArray) {									
			type = ast.newArrayType(type);
		}

		return type;
	}
}
