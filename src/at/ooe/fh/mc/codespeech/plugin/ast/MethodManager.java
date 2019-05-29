package at.ooe.fh.mc.codespeech.plugin.ast;

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

import at.ooe.fh.mc.codespeech.plugin.Context;
import at.ooe.fh.mc.codespeech.plugin.utils.ActiveEditorManager;

/**
 * Manager responsible for performing operations on methods
 * 
 * @author Lukasz Strzelecki
 */
public class MethodManager {

	/**
	 * Creates new method of the given name.
	 * 
	 * @param name name of the new method
	 */
	@SuppressWarnings("unchecked")
	public void createNewMethod(String name) {

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
						modifiers.add(ast.newModifier(Modifier.ModifierKeyword.PUBLIC_KEYWORD));
						modifiers.add(ast.newModifier(Modifier.ModifierKeyword.STATIC_KEYWORD));
						methodDeclaration.setName(ast.newSimpleName(name));
						methodDeclaration.setReturnType2(ast.newPrimitiveType(PrimitiveType.INT));
						Block block = ast.newBlock();
						block.statements().add(ast.newEmptyStatement());
						ReturnStatement returnStatement = ast.newReturnStatement();
						returnStatement.setExpression(ast.newNumberLiteral());
						block.statements().add(returnStatement);
						methodDeclaration.setBody(block);	

						ListRewrite listRewrite = rewriter.getListRewrite(node, TypeDeclaration.BODY_DECLARATIONS_PROPERTY);
						ASTNode nextNode = ActiveEditorManager.getChildAfterCurrentLine(node, BodyDeclaration.class);
						if(nextNode != null) {
							listRewrite.insertAfter(methodDeclaration, nextNode, null);	
						} else {
							listRewrite.insertLast(methodDeclaration, null);
						}

						ActiveEditorManager.updateCompilationUnit(rewriter.rewriteAST());
						ActiveEditorManager.moveToNode(methodDeclaration);

					}
				} catch(JavaModelException | IllegalArgumentException | BadLocationException exception) {
					exception.printStackTrace();
				} 
				return Status.OK_STATUS;
			}
		}.schedule();
	}
}
