package at.ooe.fh.mc.codespeech.interpreter.operations.modification;

import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.rewrite.ASTRewrite;
import org.eclipse.jface.text.BadLocationException;

import at.ooe.fh.mc.codespeech.interpreter.operations.Operation;
import at.ooe.fh.mc.codespeech.plugin.utils.ASTManager;
import at.ooe.fh.mc.codespeech.plugin.utils.EditorManager;

public class DeleteNodeInLineOperation implements Operation {

	@Override
	public void perform(Object property) throws Exception {

		ASTNode currentNode = ASTManager.getCurrentNode();
		AST ast = currentNode.getAST();		
		ASTRewrite rewriter = ASTRewrite.create(ast);
		rewriter.remove(currentNode, null);
		int lineNumber = EditorManager.getLineOfNode(currentNode);
		try {
			EditorManager.updateCompilationUnit(rewriter.rewriteAST());
			EditorManager.moveToLine(lineNumber);
		} catch (JavaModelException | IllegalArgumentException | BadLocationException e) {
			e.printStackTrace();
		}
	}

}
