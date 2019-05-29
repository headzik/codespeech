package at.ooe.fh.mc.codespeech.plugin.ast;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.PrimitiveType.Code;
import org.eclipse.jdt.core.dom.VariableDeclarationFragment;
import org.eclipse.jdt.core.dom.VariableDeclarationStatement;
import org.eclipse.jdt.core.dom.rewrite.ASTRewrite;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.ui.progress.UIJob;

import at.ooe.fh.mc.codespeech.general.utils.StringUtils;
import at.ooe.fh.mc.codespeech.plugin.Context;
import at.ooe.fh.mc.codespeech.plugin.utils.ActiveEditorManager;

/**
 * Manager responsible for performing operations on variables
 * 
 * @author Lukasz Strzelecki
 */
public class VariableManager {

	/**
	 * Creates new primitive type variable of the given name
	 * CURRENTLY LIMTTED TO INT FOR SPEECH RECOGNITION
	 * 
	 * @param type type of the new variable
	 * @param name name of the new variable
	 */
	public void createPrimitiveVariable(Code type, String name) {

		new UIJob("CreateClass") {

			@Override
			public IStatus runInUIThread(IProgressMonitor monitor) {


				try {
					ASTNode node = Context.currentNode;
					if (node != null) {
						AST ast = node.getAST();		
						ASTRewrite rewriter = ASTRewrite.create(ast);

						VariableDeclarationFragment declarationFragment = ast.newVariableDeclarationFragment();
						declarationFragment.setName(ast.newSimpleName(name));			
						VariableDeclarationStatement declarationStatement = ast.newVariableDeclarationStatement(declarationFragment);
						declarationStatement.setType(ast.newPrimitiveType(type));

						ASTManager.insertStatement(declarationStatement, node, rewriter);
						ActiveEditorManager.updateCompilationUnit(rewriter.rewriteAST());
						ActiveEditorManager.moveToNode(declarationStatement);
					}		
				} catch(JavaModelException | IllegalArgumentException | BadLocationException exception) {
					exception.printStackTrace();
				} 
				return Status.OK_STATUS;
			}
		}.schedule();
	}

	/**
	 * Initializes currently selected variable. 
	 * CURRENTLY NOT WORKING FOR SPEECH RECOGNITION
	 * 
	 * @param value value of initialization 
	 * @throws JavaModelException if an error in Java model appeared
	 * @throws BadLocationException if initialization was called in a bad place 
	 */
	public void initialize(String initializer) throws BadLocationException, JavaModelException {
		ASTNode node = Context.currentNode;
		if (node != null) {
			AST ast = node.getAST();		
			ASTRewrite rewriter = ASTRewrite.create(ast);

			if(node instanceof VariableDeclarationStatement) {
				VariableDeclarationStatement declarationStatement = (VariableDeclarationStatement) node;
				VariableDeclarationFragment declarationFragment = (VariableDeclarationFragment) declarationStatement.fragments().get(0);

				VariableDeclarationFragment newDeclarationFragment = ast.newVariableDeclarationFragment();
				newDeclarationFragment.setName(ast.newSimpleName(declarationFragment.getName().toString()));		
				newDeclarationFragment.setInitializer(StringUtils.stringToExpression(initializer, ast));

				rewriter.replace(declarationFragment, newDeclarationFragment, null);
				ActiveEditorManager.updateCompilationUnit(rewriter.rewriteAST());
				ActiveEditorManager.moveToNode(newDeclarationFragment);
			}
		}		
	}
}
