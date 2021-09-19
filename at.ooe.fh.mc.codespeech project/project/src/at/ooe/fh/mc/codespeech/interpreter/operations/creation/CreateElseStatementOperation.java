package at.ooe.fh.mc.codespeech.interpreter.operations.creation;

import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.Block;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jdt.core.dom.Expression;
import org.eclipse.jdt.core.dom.IfStatement;

import at.ooe.fh.mc.codespeech.general.utils.StringUtils;
import at.ooe.fh.mc.codespeech.interpreter.models.ConditionalModel;
import at.ooe.fh.mc.codespeech.interpreter.operations.Operation;
import at.ooe.fh.mc.codespeech.plugin.utils.ASTManager;
import at.ooe.fh.mc.codespeech.plugin.utils.EditorManager;

public class CreateElseStatementOperation implements Operation {

	@Override
	public void perform(Object property) throws Exception {
		if(property instanceof ConditionalModel) {
			ConditionalModel ifModel = (ConditionalModel) property;
			ASTNode node = ASTManager.getCurrentNode();
			if (node != null) {
				while(!(node instanceof IfStatement)) {
					node = node.getParent();
					if(node == null) {
						return;
					}
				}
				CompilationUnit cu = (CompilationUnit) node.getRoot();
				AST ast = cu.getAST();
				cu.recordModifications();

				IfStatement oldIfStatement = (IfStatement) node;
				IfStatement newElseStatement = ast.newIfStatement();

				Block elseBlock = ast.newBlock();
				elseBlock.statements().add(ast.newEmptyStatement());

				if(!ifModel.condition.trim().isEmpty()) {
					Expression elseConditionExpression = StringUtils.stringToExpression(ifModel.condition, ast);
					newElseStatement.setExpression(elseConditionExpression);
					newElseStatement.setThenStatement(elseBlock);
					oldIfStatement.setElseStatement(newElseStatement);
				} else {					
					oldIfStatement.setElseStatement(elseBlock);
				}

				EditorManager.applyChanges(cu);
				EditorManager.moveToNode(elseBlock);
			}
		}
	}
}

