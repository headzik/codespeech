package at.ooe.fh.mc.codespeech.interpreter.operations.modification;

import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.Assignment;
import org.eclipse.jdt.core.dom.Expression;
import org.eclipse.jdt.core.dom.FieldDeclaration;
import org.eclipse.jdt.core.dom.PrimitiveType;
import org.eclipse.jdt.core.dom.SimpleType;
import org.eclipse.jdt.core.dom.Type;
import org.eclipse.jdt.core.dom.VariableDeclarationFragment;
import org.eclipse.jdt.core.dom.VariableDeclarationStatement;
import org.eclipse.jdt.core.dom.rewrite.ASTRewrite;

import at.ooe.fh.mc.codespeech.general.exceptions.InvalidWordException;
import at.ooe.fh.mc.codespeech.general.utils.StringUtils;
import at.ooe.fh.mc.codespeech.interpreter.models.VariableModel;
import at.ooe.fh.mc.codespeech.interpreter.operations.Operation;
import at.ooe.fh.mc.codespeech.plugin.utils.ASTManager;
import at.ooe.fh.mc.codespeech.plugin.utils.EditorManager;

public class InitializeVariableOperation implements Operation {

	@Override
	public void perform(Object property) throws Exception {

		if(property instanceof VariableModel) {
			VariableModel variableModel = (VariableModel) property;
			
			ASTNode node = ASTManager.getCurrentNode();
			if (node != null) {
				AST ast = node.getAST();		
				ASTRewrite rewriter = ASTRewrite.create(ast);
				
				VariableDeclarationFragment declarationFragment = null;
				Type type = null;
				
				if(node instanceof VariableDeclarationStatement) {
					VariableDeclarationStatement declarationStatement = (VariableDeclarationStatement) node;
			        declarationFragment = (VariableDeclarationFragment) declarationStatement.fragments().get(0);
			        type = declarationStatement.getType();
				} else if (node instanceof FieldDeclaration) {
					FieldDeclaration fieldDeclaration = (FieldDeclaration) node;
				    declarationFragment = (VariableDeclarationFragment) fieldDeclaration.fragments().get(0);
				    type = fieldDeclaration.getType();
				} else {
					return;
				}

				//TODO: should be done in String utils ?
			    if(type instanceof PrimitiveType) {
			    	int number;
			    	try {
			    		number = StringUtils.getNumber(variableModel.initializator);
			    		variableModel.initializator = Integer.toString(number);
			    	} catch(InvalidWordException exception) {
			    		exception.printStackTrace();
		    		}
			    }
				VariableDeclarationFragment newDeclarationFragment = ast.newVariableDeclarationFragment();
				newDeclarationFragment.setName(ast.newSimpleName(declarationFragment.getName().toString()));
											
				if(type instanceof SimpleType) {
					String typeName = ((SimpleType)type).getName().toString();
					if(typeName.equals("String")) {
						newDeclarationFragment.setInitializer(StringUtils.getStringLiteral(variableModel.initializator, ast));
					} 
				} else {
					newDeclarationFragment.setInitializer(StringUtils.stringToExpression(variableModel.initializator, ast));					
				}
				
				rewriter.replace(declarationFragment, newDeclarationFragment, null);
				
				EditorManager.updateCompilationUnit(rewriter.rewriteAST());
				EditorManager.moveToNode(newDeclarationFragment);
				

			}	
		}
	}
	
}
