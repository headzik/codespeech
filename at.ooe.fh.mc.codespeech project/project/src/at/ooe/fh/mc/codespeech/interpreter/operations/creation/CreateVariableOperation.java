package at.ooe.fh.mc.codespeech.interpreter.operations.creation;

import java.util.List;

import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jdt.core.dom.FieldDeclaration;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.Modifier;
import org.eclipse.jdt.core.dom.Type;
import org.eclipse.jdt.core.dom.TypeDeclaration;
import org.eclipse.jdt.core.dom.VariableDeclarationFragment;
import org.eclipse.jdt.core.dom.VariableDeclarationStatement;
import org.eclipse.jdt.core.dom.rewrite.ASTRewrite;
import org.eclipse.jdt.core.dom.rewrite.ListRewrite;

import at.ooe.fh.mc.codespeech.interpreter.models.AccessModifier;
import at.ooe.fh.mc.codespeech.interpreter.models.VariableModel;
import at.ooe.fh.mc.codespeech.interpreter.operations.Operation;
import at.ooe.fh.mc.codespeech.plugin.utils.ASTManager;
import at.ooe.fh.mc.codespeech.plugin.utils.EditorManager;

public class CreateVariableOperation implements Operation {

	//TODO: get rid of repetitions
	@Override
	public void perform(Object property) throws Exception {
		if(property instanceof VariableModel) {
			VariableModel variableModel = (VariableModel) property;

			ASTNode node = ASTManager.getCurrentNode();
			if (node != null) {
				AST ast = node.getAST();		
				ASTRewrite rewriter = ASTRewrite.create(ast);

				VariableDeclarationFragment declarationFragment = ast.newVariableDeclarationFragment();
				declarationFragment.setName(ast.newSimpleName(variableModel.getPhrase()));		

				if(node instanceof TypeDeclaration || node instanceof FieldDeclaration || node instanceof CompilationUnit) {								

					if(node instanceof CompilationUnit) {
						node = ASTManager.getNextNodeOfType(node, TypeDeclaration.class);
					}
					
					while(!(node instanceof TypeDeclaration)) {					
						node = node.getParent();
					}

					FieldDeclaration fieldDeclaration = ast.newFieldDeclaration(declarationFragment);

					Type type = getTypeFromModel(variableModel, ast);
					fieldDeclaration.setType(type);					

					List<Modifier> modifiers = fieldDeclaration.modifiers();

					if(variableModel.accessModifier != null) {
						modifiers.add(ast.newModifier(AccessModifier.toASTNodeKeyword(variableModel.accessModifier)));
					}	
					if(variableModel.isFinal) {
						modifiers.add(ast.newModifier(Modifier.ModifierKeyword.FINAL_KEYWORD));
					}
					if(variableModel.isStatic) {
						modifiers.add(ast.newModifier(Modifier.ModifierKeyword.STATIC_KEYWORD));
					}
					ListRewrite listRewrite = rewriter.getListRewrite(node, TypeDeclaration.BODY_DECLARATIONS_PROPERTY);
					listRewrite.insertFirst(fieldDeclaration, null);

					EditorManager.updateCompilationUnit(rewriter.rewriteAST());
					EditorManager.moveToNode(fieldDeclaration);
				} else {
					VariableDeclarationStatement declarationStatement = ast.newVariableDeclarationStatement(declarationFragment);

					Type type = getTypeFromModel(variableModel, ast);
					declarationStatement.setType(type);			

					List<Modifier> modifiers = declarationStatement.modifiers();

					if(variableModel.isFinal) {
						modifiers.add(ast.newModifier(Modifier.ModifierKeyword.FINAL_KEYWORD));
					}
					if(variableModel.isStatic) {
						modifiers.add(ast.newModifier(Modifier.ModifierKeyword.STATIC_KEYWORD));
					}
					ASTManager.insertStatement(declarationStatement, node, rewriter);
					//this below should be an event/observer thing
					EditorManager.updateCompilationUnit(rewriter.rewriteAST());
					EditorManager.moveToNode(declarationStatement);
				}

			}		

		}

	}



	private Type getTypeFromModel(VariableModel variableModel, AST ast) {
		Type type = null;
		if(variableModel.isPrimitive) {
			type = ast.newPrimitiveType(variableModel.getType());
		} else if (!variableModel.simpleType.isEmpty()) {
			type = ast.newSimpleType(ast.newSimpleName(variableModel.simpleType));
		} else {
			return null; //throw
		}

		if(variableModel.isArray) {									
			type = ast.newArrayType(type);
		}

		return type;
	}
}
