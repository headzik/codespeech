package at.ooe.fh.mc.codespeech.interpreter.operations.creation;

import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.Block;
import org.eclipse.jdt.core.dom.Expression;
import org.eclipse.jdt.core.dom.IfStatement;
import org.eclipse.jdt.core.dom.rewrite.ASTRewrite;
import org.eclipse.jface.text.BadLocationException;

import at.ooe.fh.mc.codespeech.general.utils.StringUtils;
import at.ooe.fh.mc.codespeech.interpreter.models.ConditionalModel;
import at.ooe.fh.mc.codespeech.interpreter.models.Model;
import at.ooe.fh.mc.codespeech.interpreter.operations.Operation;
import at.ooe.fh.mc.codespeech.plugin.Context;
import at.ooe.fh.mc.codespeech.plugin.ast.ASTManager;
import at.ooe.fh.mc.codespeech.plugin.utils.UIManager;

public class CreateIfStatementOperation implements Operation {

	@Override
	public void perform(Object property) {
		if(property instanceof ConditionalModel) {
			ConditionalModel ifModel = (ConditionalModel) property;
			ASTNode node = Context.currentNode;
			if (node != null) {
			
				AST ast = node.getAST();		
				ASTRewrite rewriter = ASTRewrite.create(ast);
				
				IfStatement ifStatement = ast.newIfStatement();
				Expression conditionExpression = StringUtils.stringToExpression(ifModel.condition, ast);
				
				ifStatement.setExpression(conditionExpression);
				Block thenBlock = ast.newBlock();
				thenBlock.statements().add(ast.newEmptyStatement());
				ifStatement.setThenStatement(thenBlock);
				ASTManager.insertStatement(ifStatement, node, rewriter);
				
				try {
					UIManager.updateCompilationUnit(rewriter.rewriteAST());
					UIManager.moveToNode(ifStatement);
				} catch (JavaModelException | IllegalArgumentException | BadLocationException e) {
					e.printStackTrace();
				}
			}
		}
	}


	
}
