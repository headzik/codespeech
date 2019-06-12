
package at.ooe.fh.mc.codespeech.plugin;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Plugin;
import org.eclipse.core.runtime.Status;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IPartListener2;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchPartReference;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.texteditor.ITextEditor;
import org.osgi.framework.BundleContext;


import at.ooe.fh.mc.codespeech.interpreter.Command;
import at.ooe.fh.mc.codespeech.interpreter.Interpreter;
import at.ooe.fh.mc.codespeech.plugin.ast.ASTManager;
import at.ooe.fh.mc.codespeech.plugin.utils.UIManager;
import at.ooe.fh.mc.codespeech.speechrecognition.SREngineType;
import at.ooe.fh.mc.codespeech.speechrecognition.SpeechRecognitionListener;
import at.ooe.fh.mc.codespeech.speechrecognition.SpeechRecognizer;
import at.ooe.fh.mc.codespeech.speechrecognition.SpeechRecognizer.Mode;
import at.ooe.fh.mc.codespeech.speechrecognition.SpeechRecognizerFactory;


/**
 * Main Plugin class that is being initialized whenever any action on the plugin is
 * first made. It is responsible for initialization of all necessary things and deleting them when 
 * plugin is turned off. Additionally it implements RecognitionListener, which handles
 * speech recognition events
 * 
 * @author Lukasz Strzelecki
 *
 */
public class Activator extends Plugin implements SpeechRecognitionListener, InterpreterListener {

	/**
	 * The plug-in ID
	 */
	public static final String PLUGIN_ID = "org.eclipse.pde.ds.core"; //$NON-NLS-1$

	/**
	 * The content type ID
	 */
	public static final String CONTENT_TYPE_ID = "org.eclipse.pde.ds.core.content-type"; //$NON-NLS-1$

	/**
	 * The shared instance
	 */
	private static Activator instance;

	/**
	 * {@link ASTManager}
	 */
	ASTManager astManager;

	/**
	 * {@link Interpreter}
	 */
	Interpreter interpreter;

	/**
	 * {@link SpeechRecognizer}
	 */
	SpeechRecognizer speechRecognizer;


	Context context;


	/**
	 * Method called on the start of the plugin. All necessary initializations
	 * are performed here. 
	 */
	@Override
	public void start(BundleContext bundleContext) throws Exception {
		super.start(bundleContext);
		instance = this;
		context = new Context();

		interpreter = new Interpreter();
		interpreter.addListener(this);

		IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
		page.addPartListener(new ActiveEditorListener());		
		IEditorPart editorPart = page.getActiveEditor();
		if(editorPart instanceof ITextEditor) {
			UIManager.setActiveEditor((ITextEditor) editorPart);
		}

		speechRecognizer = SpeechRecognizerFactory
				.createSpeechRecognizer(SREngineType.GOOGLE_SPEECH, Mode.CONTINUOUS_SPEECH);
	}

	/**
	 * Method called on the stop of the plugin. All necessary closings are performed here.
	 */
	@Override
	public void stop(BundleContext context) throws Exception {
		instance = null;
		turnOffRecognition();
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 */
	public static Activator getDefault() {
		return instance;
	}

	/**
	 * Logs current status.
	 * 
	 * @param status to log
	 */
	public static void log(IStatus status) {
		if (status != null) {
			ResourcesPlugin.getPlugin().getLog().log(status);
		}
	}

	/**
	 * Logs current exception
	 *
	 * @param e exception to log
	 */
	public static void log(Throwable e) {
		if (e instanceof InvocationTargetException)
			e = ((InvocationTargetException) e).getTargetException();
		IStatus status = null;
		if (e instanceof CoreException) {
			status = ((CoreException) e).getStatus();
		} else if (e.getMessage() != null) {
			status = new Status(IStatus.ERROR, PLUGIN_ID, IStatus.OK, e.getMessage(), e);
		}
		log(status);
	}

	/**
	 * {@link RecognitionListener.onBeginningOfSpeech}
	 */
	@Override
	public void onBeginningOfSpeech() {
		System.out.println("start");

	}

	/**
	 * {@link RecognitionListener.onEndOfSpeech}
	 */
	@Override
	public void onEndOfSpeech() {
		//speechRecognizer.stopListening(true);
		//speechRecognizer.startListening();
		System.out.println("end");
	}

	/**
	 * {@link RecognitionListener.onResult}
	 */
	@Override
	public void onResult(String result) {
		System.out.println(result);
		interpret(result);	
	}

	/**
	 * {@link RecognitionListener.onError}
	 */
	@Override
	public void onError(Throwable throwable) {
		throwable.printStackTrace();
	}

	/**
	 * {@link RecognitionListener.onTimeout}
	 */
	@Override
	public void onTimeout() {
		System.out.println("Timeout");
		speechRecognizer.stopListening(true);
		//speechRecognizer.startListening();
	}

	/**
	 * Starts listening for voice occurrences
	 * 
	 */
	public void turnOnRecognition() {
		speechRecognizer.addListener(getDefault());
		speechRecognizer.startListening();
	}


	/**
	 * Stops listening for voice occurrences
	 * 
	 */
	public void turnOffRecognition() {
		speechRecognizer.stopListening(false);
		speechRecognizer.removeListener(getDefault());
	}

	/**
	 * Tries to recognize given command
	 * 
	 * @param command 
	 * @param parameter
	 */
	public void interpret(String utterance) {
		interpreter.interpret(utterance.toLowerCase());
	}

	@Override
	public void onInterpretationFinished(Command command) {
		command.execute();		
	}

	/**
	 * Private class that implements IPartListener2.
	 * Its main task is to detect and store currently active editor
	 * 
	 * @author Lukasz Strzelecki
	 *
	 */
	private class ActiveEditorListener implements IPartListener2 {

		@Override
		public void partActivated(IWorkbenchPartReference partRef) {
			IWorkbenchPart part = partRef.getPart(false);
			if(part instanceof ITextEditor) {;
			UIManager.setActiveEditor((ITextEditor) part);
			}
		}

		@Override
		public void partBroughtToTop(IWorkbenchPartReference partRef) {
			// TODO Auto-generated method stub

		}

		@Override
		public void partClosed(IWorkbenchPartReference partRef) {
			// TODO Auto-generated method stub

		}

		@Override
		public void partDeactivated(IWorkbenchPartReference partRef) {
			// TODO Auto-generated method stub

		}

		@Override
		public void partOpened(IWorkbenchPartReference partRef) {
			// TODO Auto-generated method stub

		}

		@Override
		public void partHidden(IWorkbenchPartReference partRef) {
			// TODO Auto-generated method stub

		}

		@Override
		public void partVisible(IWorkbenchPartReference partRef) {
			// TODO Auto-generated method stub

		}

		@Override
		public void partInputChanged(IWorkbenchPartReference partRef) {
			// TODO Auto-generated method stub

		}

	}

}