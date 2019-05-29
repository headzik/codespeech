package at.ooe.fh.mc.codespeech.interpreter.operations.creation;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.jdt.core.ISourceRange;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.core.ToolFactory;
import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.Block;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jdt.core.dom.Expression;
import org.eclipse.jdt.core.dom.IfStatement;
import org.eclipse.jdt.core.dom.Statement;
import org.eclipse.jdt.core.dom.rewrite.ASTRewrite;
import org.eclipse.jdt.core.formatter.CodeFormatter;
import org.eclipse.jdt.internal.corext.refactoring.code.InlineMethodRefactoring;
import org.eclipse.jdt.internal.corext.refactoring.code.InlineMethodRefactoring.Mode;
import org.eclipse.jdt.internal.corext.refactoring.util.RefactoringASTParser;
import org.eclipse.jdt.internal.ui.javaeditor.ASTProvider;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.Document;
import org.eclipse.ltk.core.refactoring.CheckConditionsOperation;
import org.eclipse.ltk.core.refactoring.PerformRefactoringOperation;
import org.eclipse.ltk.core.refactoring.RefactoringStatus;
import org.eclipse.text.edits.TextEdit;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.ide.IDE;

import at.ooe.fh.mc.codespeech.general.utils.StringUtils;
import at.ooe.fh.mc.codespeech.interpreter.models.ConditionalModel;
import at.ooe.fh.mc.codespeech.interpreter.models.Model;
import at.ooe.fh.mc.codespeech.interpreter.operations.Operation;
import at.ooe.fh.mc.codespeech.plugin.Context;
import at.ooe.fh.mc.codespeech.plugin.ast.ASTManager;
import at.ooe.fh.mc.codespeech.plugin.utils.UIManager;

public class CreateElseStatementOperation implements Operation {

	@Override
	public void perform(Model model) {
		if(model instanceof ConditionalModel) {
			ConditionalModel ifModel = (ConditionalModel) model;
			ASTNode node = Context.currentNode;
			if (node != null) {
				while(!(node instanceof IfStatement)) {
					node = node.getParent();
					if(node == null) {
						return;
					}
				}
				CompilationUnit cu = (CompilationUnit) node.getRoot();
				AST ast = cu.getAST();
				cu.recordModifications();
				
				IfStatement oldIfStatement = (IfStatement) node;
				IfStatement newElseStatement = ast.newIfStatement();
				
				Block elseBlock = ast.newBlock();
				elseBlock.statements().add(ast.newEmptyStatement());
				
				if(!ifModel.condition.trim().isEmpty()) {
					Expression elseConditionExpression = StringUtils.stringToExpression(ifModel.condition, ast);
					newElseStatement.setExpression(elseConditionExpression);
					newElseStatement.setThenStatement(elseBlock);
					oldIfStatement.setElseStatement(newElseStatement);
				} else {					
					oldIfStatement.setElseStatement(elseBlock);
				}
				
				try {
					Document doc = new Document(UIManager.getICompilationUnit().toString());
					TextEdit te = cu.rewrite(doc, 
							UIManager.getICompilationUnit().getJavaProject().getOptions(true));
					
				    UIManager.updateCompilationUnit(te);

					ISourceRange range = UIManager.getICompilationUnit().getSourceRange();
					int start  = range.getOffset();
					int end = range.getLength();
					CodeFormatter formatter = ToolFactory.createCodeFormatter(null);
				    TextEdit formatEdit = formatter.format(CodeFormatter.K_COMPILATION_UNIT, 
				    		UIManager.getICompilationUnit().getSource(),
				    		start, end, 0, null);
				    if (formatEdit != null && formatEdit.hasChildren()) {
				    	UIManager.getICompilationUnit().applyTextEdit(formatEdit, null);
				    } 
				    
					UIManager.moveToNode(elseBlock);
				} catch (IllegalArgumentException | BadLocationException | CoreException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
