package at.ooe.fh.mc.codespeech.interpreter.operations.creation;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.jdt.core.ISourceRange;
import org.eclipse.jdt.core.ToolFactory;
import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jdt.core.dom.MethodInvocation;
import org.eclipse.jdt.core.dom.QualifiedName;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.Document;
import org.eclipse.text.edits.TextEdit;

import at.ooe.fh.mc.codespeech.interpreter.models.MethodInvocationModel;
import at.ooe.fh.mc.codespeech.interpreter.models.Model;
import at.ooe.fh.mc.codespeech.interpreter.operations.Operation;
import at.ooe.fh.mc.codespeech.plugin.Context;
import at.ooe.fh.mc.codespeech.plugin.utils.UIManager;

public class CreateMethodInvocationOperation implements Operation {

	@Override
	public void perform(Model model) {
		if(model instanceof MethodInvocationModel) {
			MethodInvocationModel methodInvocationModel = (MethodInvocationModel) model;
			ASTNode node = Context.currentNode;
			if (node != null) {
				CompilationUnit cu = (CompilationUnit) node.getRoot();
				AST ast = cu.getAST();
				cu.recordModifications();
				
				MethodInvocation methodInvocation = ast.newMethodInvocation();
				for(int i = 0; i < methodInvocationModel.methodsToInvoke.size(); i++) {
					methodInvocationModel.methodsToInvoke
				}
				QualifiedName name = 
				   ast.newQualifiedName(
				    ast.newSimpleName("System"),
				    ast.newSimpleName("out"));
				  methodInvocation.setExpression(name);
				  methodInvocation.setName(ast.newSimpleName("println")); 
				
				try {
					Document doc = new Document(UIManager.getICompilationUnit().toString());
					TextEdit te = cu.rewrite(doc, 
							UIManager.getICompilationUnit().getJavaProject().getOptions(true));
					
				    UIManager.updateCompilationUnit(te);

				    
//					ISourceRange range = UIManager.getICompilationUnit().getSourceRange();
//					int start  = range.getOffset();
//					int end = range.getLength();
//					CodeFormatter formatter = ToolFactory.createCodeFormatter(null);
//				    TextEdit formatEdit = formatter.format(CodeFormatter.K_COMPILATION_UNIT, 
//				    		UIManager.getICompilationUnit().getSource(),
//				    		start, end, 0, null);
//				    if (formatEdit != null && formatEdit.hasChildren()) {
//				    	UIManager.getICompilationUnit().applyTextEdit(formatEdit, null);
//				    } 
				    
					UIManager.moveToNode(node);
				} catch (IllegalArgumentException | BadLocationException | CoreException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
