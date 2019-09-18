package at.ooe.fh.mc.codespeech.interpreter.operations.creation;

import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.Block;
import org.eclipse.jdt.core.dom.EmptyStatement;
import org.eclipse.jdt.core.dom.Expression;
import org.eclipse.jdt.core.dom.IfStatement;
import org.eclipse.jdt.core.dom.rewrite.ASTRewrite;
import org.eclipse.jface.text.BadLocationException;

import at.ooe.fh.mc.codespeech.general.utils.StringUtils;
import at.ooe.fh.mc.codespeech.interpreter.models.ConditionalModel;
import at.ooe.fh.mc.codespeech.interpreter.operations.Operation;
import at.ooe.fh.mc.codespeech.plugin.utils.ASTManager;
import at.ooe.fh.mc.codespeech.plugin.utils.EditorManager;

public class CreateIfStatementOperation implements Operation {

	@Override
	public void perform(Object property) throws Exception {
		if(property instanceof ConditionalModel) {
			ConditionalModel ifModel = (ConditionalModel) property;
			ASTNode node = ASTManager.getCurrentNode();
			if (node != null) {
				
				AST ast = node.getAST();		
				ASTRewrite rewriter = ASTRewrite.create(ast);
				
				IfStatement ifStatement = ast.newIfStatement();
				Expression conditionExpression = StringUtils.stringToExpression(ifModel.condition, ast);
				
				ifStatement.setExpression(conditionExpression);
				Block thenBlock = ast.newBlock();
				EmptyStatement emtpyStatement = ast.newEmptyStatement();
				thenBlock.statements().add(emtpyStatement);
				ifStatement.setThenStatement(thenBlock);
				ASTManager.insertStatement(ifStatement, node, rewriter);
				
				EditorManager.updateCompilationUnit(rewriter.rewriteAST());

				EditorManager.moveToNode(emtpyStatement);		
			}
		}
	}


	
}
