package at.ooe.fh.mc.codespeech.interpreter.listeners;

import at.ooe.fh.mc.codespeech.interpreter.GrammarParser.ChangeReturnTypeKeywordContext;
import at.ooe.fh.mc.codespeech.interpreter.GrammarParser.CreationVerbContext;
import at.ooe.fh.mc.codespeech.interpreter.GrammarParser.DeletionContext;
import at.ooe.fh.mc.codespeech.interpreter.GrammarParser.InitializeKeywordContext;
import at.ooe.fh.mc.codespeech.interpreter.GrammarParser.MethodInvocationContext;
import at.ooe.fh.mc.codespeech.interpreter.GrammarParser.NavigationVerbContext;
import at.ooe.fh.mc.codespeech.interpreter.GrammarParser.SelectionVerbContext;
import at.ooe.fh.mc.codespeech.plugin.Context;
import at.ooe.fh.mc.codespeech.plugin.utils.UIManager;

import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.rewrite.ASTRewrite;
import org.eclipse.jface.text.BadLocationException;

import at.ooe.fh.mc.codespeech.interpreter.InterpreterContext;

public class InitialListener extends BaseKeywordListener {
		
	
	public InitialListener(InterpreterContext context) {
		super(context);
	}
	
	@Override
	public void enterCreationVerb(CreationVerbContext ctx) {
		super.enterCreationVerb(ctx);
						
		context.continueWith(new CreationListener(context));
	}
	
	@Override
	public void enterSelectionVerb(SelectionVerbContext ctx) {
		super.enterSelectionVerb(ctx);
						
		context.continueWith(new SelectionListener(context));
	}
	
	@Override
	public void enterNavigationVerb(NavigationVerbContext ctx) {
		super.enterNavigationVerb(ctx);
						
		context.continueWith(new NavigationListener(context));
	}

	@Override
	public void enterInitializeKeyword(InitializeKeywordContext ctx) {
		super.enterInitializeKeyword(ctx);
		
		context.continueWith(new InitializationListener(context));
	}
	
	@Override
	public void enterChangeReturnTypeKeyword(ChangeReturnTypeKeywordContext ctx) {
		super.enterChangeReturnTypeKeyword(ctx);
		
		context.continueWith(new ChangeReturnTypeKeywordListener(context));
	}
	
	@Override
	public void enterDeletion(DeletionContext ctx) {
		super.enterDeletion(ctx);
		
		//move somewhere?
		
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
	
	@Override
	public void enterMethodInvocation(MethodInvocationContext ctx) {
		super.enterMethodInvocation(ctx);
		
		context.continueWith(new MethodInvocationListener(context));
	}
}
