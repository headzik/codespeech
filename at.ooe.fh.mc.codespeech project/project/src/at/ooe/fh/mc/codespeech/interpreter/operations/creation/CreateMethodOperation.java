package at.ooe.fh.mc.codespeech.interpreter.operations.creation;

import java.util.List;

import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.Block;
import org.eclipse.jdt.core.dom.BodyDeclaration;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.Modifier;
import org.eclipse.jdt.core.dom.TypeDeclaration;
import org.eclipse.jdt.core.dom.rewrite.ASTRewrite;
import org.eclipse.jdt.core.dom.rewrite.ListRewrite;
import org.eclipse.jface.text.BadLocationException;

import at.ooe.fh.mc.codespeech.interpreter.models.AccessModifier;
import at.ooe.fh.mc.codespeech.interpreter.models.MethodModel;
import at.ooe.fh.mc.codespeech.interpreter.operations.Operation;
import at.ooe.fh.mc.codespeech.plugin.utils.ASTManager;
import at.ooe.fh.mc.codespeech.plugin.utils.EditorManager;

public class CreateMethodOperation implements Operation {

	@Override
	public void perform(Object property) throws Exception {
		if(property instanceof MethodModel) {
			MethodModel methodModel = (MethodModel) property;

				ASTNode node = ASTManager.getCurrentNode();
				if (node != null) {
					
					if(node instanceof CompilationUnit) {
						node = ASTManager.getNextNodeOfType(node, TypeDeclaration.class);
					}
					while(!(node instanceof TypeDeclaration)) {					
						node = node.getParent();
					}

					TypeDeclaration typeDeclaration = (TypeDeclaration) node;

					AST ast = node.getAST();		
					ASTRewrite rewriter = ASTRewrite.create(ast);

					MethodDeclaration methodDeclaration = ast.newMethodDeclaration();		
					List<Modifier> modifiers = methodDeclaration.modifiers();

					if(methodModel.accessModifier != null) {
						modifiers.add(ast.newModifier(AccessModifier.toASTNodeKeyword(methodModel.accessModifier)));
					}							
					if(methodModel.isAbstract) {
						modifiers.add(ast.newModifier(Modifier.ModifierKeyword.ABSTRACT_KEYWORD));
					}							
					if(methodModel.isStatic) {
						modifiers.add(ast.newModifier(Modifier.ModifierKeyword.STATIC_KEYWORD));
					}		
					if(methodModel.isFinal) {
						modifiers.add(ast.newModifier(Modifier.ModifierKeyword.FINAL_KEYWORD));
					}	

					if(canHaveBody(typeDeclaration, methodModel)) {
						Block block = ast.newBlock();
						block.statements().add(ast.newEmptyStatement());
						methodDeclaration.setBody(block);	
					}


					methodDeclaration.setName(ast.newSimpleName(methodModel.name));
//					if(methodModel.isPrimitive) {
//						methodDeclaration.setReturnType2(ast.newPrimitiveType(methodModel.primitiveType));
//					} else if (!methodModel.simpleType.isEmpty()) {
//						methodDeclaration.setReturnType2(ast.newSimpleType(ast.newSimpleName(methodModel.simpleType)));
//						ReturnStatement returnStatement = ast.newReturnStatement();
//						returnStatement.setExpression(ast.newNumberLiteral());
//						block.statements().add(returnStatement);
//					}							

					ListRewrite listRewrite = rewriter.getListRewrite(node, TypeDeclaration.BODY_DECLARATIONS_PROPERTY);
					ASTNode nextNode = ASTManager.getNextNodeOfType(node, BodyDeclaration.class);
					if(nextNode != null && !node.equals(nextNode)) {
						listRewrite.insertBefore(methodDeclaration, nextNode, null);	
					} else {
						listRewrite.insertLast(methodDeclaration, null);
					}

					EditorManager.updateCompilationUnit(rewriter.rewriteAST());
					EditorManager.moveToNode(methodDeclaration);

				}

		}
	}

	private boolean canHaveBody(TypeDeclaration typeDeclaration, MethodModel methodModel) {
		return !typeDeclaration.isInterface() ||
				(typeDeclaration.isInterface() && methodModel.isStatic);
	}

}

