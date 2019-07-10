package at.ooe.fh.mc.codespeech.interpreter.listeners;


import at.ooe.fh.mc.codespeech.general.utils.StringUtils;
import at.ooe.fh.mc.codespeech.interpreter.InterpreterContext;
import at.ooe.fh.mc.codespeech.interpreter.grammar.GrammarParser.*;
import at.ooe.fh.mc.codespeech.interpreter.operations.modification.*;


public class DeletionListener extends BaseKeywordListener {

	DeletionListener(InterpreterContext context) {
		super(context);
	}

	@Override
	public void enterTypeKeyword(TypeKeywordContext ctx) {
		super.enterTypeKeyword(ctx);

		changeOperation(new DeleteTypeOrPackageOperation());
	}


	@Override
	public void enterPackageKeyword(PackageKeywordContext ctx) {
		super.enterPackageKeyword(ctx);

		changeOperation(new DeleteTypeOrPackageOperation());
	}

	@Override
	public void enterProjectKeyword(ProjectKeywordContext ctx) {
		super.enterProjectKeyword(ctx);

		changeOperation(new DeleteProjectOperation());

	}
	
	@Override
	public void enterLineKeyword(LineKeywordContext ctx) {
		super.enterLineKeyword(ctx);

		changeOperation(new DeleteNodeInLineOperation());
	}


	@Override
	public void exitDeletion(DeletionContext ctx) {
		super.exitDeletion(ctx);
		
		//context.finish();
	}

	@Override
	public void enterArgumentKeyword(ArgumentKeywordContext ctx) {
		super.enterArgumentKeyword(ctx);
		
		changeOperation(new DeleteArgumentOperation());
	}
	
	@Override
	public void enterParametersKeyword(ParametersKeywordContext ctx) {
		super.enterParametersKeyword(ctx);
		changeOperation(new DeleteParameterOperation());
	}
	
	@Override
	public void enterNumber(NumberContext ctx) {
		super.enterNumber(ctx);
		
		changeProperty(StringUtils.getNumber(ctx.getText().trim()));
	}
}
