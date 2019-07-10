package at.ooe.fh.mc.codespeech.interpreter.operations.modification;

import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.Type;
import org.eclipse.jdt.core.dom.rewrite.ASTRewrite;
import org.eclipse.jface.text.BadLocationException;

import at.ooe.fh.mc.codespeech.general.utils.StringUtils;
import at.ooe.fh.mc.codespeech.interpreter.models.MethodModel;
import at.ooe.fh.mc.codespeech.interpreter.operations.Operation;
import at.ooe.fh.mc.codespeech.plugin.utils.ASTManager;
import at.ooe.fh.mc.codespeech.plugin.utils.EditorManager;

public class ChangeReturnTypeOperation implements Operation {

	@Override
	public void perform(Object property) throws Exception {
		if(property instanceof MethodModel) {
			MethodModel methodModel = (MethodModel) property;			

			ASTNode node = ASTManager.getCurrentNode();
			if (node != null) {

				while(!(node instanceof MethodDeclaration)) {					
					node = node.getParent();
					if(node == null) {
						return;
					}
				}

				AST ast = node.getAST();		
				ASTRewrite rewriter = ASTRewrite.create(ast);

				Type oldReturnType = ((MethodDeclaration)node).getReturnType2();
				Type newReturnType = null;
				
				if(methodModel.isPrimitive) {
					newReturnType = ast.newPrimitiveType(methodModel.primitiveType);
				} else if (!methodModel.simpleType.isEmpty()) {
					newReturnType = ast.newSimpleType(ast.newSimpleName(StringUtils.toPascalCase(methodModel.simpleType)));
//					ReturnStatement returnStatement = ast.newReturnStatement();
//					returnStatement.setExpression(ast.newNumberLiteral());
//					oldBlock.statements().add(returnStatement);
		        }		
					
				rewriter.replace(oldReturnType, newReturnType, null);
				
				try {
					EditorManager.updateCompilationUnit(rewriter.rewriteAST());
					EditorManager.moveToNode(newReturnType);
				} catch (JavaModelException | IllegalArgumentException | BadLocationException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
