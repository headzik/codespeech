package at.ooe.fh.mc.codespeech.interpreter.listeners;

import at.ooe.fh.mc.codespeech.interpreter.InterpreterContext;
import at.ooe.fh.mc.codespeech.interpreter.grammar.GrammarParser.AdditionContext;
import at.ooe.fh.mc.codespeech.interpreter.grammar.GrammarParser.AssignmentContext;
import at.ooe.fh.mc.codespeech.interpreter.grammar.GrammarParser.ChangeReturnTypeKeywordContext;
import at.ooe.fh.mc.codespeech.interpreter.grammar.GrammarParser.CreationContext;
import at.ooe.fh.mc.codespeech.interpreter.grammar.GrammarParser.DeletionContext;
import at.ooe.fh.mc.codespeech.interpreter.grammar.GrammarParser.ExtensionContext;
import at.ooe.fh.mc.codespeech.interpreter.grammar.GrammarParser.FreespeechContext;
import at.ooe.fh.mc.codespeech.interpreter.grammar.GrammarParser.ImplementationContext;
import at.ooe.fh.mc.codespeech.interpreter.grammar.GrammarParser.InitializeKeywordContext;
import at.ooe.fh.mc.codespeech.interpreter.grammar.GrammarParser.MethodInvocationContext;
import at.ooe.fh.mc.codespeech.interpreter.grammar.GrammarParser.NavigationContext;
import at.ooe.fh.mc.codespeech.interpreter.grammar.GrammarParser.PhraseContext;
import at.ooe.fh.mc.codespeech.interpreter.grammar.GrammarParser.ReturnStatementContext;
import at.ooe.fh.mc.codespeech.interpreter.grammar.GrammarParser.SelectionContext;
import at.ooe.fh.mc.codespeech.interpreter.grammar.GrammarParser.UndoContext;
import at.ooe.fh.mc.codespeech.interpreter.operations.modification.ReturnOperation;
import at.ooe.fh.mc.codespeech.interpreter.operations.modification.UndoOperation;

public class InitialListener extends BaseKeywordListener {
		
	
	public InitialListener(InterpreterContext context) {
		super(context);
	}

	@Override
	public void enterUndo(UndoContext ctx) {
		changeOperation(new UndoOperation());
		
		super.enterUndo(ctx);
	}
	
	@Override
	public void enterCreation(CreationContext ctx) {
		super.enterCreation(ctx);
						
		context.continueWith(new CreationListener(context));
	}
	
	@Override
	public void enterSelection(SelectionContext ctx) {
		super.enterSelection(ctx);
						
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
	
	@Override
	public void enterExtension(ExtensionContext ctx) {
		super.enterExtension(ctx);

		context.continueWith(new ExtensionListener(context));
	}
	
	@Override
	public void enterReturnStatement(ReturnStatementContext ctx) {
		super.enterReturnStatement(ctx);
		
		context.continueWith(new ReturnListener(context));
	}
	
}
