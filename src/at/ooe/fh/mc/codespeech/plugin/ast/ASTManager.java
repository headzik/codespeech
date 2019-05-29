package at.ooe.fh.mc.codespeech.plugin.ast;

import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.ASTParser;
import org.eclipse.jdt.core.dom.Block;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jdt.core.dom.EmptyStatement;
import org.eclipse.jdt.core.dom.Statement;
import org.eclipse.jdt.core.dom.rewrite.ASTRewrite;
import org.eclipse.jdt.core.dom.rewrite.ListRewrite;

import at.ooe.fh.mc.codespeech.plugin.utils.ActiveEditorManager;
import at.ooe.fh.mc.codespeech.plugin.utils.UIManager;

/**
 * A class that is responsible for performing operations on Abstract Syntax Tree.
 * It can create or modify AST by delegating operations to specific managers. 
 * It also provides static utility methods for some operations. 
 * 
 * @author Lukasz Strzelecki
 *
 */
public abstract class ASTManager {

	public abstract void create();
	//private static ASTManager instance;
	
//	public static ASTManager getInstance() {
//		if(instance == null) {
//			instance = new ASTManager();
//		}
//		
//		return instance;
//	}
	
	//private ASTManager() {
//		projectManager = new ProjectManager();
//		packageManager = new PackageManager();
//		classManager = new ClassManager();
//		methodManager = new MethodManager();
//		variableManager = new VariableManager();
//		statementManager = new StatementManager();
	//}
	
	/**
	 * Project manager handles operations on projects
	 */
//	ProjectManager projectManager;
//	
//	/**
//	 * Package manager handles operations on packages
//	 */
//	PackageManager packageManager;
//	
//	/**
//	 * Class manager handles operations on classes
//	 */
//	ClassManager classManager;
//	
//	/**
//	 * Method manager handles operations on methods
//	 */
//	MethodManager methodManager;
//	
//	/**
//	 * Variable manager handles operations on variable
//	 */
//	VariableManager variableManager;
//	
//	/**
//	 * Statement manager handles operations on statements
//	 */
//	StatementManager statementManager;
	

	/**
	 * ASTNode that was found in the current active line in the editor
	 */
//	private static ASTNode currentNode;
	
	/**
	 * Public constructor that creates all specific managers
	 */
//	public ASTManager() {
//	}

	/**
	 * @return current ASTNode that was found in the current active line in the editor
	 */
//	public static ASTNode getCurrentNode() {
//		return currentNode;
//	}
//
//	/**
//	 * @param newNode ASTNode found in the current active line in the editor
//	 */
//	public static void setCurrentNode(ASTNode newNode) {
//		currentNode = newNode;
//		assert newNode != null;
//	}

	/**
	 * Creates new project of the given name
	 * 
	 * @param name name of the new project
	 */
//	public void createNewProject(String name) {
//		projectManager.createNewProject(name);
//	}
//
////	/**
////	 * Creates new package of the given name in selected project
////	 * 
////	 * @param name name of the new package
////	 */
////	public void createNewPackage(String name) {
////		packageManager.createNewPackage(name);
////	}
//
//	/**
//	 * Creates new class of the given name in a selected root (package or project).
//	 * If no package is selected, the default package is created.
//	 * 
//	 * @param name name of the new class
//	 */
//	public void createNewClass(String name) {
//		classManager.createNewClass(name);
//	}
//
//	/**
//	 * Creates new method of the given name.
//	 * 
//	 * @param name name of the new method
//	 */
//	public void createNewMethod(String name) {
//		methodManager.createNewMethod(name);
//	}
//
//	/**
//	 * Creates new primitive type variable of the given name
//	 * CURRENTLY LIMTTED TO INT FOR SPEECH RECOGNITION
//	 * 
//	 * @param type type of the new variable
//	 * @param name name of the new variable
//	 */
//	public void createPrimitiveVariable(Code type, String name) {
//		variableManager.createPrimitiveVariable(type, name);
//	}
//	
//	/**
//	 * Initializes currently selected variable. 
//	 * CURRENTLY NOT WORKING FOR SPEECH RECOGNITION
//	 * 
//	 * @param value value of initialization 
//	 * @throws JavaModelException if an error in Java model appeared
//	 * @throws BadLocationException if initialization was called in a bad place 
//	 */
//	public void initialize(String value) throws JavaModelException, BadLocationException {
//		variableManager.initialize(value);
//	}
//
//	/**
//	 * Creates new if-else structure with the given condition.
//	 * CURRENTLY NOT WORKING FOR SPEECH RECOGNITION
//	 * 
//	 * @param condition
//	 * @throws JavaModelException
//	 * @throws BadLocationException
//	 */
//	public void createIfStatement(String condition) throws JavaModelException, BadLocationException {
//		statementManager.createIfStatement(condition);
//	}
//
//	/**
//	 * Creates new While loop with the given condition
//	 * CURRENTLY NOT WORKING FOR SPEECH RECOGNITION
//	 * 
//	 * @param condition
//	 * @throws JavaModelException if an error in Java model appeared
//	 * @throws BadLocationException if initialization was called in a bad place 
//	 */
//	public void createWhileStatement(String condition) throws JavaModelException, BadLocationException {
//		statementManager.createWhileStatement(condition);
//	}
//
//	/**
//	 * Deletes current node
//	 * 
//	 * @throws JavaModelException if an error in Java model appeared
//	 * @throws BadLocationException if initialization was called in a bad place 
//	 */
//	public void delete() throws JavaModelException, BadLocationException {
//		AST ast = currentNode.getAST();		
//		ASTRewrite rewriter = ASTRewrite.create(ast);
//		rewriter.remove(currentNode, null);
//		ActiveEditorManager.updateCompilationUnit(rewriter.rewriteAST());
//	}

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
		Block body = currentNode instanceof Block ? (Block) currentNode : ASTManager.getBody(currentNode);
		
		ASTNode nextNode = UIManager.getChildAfterCurrentLine(body, Statement.class);
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

}
