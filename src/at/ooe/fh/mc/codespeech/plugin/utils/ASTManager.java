package at.ooe.fh.mc.codespeech.plugin.utils;

import java.util.ArrayList;

import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.ASTParser;
import org.eclipse.jdt.core.dom.ASTVisitor;
import org.eclipse.jdt.core.dom.Block;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jdt.core.dom.EmptyStatement;
import org.eclipse.jdt.core.dom.Statement;
import org.eclipse.jdt.core.dom.rewrite.ASTRewrite;
import org.eclipse.jdt.core.dom.rewrite.ListRewrite;

/**
 * A class that is responsible for performing operations on Abstract Syntax Tree.
 * It can create or modify AST by delegating operations to specific managers. 
 * It also provides  utility methods for some operations. 
 * 
 * @author Lukasz Strzelecki
 *
 */
public abstract class ASTManager {

	public static ASTNode currentNode;
	
	/**
	 * 
	 * @param compilationUnit ICompilationUnit to be parsed 
	 * @return ASTParser of the compilation unit
	 */
	private static ASTParser getParser(ICompilationUnit compilationUnit) {
		ASTParser parser = ASTParser.newParser(AST.JLS11);
		parser.setKind(ASTParser.K_COMPILATION_UNIT);
		parser.setSource(compilationUnit);
		return parser;
	}

	/**
	 * Retrieves CompilationUnit of the ICompilationUnit. ICompilationUnit is the representation 
	 * of the source file while CompilationUnit is the Abstract Syntax Tree representation.
	 * CompilationUnit is needed when operations on AST are to be performed.
	 * 
	 * @param compilationUnit ICompilationUnit of which CompilationUnit class is to be retrieved
	 * @return CompilationUnit of the ICOmpilationUnit
	 */
	public static CompilationUnit getCompilationUnitAST(ICompilationUnit compilationUnit) {
		ASTParser parser = getParser(compilationUnit);
		return (CompilationUnit) parser.createAST(null);
	}

	/**
	 * Inserts new statement after current node using given rewriter
	 * 
	 * @param statementToInsert statement to be inserted
	 * @param currentNode current node its body is retrieved for insertion
	 * @param rewriter rewriter used to apply changes
	 */
	public static void insertStatement(Statement statementToInsert, ASTNode currentNode, ASTRewrite rewriter) {
		Block body = currentNode instanceof Block ? (Block) currentNode : getBody(currentNode);
		
		ASTNode nextNode = getNextNodeOfType(body, Statement.class);
		ListRewrite listRewrite = rewriter.getListRewrite(body, Block.STATEMENTS_PROPERTY);
		if(nextNode != null) {
			if(nextNode instanceof EmptyStatement) {
				listRewrite.replace(nextNode, statementToInsert, null);
			} else {				
				listRewrite.insertAfter(statementToInsert, nextNode, null);					
			}
		} else {
			listRewrite.insertLast(statementToInsert, null);
		}
	}
	
	/**
	 * Replaces current node with a new statement
	 * 
	 * @param newStatement statement to be inserted
	 * @param nodeToReplace node to be replaced
	 * @param rewriter 
	 */
	public static void replace(Statement newStatement, ASTNode nodeToReplace, ASTRewrite rewriter) {
		rewriter.replace(newStatement, nodeToReplace, null);	
	}

	/**
	 * Retrieves body of the node. Depending if the node has body, 
	 * it will either retrieve child body element or parent's body
	 * 
	 * @param node of which block must be retrieved
	 * @return body of the node
	 */
	private static Block getBody(ASTNode node) {
		Block body = null;
		if(node.getParent() instanceof Block) {
			body = (Block) node.getParent();
		}
		return body;
	}



	/**
	 * Returns a child node that occur after the current line
	 * 
	 * @param node parent node
	 * @param childClass class of a node to find
	 * @return child node
	 */
	public static ASTNode getNextNodeOfType(ASTNode node, Class<?> childClass) {
		CompilationUnit astRoot = getCompilationUnitAST(EditorManager.getICompilationUnit());

		ArrayList<ASTNode> foundNode = new ArrayList<>();

		if(node != null) {
			node.accept(new ASTVisitor() {
				@Override
				public boolean preVisit2(ASTNode visitedNode) {
					if(childClass.isInstance(visitedNode) && !node.equals(visitedNode)) {
						if(astRoot.getLineNumber(visitedNode.getStartPosition()) - 1 >= EditorManager.getTextSelection().getEndLine() &&
								foundNode.isEmpty()) {
							foundNode.add(visitedNode);
						} 
					}
					return super.preVisit2(visitedNode);
				}	
			});
		}
		return foundNode.isEmpty() ? null : foundNode.get(0);
	}

	/**
	 * Returns a node of the current line
	 * 
	 * 
	 * @return\ASTNode that occurs in selected line
	 * @throws JavaModelException
	 */
	private static ASTNode getNode() throws JavaModelException {
		CompilationUnit astRoot = getCompilationUnitAST(EditorManager.getICompilationUnit());

		ArrayList<ASTNode> parentNode = new ArrayList<>();
		ArrayList<ASTNode> nodeInLine = new ArrayList<>();

		astRoot.accept(new ASTVisitor() {
			@Override
			public boolean preVisit2(ASTNode node) {	
				if(node.getStartPosition() < EditorManager.getTextSelection().getOffset() && 
						node.getStartPosition() + node.getLength() > EditorManager.getTextSelection().getOffset()) {
					parentNode.clear();
					parentNode.add(node);
				} 

				if(astRoot.getLineNumber(node.getStartPosition()) - 1 == EditorManager.getTextSelection().getEndLine() &&
						nodeInLine.isEmpty()) {
					nodeInLine.add(node);
				} 
				return super.preVisit2(node);
			}	
		});

		if(parentNode.isEmpty()) {
			parentNode.add(astRoot);
		}
		
		return nodeInLine.isEmpty() ? parentNode.get(0) : nodeInLine.get(0);
	}
	
	public static void findNewNode() {
		try {
			currentNode = getNode();
		} catch (JavaModelException e) {
			e.printStackTrace();
		}
	}

	public static ASTNode getCurrentNode() throws JavaModelException {
		if(currentNode == null) {
			currentNode = getNode();
		}
		return currentNode;
	}

}
