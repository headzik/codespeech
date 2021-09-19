package at.ooe.fh.mc.codespeech.interpreter;

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import at.ooe.fh.mc.codespeech.general.events.EventHandler;
import at.ooe.fh.mc.codespeech.interpreter.events.OnInterpretationFinishedEvent;
import at.ooe.fh.mc.codespeech.interpreter.grammar.GrammarLexer;
import at.ooe.fh.mc.codespeech.interpreter.grammar.GrammarParser;
import at.ooe.fh.mc.codespeech.interpreter.listeners.FreeSpeechListener;

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
		handler.post(new OnInterpretationFinishedEvent(listeners, context.getCommand()));
		if(!(context.getCurrentListener() instanceof FreeSpeechListener)) {
			context = new InterpreterContext(this);
		}
	}
}

