package at.ooe.fh.mc.codespeech.interpreter.operations.creation;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.jdt.core.ISourceRange;
import org.eclipse.jdt.core.ToolFactory;
import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.Block;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jdt.core.dom.IfStatement;
import org.eclipse.jdt.core.dom.MethodInvocation;
import org.eclipse.jdt.core.dom.QualifiedName;
import org.eclipse.jdt.core.dom.Statement;
import org.eclipse.jdt.core.dom.rewrite.ASTRewrite;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.Document;
import org.eclipse.text.edits.TextEdit;

import at.ooe.fh.mc.codespeech.interpreter.models.MethodInvocationModel;
import at.ooe.fh.mc.codespeech.interpreter.models.Model;
import at.ooe.fh.mc.codespeech.interpreter.operations.Operation;
import at.ooe.fh.mc.codespeech.plugin.Context;
import at.ooe.fh.mc.codespeech.plugin.ast.ASTManager;
import at.ooe.fh.mc.codespeech.plugin.utils.UIManager;

public class CreateMethodInvocationOperation implements Operation {

	
	@Override
	public void perform(Object property) {
		if(property instanceof MethodInvocationModel) {
			MethodInvocationModel methodInvocationModel = (MethodInvocationModel) property;
			ASTNode node = Context.currentNode;
			if (node != null) {
				AST ast = node.getAST();		
				ASTRewrite rewriter = ASTRewrite.create(ast);
				MethodInvocation methodInvocation = ast.newMethodInvocation();	
				if(!methodInvocationModel.variableName.isEmpty()) {
					methodInvocation.setExpression(ast.newSimpleName(methodInvocationModel.variableName));
				} 
				methodInvocation.setName(
						ast.newSimpleName(
								methodInvocationModel.methodsToInvoke.get(0)));
				
				for(int i = 1; i < methodInvocationModel.methodsToInvoke.size(); i++) {
					MethodInvocation nextMethodInvocation = ast.newMethodInvocation();	
					nextMethodInvocation.setName(
							ast.newSimpleName(
									methodInvocationModel.methodsToInvoke.get(i)));

					nextMethodInvocation.setExpression(methodInvocation);
					methodInvocation = nextMethodInvocation;
				} 
				
				try {

					ASTManager.insertStatement(ast.newExpressionStatement(methodInvocation), node, rewriter);
					//this below should be an event/observer thing
					UIManager.updateCompilationUnit(rewriter.rewriteAST());
					UIManager.moveToNode(methodInvocation);
				} catch (IllegalArgumentException | BadLocationException | CoreException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
