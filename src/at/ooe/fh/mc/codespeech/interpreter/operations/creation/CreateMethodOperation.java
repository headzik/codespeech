package at.ooe.fh.mc.codespeech.interpreter.operations.creation;

import java.util.List;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.Block;
import org.eclipse.jdt.core.dom.BodyDeclaration;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.Modifier;
import org.eclipse.jdt.core.dom.PrimitiveType;
import org.eclipse.jdt.core.dom.ReturnStatement;
import org.eclipse.jdt.core.dom.TypeDeclaration;
import org.eclipse.jdt.core.dom.rewrite.ASTRewrite;
import org.eclipse.jdt.core.dom.rewrite.ListRewrite;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.ui.progress.UIJob;

import at.ooe.fh.mc.codespeech.interpreter.models.AccessModifier;
import at.ooe.fh.mc.codespeech.interpreter.models.MethodModel;
import at.ooe.fh.mc.codespeech.interpreter.models.Model;
import at.ooe.fh.mc.codespeech.interpreter.operations.Operation;
import at.ooe.fh.mc.codespeech.plugin.Context;
import at.ooe.fh.mc.codespeech.plugin.ast.ASTManager;
import at.ooe.fh.mc.codespeech.plugin.utils.UIManager;

public class CreateMethodOperation implements Operation {

	@Override
	public void perform(Model model) {
		if(model instanceof MethodModel) {
			MethodModel methodModel = (MethodModel) model;
			new UIJob("CreateMethod") {

				@Override
				public IStatus runInUIThread(IProgressMonitor monitor) {

					try {
						ASTNode node = Context.currentNode;
						if (node != null) {

							while(!(node instanceof TypeDeclaration)) {					
								node = node.getParent();
							}

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

							Block block = ast.newBlock();
							block.statements().add(ast.newEmptyStatement());
							methodDeclaration.setBody(block);	
							
							methodDeclaration.setName(ast.newSimpleName(methodModel.name));
							if(methodModel.isPrimitive) {
								methodDeclaration.setReturnType2(ast.newPrimitiveType(methodModel.primitiveType));
							} else if (!methodModel.simpleType.isEmpty()) {
								methodDeclaration.setReturnType2(ast.newSimpleType(ast.newSimpleName(methodModel.simpleType)));
								ReturnStatement returnStatement = ast.newReturnStatement();
								returnStatement.setExpression(ast.newNumberLiteral());
								block.statements().add(returnStatement);
					        }							

							ListRewrite listRewrite = rewriter.getListRewrite(node, TypeDeclaration.BODY_DECLARATIONS_PROPERTY);
							//ASTNode nextNode = UIManager.getChildAfterCurrentLine(node, BodyDeclaration.class);
						//	if(nextNode != null && !node.equals(nextNode)) {
								//listRewrite.insertAfter(methodDeclaration, nextNode, null);	
							//} else {
								listRewrite.insertLast(methodDeclaration, null);
							//}

							UIManager.updateCompilationUnit(rewriter.rewriteAST());
							UIManager.moveToNode(methodDeclaration);

							return Status.OK_STATUS;
						}
					} catch(JavaModelException | IllegalArgumentException | BadLocationException exception) {
						exception.printStackTrace();
					} 

					return Status.CANCEL_STATUS;
				}
			}.schedule();
		}
	}
}

