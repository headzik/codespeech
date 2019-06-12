package at.ooe.fh.mc.codespeech.interpreter.operations.creation;

import java.util.List;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.BodyDeclaration;
import org.eclipse.jdt.core.dom.FieldDeclaration;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.Modifier;
import org.eclipse.jdt.core.dom.ReturnStatement;
import org.eclipse.jdt.core.dom.Type;
import org.eclipse.jdt.core.dom.TypeDeclaration;
import org.eclipse.jdt.core.dom.VariableDeclarationFragment;
import org.eclipse.jdt.core.dom.VariableDeclarationStatement;
import org.eclipse.jdt.core.dom.rewrite.ASTRewrite;
import org.eclipse.jdt.core.dom.rewrite.ListRewrite;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.ui.progress.UIJob;

import at.ooe.fh.mc.codespeech.interpreter.models.AccessModifier;
import at.ooe.fh.mc.codespeech.interpreter.models.Model;
import at.ooe.fh.mc.codespeech.interpreter.models.VariableModel;
import at.ooe.fh.mc.codespeech.interpreter.operations.Operation;
import at.ooe.fh.mc.codespeech.plugin.Context;
import at.ooe.fh.mc.codespeech.plugin.ast.ASTManager;
import at.ooe.fh.mc.codespeech.plugin.utils.UIManager;

public class CreateVariableOperation implements Operation {

	//TODO: get rid of repetitions
	@Override
	public void perform(Object property) {
		if(property instanceof VariableModel) {
			VariableModel variableModel = (VariableModel) property;
			try {
				ASTNode node = Context.currentNode;
				if (node != null) {
					AST ast = node.getAST();		
					ASTRewrite rewriter = ASTRewrite.create(ast);

					VariableDeclarationFragment declarationFragment = ast.newVariableDeclarationFragment();
					declarationFragment.setName(ast.newSimpleName(variableModel.getPhrase()));		

					if(node instanceof TypeDeclaration || node instanceof FieldDeclaration ||
							node instanceof MethodDeclaration) {								

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

						UIManager.updateCompilationUnit(rewriter.rewriteAST());
						UIManager.moveToNode(fieldDeclaration);
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
						UIManager.updateCompilationUnit(rewriter.rewriteAST());
						UIManager.moveToNode(declarationStatement);
					}

				}		
			} catch(JavaModelException | IllegalArgumentException | BadLocationException exception) {
				exception.printStackTrace();
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
