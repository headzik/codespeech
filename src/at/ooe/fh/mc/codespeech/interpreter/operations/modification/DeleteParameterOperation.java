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
import at.ooe.fh.mc.codespeech.plugin.Context;
import at.ooe.fh.mc.codespeech.plugin.utils.UIManager;

public class DeleteParameterOperation implements Operation {

	@Override
	public void perform(Object property) {
		if(property instanceof Integer) {
			try {
				ASTNode node = Context.currentNode;
				if (node != null && node instanceof MethodDeclaration) {
					AST ast = node.getAST();
					ASTRewrite rewriter = ASTRewrite.create(ast);
					ListRewrite listRewrite;

					MethodDeclaration methodDeclaration = (MethodDeclaration) node;

					SingleVariableDeclaration decl = (SingleVariableDeclaration) methodDeclaration.parameters().get(((Integer) property) - 1);
					listRewrite = rewriter.getListRewrite(node, MethodDeclaration.PARAMETERS_PROPERTY);
					listRewrite.remove(decl,  null);	
					UIManager.updateCompilationUnit(rewriter.rewriteAST());
					UIManager.moveToNode(decl);					


				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
