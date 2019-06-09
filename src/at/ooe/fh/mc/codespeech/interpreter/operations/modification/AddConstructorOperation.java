package at.ooe.fh.mc.codespeech.interpreter.operations.modification;

import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.Block;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.TypeDeclaration;
import org.eclipse.jdt.core.dom.rewrite.ASTRewrite;
import org.eclipse.jdt.core.dom.rewrite.ListRewrite;
import org.eclipse.jface.text.BadLocationException;

import at.ooe.fh.mc.codespeech.interpreter.operations.Operation;
import at.ooe.fh.mc.codespeech.plugin.Context;
import at.ooe.fh.mc.codespeech.plugin.utils.UIManager;

public class AddConstructorOperation implements Operation {

	@Override
	public void perform(Object property) {
		try {
			ASTNode node = Context.currentNode;
			if (node != null) {

				while(!(node instanceof TypeDeclaration)) {					
					node = node.getParent();
				}

				TypeDeclaration typeDeclaration = (TypeDeclaration) node;

				AST ast = node.getAST();		
				ASTRewrite rewriter = ASTRewrite.create(ast);

				MethodDeclaration constructor = ast.newMethodDeclaration();
				constructor.setConstructor(true);
				constructor.setName(ast.newSimpleName(typeDeclaration.getName().toString()));

				Block block = ast.newBlock();
				block.statements().add(ast.newEmptyStatement());
				constructor.setBody(block);	
				
				ListRewrite listRewrite = rewriter.getListRewrite(node, TypeDeclaration.BODY_DECLARATIONS_PROPERTY);
				listRewrite.insertFirst(constructor, null);					

				UIManager.updateCompilationUnit(rewriter.rewriteAST());
				UIManager.moveToNode(constructor.getName());

			}
		} catch(JavaModelException | IllegalArgumentException | BadLocationException exception) {
			exception.printStackTrace();
		} 
	}


}
