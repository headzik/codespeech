package at.ooe.fh.mc.codespeech.interpreter.listeners;

import at.ooe.fh.mc.codespeech.interpreter.GrammarParser.AdditionContext;
import at.ooe.fh.mc.codespeech.interpreter.GrammarParser.AssignmentContext;
import at.ooe.fh.mc.codespeech.interpreter.GrammarParser.ChangeReturnTypeKeywordContext;
import at.ooe.fh.mc.codespeech.interpreter.GrammarParser.CommandContext;
import at.ooe.fh.mc.codespeech.interpreter.GrammarParser.CreationVerbContext;
import at.ooe.fh.mc.codespeech.interpreter.GrammarParser.DeletionContext;
import at.ooe.fh.mc.codespeech.interpreter.GrammarParser.FreespeechContext;
import at.ooe.fh.mc.codespeech.interpreter.GrammarParser.ImplementationContext;
import at.ooe.fh.mc.codespeech.interpreter.GrammarParser.InitializeKeywordContext;
import at.ooe.fh.mc.codespeech.interpreter.GrammarParser.MethodInvocationContext;
import at.ooe.fh.mc.codespeech.interpreter.GrammarParser.NavigationContext;
import at.ooe.fh.mc.codespeech.interpreter.GrammarParser.NavigationVerbContext;
import at.ooe.fh.mc.codespeech.interpreter.GrammarParser.PhraseContext;
import at.ooe.fh.mc.codespeech.interpreter.GrammarParser.SelectionVerbContext;
import at.ooe.fh.mc.codespeech.interpreter.operations.modification.FreeSpeechOperation;
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
	public void enterNavigation(NavigationContext ctx) {
		super.enterNavigation(ctx);
						
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

		context.continueWith(new DeletionListener(context));
	}
	
	@Override
	public void enterMethodInvocation(MethodInvocationContext ctx) {
		super.enterMethodInvocation(ctx);
				
		context.continueWith(new MethodInvocationListener(context));
	}
	
	@Override
	public void enterImplementation(ImplementationContext ctx) {
		super.enterImplementation(ctx);

		context.continueWith(new ImplementationListener(context));
	}
	
	@Override
	public void enterAddition(AdditionContext ctx) {
		super.enterAddition(ctx);

		context.continueWith(new AdditionListener(context));
	}
	
	@Override
	public void enterFreespeech(FreespeechContext ctx) {
		super.enterFreespeech(ctx);

		context.continueWith(new FreeSpeechListener(context));
	}
	
	@Override
	public void enterAssignment(AssignmentContext ctx) {
		super.enterAssignment(ctx);
		
		context.continueWith(new AssignListener(context));
	}
}
