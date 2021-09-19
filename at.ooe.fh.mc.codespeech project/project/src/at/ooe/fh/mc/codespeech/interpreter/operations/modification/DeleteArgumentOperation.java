package at.ooe.fh.mc.codespeech.interpreter.operations.modification;

import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.MethodInvocation;
import org.eclipse.jdt.core.dom.SimpleName;
import org.eclipse.jdt.core.dom.rewrite.ASTRewrite;
import org.eclipse.jdt.core.dom.rewrite.ListRewrite;

import at.ooe.fh.mc.codespeech.interpreter.operations.Operation;
import at.ooe.fh.mc.codespeech.plugin.utils.ASTManager;
import at.ooe.fh.mc.codespeech.plugin.utils.EditorManager;

public class DeleteArgumentOperation implements Operation {

	@Override
	public void perform(Object property) {
		if(property instanceof Integer) {

			try {
				ASTNode node = ASTManager.getNextNodeOfType(ASTManager.getCurrentNode(), MethodInvocation.class);
				if (node != null) {

					AST ast = node.getAST();
					ASTRewrite rewriter = ASTRewrite.create(ast);
					ListRewrite listRewrite;
								
					if(node instanceof MethodInvocation) {
						MethodInvocation methodInvocation = (MethodInvocation) node;
						SimpleName argument = (SimpleName) methodInvocation.arguments().get(((Integer) property) - 1); 
						
						listRewrite = rewriter.getListRewrite(node, MethodInvocation.ARGUMENTS_PROPERTY);
						listRewrite.remove(argument, null);	
						
						EditorManager.updateCompilationUnit(rewriter.rewriteAST());
						EditorManager.moveToNode(methodInvocation);					
					}

				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	
	}

}
