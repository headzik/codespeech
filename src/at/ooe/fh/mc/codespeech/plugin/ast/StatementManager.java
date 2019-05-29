package at.ooe.fh.mc.codespeech.plugin.ast;

import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.Block;
import org.eclipse.jdt.core.dom.Expression;
import org.eclipse.jdt.core.dom.IfStatement;
import org.eclipse.jdt.core.dom.WhileStatement;
import org.eclipse.jdt.core.dom.rewrite.ASTRewrite;
import org.eclipse.jface.text.BadLocationException;

import at.ooe.fh.mc.codespeech.general.utils.StringUtils;
import at.ooe.fh.mc.codespeech.plugin.Context;
import at.ooe.fh.mc.codespeech.plugin.utils.ActiveEditorManager;


/**
 * Manager responsible for performing operations on statements
 * 
 * @author Lukasz Strzelecki
 */
public class StatementManager {

	/**
	 * Creates new if-else structure with the given condition.
	 * CURRENTLY NOT WORKING FOR SPEECH RECOGNITION
	 * 
	 * @param condition
	 * @throws JavaModelException
	 * @throws BadLocationException
	 */
	@SuppressWarnings("unchecked")
	public void createIfStatement(String condition) throws BadLocationException, JavaModelException {
		ASTNode node = Context.currentNode;
		if (node != null) {
		
			AST ast = node.getAST();		
			ASTRewrite rewriter = ASTRewrite.create(ast);
			
			IfStatement ifStatement = ast.newIfStatement();
			Expression conditionExpression = StringUtils.stringToExpression(condition, ast);
			
			ifStatement.setExpression(conditionExpression);
			Block thenBlock = ast.newBlock();
			thenBlock.statements().add(ast.newEmptyStatement());
			ifStatement.setThenStatement(thenBlock);
			Block elseBlock = ast.newBlock();
			elseBlock.statements().add(ast.newEmptyStatement());
			ifStatement.setElseStatement(elseBlock);

			ASTManager.insertStatement(ifStatement, node, rewriter);
			
			ActiveEditorManager.updateCompilationUnit(rewriter.rewriteAST());
			ActiveEditorManager.moveToNode(ifStatement);
		}
	}


	/**
	 * Creates new While loop with the given condition
	 * CURRENTLY NOT WORKING FOR SPEECH RECOGNITION
	 * 
	 * @param condition
	 * @throws JavaModelException if an error in Java model appeared
	 * @throws BadLocationException if initialization was called in a bad place 
	 */
	@SuppressWarnings("unchecked")
	public void createWhileStatement(String name) throws BadLocationException, JavaModelException {
		ASTNode node = Context.currentNode;
		if (node != null) {

			AST ast = node.getAST();		
			ASTRewrite rewriter = ASTRewrite.create(ast);
			
			Expression condition = StringUtils.stringToExpression(name, ast);
			
			WhileStatement whileStatement = ast.newWhileStatement();
						
			whileStatement.setExpression(condition);
			Block block = ast.newBlock();
			block.statements().add(ast.newEmptyStatement());
			whileStatement.setBody(block);

			ASTManager.insertStatement(whileStatement, node, rewriter);
			
			ActiveEditorManager.updateCompilationUnit(rewriter.rewriteAST());
			ActiveEditorManager.moveToNode(whileStatement);
		}
	}
	
}
