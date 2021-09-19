package at.ooe.fh.mc.codespeech.interpreter.operations.creation;

import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.MethodInvocation;
import org.eclipse.jdt.core.dom.Statement;
import org.eclipse.jdt.core.dom.rewrite.ASTRewrite;

import at.ooe.fh.mc.codespeech.interpreter.models.MethodInvocationModel;
import at.ooe.fh.mc.codespeech.interpreter.operations.Operation;
import at.ooe.fh.mc.codespeech.plugin.utils.ASTManager;
import at.ooe.fh.mc.codespeech.plugin.utils.EditorManager;

public class CreateMethodInvocationOperation implements Operation {

	
	@Override
	public void perform(Object property) throws Exception {
		if(property instanceof MethodInvocationModel) {
			MethodInvocationModel methodInvocationModel = (MethodInvocationModel) property;
			if(methodInvocationModel.methodsToInvoke.isEmpty()) return;
			ASTNode node = ASTManager.getCurrentNode();
			if (node != null) {

				AST ast = node.getAST();		
				ASTRewrite rewriter = ASTRewrite.create(ast);
				Statement newExpression;
				
				String firstMethodName = methodInvocationModel.methodsToInvoke.get(0);
				if(firstMethodName.equals("super")) {
					newExpression = ast.newSuperConstructorInvocation();
				} else {
					MethodInvocation methodInvocation = ast.newMethodInvocation();
					if(!methodInvocationModel.variableName.isEmpty()) {
						methodInvocation.setExpression(ast.newSimpleName(methodInvocationModel.variableName));
					} 
					
					methodInvocation.setName(ast.newSimpleName(firstMethodName));

					for(int i = 1; i < methodInvocationModel.methodsToInvoke.size(); i++) {
						MethodInvocation nextMethodInvocation = ast.newMethodInvocation();	
						nextMethodInvocation.setName(
								ast.newSimpleName(
										methodInvocationModel.methodsToInvoke.get(i)));

						nextMethodInvocation.setExpression(methodInvocation);
						methodInvocation = nextMethodInvocation;
					} 
					
					newExpression = ast.newExpressionStatement(methodInvocation);
				}
						
				ASTManager.insertStatement(newExpression, node, rewriter);
				//this below should be an event/observer thing
				EditorManager.updateCompilationUnit(rewriter.rewriteAST());
				EditorManager.moveToNode(newExpression);
			}
		}
	}
}
