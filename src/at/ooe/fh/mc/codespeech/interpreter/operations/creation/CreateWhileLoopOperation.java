package at.ooe.fh.mc.codespeech.interpreter.operations.creation;

import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.Block;
import org.eclipse.jdt.core.dom.Expression;
import org.eclipse.jdt.core.dom.WhileStatement;
import org.eclipse.jdt.core.dom.rewrite.ASTRewrite;
import org.eclipse.jface.text.BadLocationException;

import at.ooe.fh.mc.codespeech.general.utils.StringUtils;
import at.ooe.fh.mc.codespeech.interpreter.models.ConditionalModel;
import at.ooe.fh.mc.codespeech.interpreter.models.Model;
import at.ooe.fh.mc.codespeech.interpreter.operations.Operation;
import at.ooe.fh.mc.codespeech.plugin.Context;
import at.ooe.fh.mc.codespeech.plugin.ast.ASTManager;
import at.ooe.fh.mc.codespeech.plugin.utils.UIManager;

public class CreateWhileLoopOperation implements Operation {

	@Override
	public void perform(Model model) {
		if(model instanceof ConditionalModel) {
			ConditionalModel ifModel = (ConditionalModel) model;
			ASTNode node = Context.currentNode;
			if (node != null) {

				AST ast = node.getAST();		
				ASTRewrite rewriter = ASTRewrite.create(ast);

				Expression condition = StringUtils.stringToExpression(ifModel.getPhrase(), ast);

				WhileStatement whileStatement = ast.newWhileStatement();

				whileStatement.setExpression(condition);
				Block block = ast.newBlock();
				block.statements().add(ast.newEmptyStatement());
				whileStatement.setBody(block);

				ASTManager.insertStatement(whileStatement, node, rewriter);

				try {
					UIManager.updateCompilationUnit(rewriter.rewriteAST());
				} catch (JavaModelException | IllegalArgumentException | BadLocationException e) {
					e.printStackTrace();
				}
				UIManager.moveToNode(whileStatement);
			}
		}
	}

}
