package at.ooe.fh.mc.codespeech.interpreter.operations.modification;

import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.Assignment;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jdt.core.dom.Assignment.Operator;
import org.eclipse.jdt.core.dom.Expression;
import org.eclipse.jdt.core.dom.ExpressionStatement;
import org.eclipse.jdt.core.dom.PrimitiveType;
import org.eclipse.jdt.core.dom.SimpleType;
import org.eclipse.jdt.core.dom.Type;
import org.eclipse.jdt.core.dom.VariableDeclarationFragment;
import org.eclipse.jdt.core.dom.rewrite.ASTRewrite;
import org.eclipse.jface.text.Document;
import org.eclipse.text.edits.TextEdit;

import at.ooe.fh.mc.codespeech.general.utils.StringUtils;
import at.ooe.fh.mc.codespeech.general.utils.WordToNumber;
import at.ooe.fh.mc.codespeech.interpreter.models.VariableModel;
import at.ooe.fh.mc.codespeech.interpreter.operations.Operation;
import at.ooe.fh.mc.codespeech.plugin.Context;
import at.ooe.fh.mc.codespeech.plugin.ast.ASTManager;
import at.ooe.fh.mc.codespeech.plugin.utils.UIManager;

public class AssignOperation implements Operation {

	@Override
	public void perform(Object property) throws Exception {

		if(property instanceof VariableModel) {
			VariableModel variableModel = (VariableModel) property;

			ASTNode node = Context.currentNode;
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
				UIManager.updateCompilationUnit(rewriter.rewriteAST());
				UIManager.moveToNode(expressionStatement);
				//}

			}
		}
	}

}
