package at.ooe.fh.mc.codespeech.interpreter.operations.modification;

import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.ChildListPropertyDescriptor;
import org.eclipse.jdt.core.dom.MethodInvocation;
import org.eclipse.jdt.core.dom.SimpleName;
import org.eclipse.jdt.core.dom.SuperConstructorInvocation;
import org.eclipse.jdt.core.dom.rewrite.ASTRewrite;
import org.eclipse.jdt.core.dom.rewrite.ListRewrite;
import org.eclipse.jface.text.BadLocationException;

import at.ooe.fh.mc.codespeech.interpreter.operations.Operation;
import at.ooe.fh.mc.codespeech.plugin.utils.ASTManager;
import at.ooe.fh.mc.codespeech.plugin.utils.EditorManager;

public class AddArgumentOperation implements Operation {

	@Override
	public void perform(Object property) throws Exception {
		if(property instanceof String) {
			ASTNode currentNode = ASTManager.getCurrentNode();
			
			if(currentNode instanceof SuperConstructorInvocation) {
				addArgument(currentNode, (String) property, SuperConstructorInvocation.ARGUMENTS_PROPERTY);
				
			} else {
				currentNode = ASTManager.getNextNodeOfType(ASTManager.getCurrentNode(), MethodInvocation.class);
				if(currentNode != null) {
					addArgument(currentNode, (String) property, MethodInvocation.ARGUMENTS_PROPERTY);
				} 
			} 			

		}
	}

	private void addArgument(ASTNode node, String argumentName, ChildListPropertyDescriptor descriptor) throws JavaModelException, IllegalArgumentException, BadLocationException {
		AST ast = node.getAST();
		ASTRewrite rewriter = ASTRewrite.create(ast);
		ListRewrite listRewrite = rewriter.getListRewrite(node, descriptor);
		SimpleName name = ast.newSimpleName((String) argumentName);
		listRewrite.insertLast(name,  null);	

		EditorManager.updateCompilationUnit(rewriter.rewriteAST());
		EditorManager.moveToNode(name);
	}
}
