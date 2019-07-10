package at.ooe.fh.mc.codespeech.interpreter.operations.modification;

import java.util.List;

import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.Block;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.Modifier;
import org.eclipse.jdt.core.dom.TypeDeclaration;
import org.eclipse.jdt.core.dom.rewrite.ASTRewrite;
import org.eclipse.jdt.core.dom.rewrite.ListRewrite;

import at.ooe.fh.mc.codespeech.interpreter.models.AccessModifier;
import at.ooe.fh.mc.codespeech.interpreter.operations.Operation;
import at.ooe.fh.mc.codespeech.plugin.utils.ASTManager;
import at.ooe.fh.mc.codespeech.plugin.utils.EditorManager;

public class AddConstructorOperation implements Operation {

	@Override
	public void perform(Object property) throws Exception {
		ASTNode node = ASTManager.getCurrentNode();
		if (node != null) {

			if(!(node instanceof TypeDeclaration)) {
				node = ASTManager.getNextNodeOfType(node.getRoot(), TypeDeclaration.class);
				if(node == null) return;
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

			EditorManager.updateCompilationUnit(rewriter.rewriteAST());
			EditorManager.moveToNode(constructor.getName());

		}
	}


}
