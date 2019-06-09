package at.ooe.fh.mc.codespeech.interpreter.operations.modification;

import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.rewrite.ASTRewrite;
import org.eclipse.jface.text.BadLocationException;

import at.ooe.fh.mc.codespeech.interpreter.models.Model;
import at.ooe.fh.mc.codespeech.interpreter.operations.Operation;
import at.ooe.fh.mc.codespeech.plugin.Context;
import at.ooe.fh.mc.codespeech.plugin.utils.UIManager;

public class DeleteNodeInLineOperation implements Operation {

	@Override
	public void perform(Object property) {

		AST ast = Context.currentNode.getAST();		
		ASTRewrite rewriter = ASTRewrite.create(ast);
		rewriter.remove(Context.currentNode, null);
		int lineNumber = UIManager.getLineOfNode(Context.currentNode);
		try {
			UIManager.updateCompilationUnit(rewriter.rewriteAST());
			UIManager.moveToLine(lineNumber);
		} catch (JavaModelException | IllegalArgumentException | BadLocationException e) {
			e.printStackTrace();
		}
	}

}
