package at.ooe.fh.mc.codespeech.interpreter.listeners;

import at.ooe.fh.mc.codespeech.interpreter.InterpreterContext;
import at.ooe.fh.mc.codespeech.interpreter.models.ClassModel;
import at.ooe.fh.mc.codespeech.interpreter.models.PackageModel;
import at.ooe.fh.mc.codespeech.interpreter.models.ProjectModel;
import at.ooe.fh.mc.codespeech.interpreter.operations.navigation.SelectAndOpenClassFileOperation;
import at.ooe.fh.mc.codespeech.interpreter.operations.navigation.SelectPackageOperation;
import at.ooe.fh.mc.codespeech.interpreter.operations.navigation.SelectProjectOperation;
import at.ooe.fh.mc.codespeech.interpreter.GrammarParser.ClassKeywordContext;
import at.ooe.fh.mc.codespeech.interpreter.GrammarParser.PackageKeywordContext;
import at.ooe.fh.mc.codespeech.interpreter.GrammarParser.PhraseContext;
import at.ooe.fh.mc.codespeech.interpreter.GrammarParser.ProjectKeywordContext;
import at.ooe.fh.mc.codespeech.interpreter.GrammarParser.SelectionContext;
import at.ooe.fh.mc.codespeech.interpreter.GrammarParser.TypeKeywordContext;

public class SelectionListener extends BaseKeywordListener {
	
	public SelectionListener(InterpreterContext context) {
		super(context);
	}

	@Override
	public void enterPackageKeyword(PackageKeywordContext ctx) {
		super.enterPackageKeyword(ctx);

		changeProperty(new PackageModel());
		changeOperation(new SelectPackageOperation());
	}
	
	@Override
	public void enterProjectKeyword(ProjectKeywordContext ctx) {
		super.enterProjectKeyword(ctx);

		changeProperty(new ProjectModel());
		changeOperation(new SelectProjectOperation());
	}	

	@Override
	public void enterTypeKeyword(TypeKeywordContext ctx) {
		super.enterTypeKeyword(ctx);

		changeProperty(new ClassModel());
		changeOperation(new SelectAndOpenClassFileOperation());
	}
		
	@Override
	public void enterPhrase(PhraseContext ctx) {
		super.enterPhrase(ctx);

		changePhrase(ctx.getText());
	}
	
	@Override
	public void exitSelection(SelectionContext ctx) {
		super.exitSelection(ctx);

		//context.finish();
	}
	
}
