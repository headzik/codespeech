
package at.ooe.fh.mc.codespeech.plugin;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

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

import com.ibm.icu.text.DateFormat;
import com.ibm.icu.text.SimpleDateFormat;

import at.ooe.fh.mc.codespeech.interpreter.Command;
import at.ooe.fh.mc.codespeech.interpreter.Interpreter;
import at.ooe.fh.mc.codespeech.interpreter.InterpreterListener;
import at.ooe.fh.mc.codespeech.plugin.utils.EditorManager;
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
public class PluginManager extends Plugin implements SpeechRecognitionListener, InterpreterListener, IPartListener2 {

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
	private static PluginManager instance;

	/**
	 * {@link Interpreter}
	 */
	Interpreter interpreter;

	/**
	 * {@link SpeechRecognizer}
	 */
	SpeechRecognizer speechRecognizer;
	
	FileWriter log;
	
	long startTime;
	
	ArrayList<Long> speakingTimes = new ArrayList<>();
	ArrayList<Long> recognitionTimes = new ArrayList<>();
	ArrayList<Long> operationTimes = new ArrayList<>();

	/**
	 * Method called on the start of the plugin. All necessary initializations
	 * are performed here. 
	 */
	@Override
	public void start(BundleContext bundleContext) throws Exception {
		super.start(bundleContext);
		instance = this;

		interpreter = new Interpreter();
		interpreter.addListener(this);

		IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
		page.addPartListener(this);		
		IEditorPart editorPart = page.getActiveEditor();
		if(editorPart instanceof ITextEditor) {
			EditorManager.setActiveEditor((ITextEditor) editorPart);
		}

		speechRecognizer = SpeechRecognizerFactory
				.createSpeechRecognizer(SREngineType.GOOGLE_SPEECH, Mode.CONTINUOUS_SPEECH);
		
		speechRecognizer.addListener(getDefault());
		
		DateFormat dateFormat = new SimpleDateFormat("yyyy_MM_dd HH_mm");
		File file = new File(dateFormat.format(new Date()) + "recognition_log.csv");
		log = new FileWriter(file);
	}

	/**
	 * Method called on the stop of the plugin. All necessary closings are performed here.
	 */
	@Override
	public void stop(BundleContext context) throws Exception {
		turnOffRecognition();
		speechRecognizer.shutdown();
		
		long sum;
		long average;

		if (!speakingTimes.isEmpty()) {
			sum = 0;
			average = 0;
			for(Long time: speakingTimes) {
				sum += time;
			}
			average = sum / speakingTimes.size();
			log.append("\n average speaking time; " + average/1000.00 + " \n");
		}

		if (!recognitionTimes.isEmpty()) {
			sum = 0;
			average = 0;
			for(Long time: recognitionTimes) {
				sum += time;
			}
			average = sum / recognitionTimes.size();
			log.append("\n average recognition time; " + average/1000.00 + " \n");
		}

		if (!operationTimes.isEmpty()) {
			sum = 0;
			average = 0;
			for(Long time: operationTimes) {
				sum += time;
			}
			average = sum / operationTimes.size();
			log.append("\n average operation time; " + average/1000.00 + " \n");
		}

		log.flush();
		log.close();
		instance = null;
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 */
	public static PluginManager getDefault() {
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
		//System.out.println("start");
		startTime = System.currentTimeMillis();
	}

	/**
	 * {@link RecognitionListener.onEndOfSpeech}
	 */
	@Override
	public void onEndOfSpeech() {
		try {
			long speakingTime = (System.currentTimeMillis() - startTime);
			speakingTimes.add(speakingTime);
			log.append(" Speaking time; " + speakingTime/1000.00 + " \n");

			startTime = System.currentTimeMillis();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	/**
	 * {@link RecognitionListener.onResult}
	 */
	@Override
	public void onResult(String result) {
		try {
//			long recognitionTime = (System.currentTimeMillis() - startTime);
//			recognitionTimes.add(recognitionTime);
			log.append("Result; " + result + ";1; \n");
//			log.append(" time; " + recognitionTime/1000.00 + "s \n");
//
//			startTime = System.currentTimeMillis();
		} catch (IOException e) {
			e.printStackTrace();
		}
		startTime = System.currentTimeMillis();
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
		//speechRecognizer.stopListening();
		turnOffRecognition();
		//speechRecognizer.startListening();
	}

	public void toggle() {
		if(!speechRecognizer.isOn()) {	    		    	
			turnOnRecognition();
		} else {	    	
			turnOffRecognition();
		}
	}
	
	/**
	 * Starts listening for voice occurrences
	 * 
	 */
	public void turnOnRecognition() {
		//speechRecognizer.addListener(getDefault());
		speechRecognizer.startListening();
		System.out.println("SR turned on");
	}


	/**
	 * Stops listening for voice occurrences
	 * 
	 */
	public void turnOffRecognition() {
		speechRecognizer.stopListening();
		System.out.println("SR turned off");
		//speechRecognizer.removeListener(getDefault());
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
		if(command.isSet()) {
			try {
				long operationTime = (System.currentTimeMillis() - startTime);
				operationTimes.add(operationTime);
				log.append("<-------- " +  command.getOperation().getClass().getSimpleName().toString());
				command.execute();		
				log.append(" time; " + operationTime/1000.00 + ";;1 \n");
				log.flush();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}


	@Override
	public void partActivated(IWorkbenchPartReference partRef) {
		IWorkbenchPart part = partRef.getPart(false);
		if(part instanceof ITextEditor) {
			EditorManager.setActiveEditor((ITextEditor) part);
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