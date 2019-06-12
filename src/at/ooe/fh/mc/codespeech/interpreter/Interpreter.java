package at.ooe.fh.mc.codespeech.interpreter;

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import at.ooe.fh.mc.codespeech.general.events.EventHandler;
import at.ooe.fh.mc.codespeech.interpreter.events.InterpretationFinishedEvent;
import at.ooe.fh.mc.codespeech.interpreter.listeners.SelectionListener;
import at.ooe.fh.mc.codespeech.interpreter.listeners.CreationListener;
import at.ooe.fh.mc.codespeech.interpreter.listeners.FreeSpeechListener;
import at.ooe.fh.mc.codespeech.plugin.InterpreterListener;

/**
 * Class responsible for recognizing commands and performing appropriate actions
 * such as modification of AST tree or calling IDE commands.
 * 
 * @author Lukasz Strzelecki
 *
 */
public class Interpreter {

	List<InterpreterListener> listeners;
	EventHandler handler;	

	InterpreterContext context;
	
	/**
	 * Public constructor
	 * 
	 */
	public Interpreter() {
		listeners = new ArrayList<>();
		handler = new EventHandler();
		context = new InterpreterContext(this);
	}

	/**
	 * Adds listener.
	 */
	public void addListener(InterpreterListener listener) {
		synchronized (listeners) {
			listeners.add(listener);
		}
	}

	/**
	 * Removes listener.
	 */
	public void removeListener(InterpreterListener listener) {
		synchronized (listeners) {
			listeners.remove(listener);
		}
	}

	/**
	 * Method responsible for calling proper actions depending recognized speech 
	 * or written by EnterCommand. 
	 * 
	 * @param command to be handled
	 * @param paramter for the command
	 */
	public void interpret(String utterance) {
		if(!utterance.isEmpty()) {			
			GrammarLexer lexer = new GrammarLexer(CharStreams.fromString(utterance));

			CommonTokenStream tokens = new CommonTokenStream(lexer);
			GrammarParser parser = new GrammarParser(tokens);

			ParseTreeWalker walker = new ParseTreeWalker();
			
			walker.walk(context.getCurrentListener(), parser.command());	
		}
	}

	public void finish() {
		//if(context.command.isReady()) {
		handler.post(new InterpretationFinishedEvent(listeners, context.getCommand()));
		//}
		if(!(context.getCurrentListener() instanceof FreeSpeechListener))
			context = new InterpreterContext(this);
	}
}



//switch(utterance) {
//	case "new project": 
//		astManager.createNewProject(paramter);
//		break;
//	case "new package": 
//		astManager.createNewPackage(paramter);
//		break;
//	case "new class": 
//		astManager.createNewClass(paramter);
//		break;
//	case "new method": 
//		astManager.createNewMethod(paramter);
//		break;
//	case "expand": 
//		SelectionService.expandSelectedTreeItems();
//		break;
//	case "line": 
//		ActiveEditorManager.moveToLine(Integer.parseInt(paramter) - 1);
//		break;
//	case "new int": 
//		astManager.createPrimitiveVariable(PrimitiveType.INT, paramter);
//		break;
//	case "new float": 
//		astManager.createPrimitiveVariable(PrimitiveType.FLOAT, paramter);
//		break;
//	case "new double": 
//		astManager.createPrimitiveVariable(PrimitiveType.DOUBLE, paramter);
//		break;
//	case "new boolean": 
//		astManager.createPrimitiveVariable(PrimitiveType.BOOLEAN, paramter);
//		break;
//	case "initialize": 
//		try {
//			astManager.initialize(paramter);
//		} catch(BadLocationException | JavaModelException e) {
//			e.printStackTrace();
//		}
//		break;
//	case "delete": 
//		try {
//			astManager.delete();
//		} catch(BadLocationException | JavaModelException e) {
//			e.printStackTrace();
//		}
//		break;
//	case "if": 
//		try {
//			astManager.createIfStatement(paramter);
//		} catch(BadLocationException | JavaModelException e) {
//			e.printStackTrace();
//		}
//		break;
//	case "while": 
//		try {
//			astManager.createWhileStatement(paramter);
//		} catch(BadLocationException | JavaModelException e) {
//			e.printStackTrace();
//		}
//		break;
//	default:
//}