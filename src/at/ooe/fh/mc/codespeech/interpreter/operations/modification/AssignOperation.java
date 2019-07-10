package at.ooe.fh.mc.codespeech.interpreter.operations.modification;

import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.Assignment;
import org.eclipse.jdt.core.dom.Assignment.Operator;
import org.eclipse.jdt.core.dom.ExpressionStatement;
import org.eclipse.jdt.core.dom.rewrite.ASTRewrite;

import at.ooe.fh.mc.codespeech.interpreter.models.VariableModel;
import at.ooe.fh.mc.codespeech.interpreter.operations.Operation;
import at.ooe.fh.mc.codespeech.plugin.utils.ASTManager;
import at.ooe.fh.mc.codespeech.plugin.utils.EditorManager;

public class AssignOperation implements Operation {

	@Override
	public void perform(Object property) throws Exception {

		if(property instanceof VariableModel) {
			VariableModel variableModel = (VariableModel) property;

			ASTNode node = ASTManager.getCurrentNode();
			if (node != null) {
				AST ast = node.getAST();		
				ASTRewrite rewriter = ASTRewrite.create(ast);

				//if (node instanceof ExpressionStatement) {

				//					ExpressionStatement expressionStatement = (ExpressionStatement) node;
				//					Expression expression = expressionStatement.getExpression();
				//								
				Assignment assignment = ast.newAssignment();
				assignment.setLeftHandSide(ast.newSimpleName(variableModel.name));
				assignment.setRightHandSide(ast.newSimpleName(variableModel.initializator));
				assignment.setOperator(Operator.ASSIGN);					
				ExpressionStatement expressionStatement = ast.newExpressionStatement(assignment);

				ASTManager.insertStatement(expressionStatement, node, rewriter);
				//this below should be an event/observer thing
				EditorManager.updateCompilationUnit(rewriter.rewriteAST());
				EditorManager.moveToNode(expressionStatement);
				//}

			}
		}
	}

}
