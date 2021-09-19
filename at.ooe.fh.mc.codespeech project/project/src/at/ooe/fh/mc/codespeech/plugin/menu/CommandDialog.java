package at.ooe.fh.mc.codespeech.plugin.menu;

import org.eclipse.jface.dialogs.IMessageProvider;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

/**
 * 
 * Dialog class that allows entering command by text. It is a helper
 * function that is used to perform tests on commands withour speech recognition.
 * Dialog opens when "Enter Command" option in IDE's menu bar is clicked.
 * It has two gields: command and parameter. What commands can be entered
 * can be seen in {@link CommandRecognizer}
 * 
 * @author Lukasz Strzelecki
 *
 */
public class CommandDialog extends TitleAreaDialog {

	/**
	 * Text field of the dialog for entering command
	 */
	private Text commandField;

	/**
	 * String of the command text field
	 */
    private String command;

    /**
     * Public constructor
     * 
     * @param parentShell
     */
    public CommandDialog(Shell parentShell) {
        super(parentShell);
    }

    /**
     * Returns text of command text field
     * 
     * @return text of command text field
     */
    public String getCommand() {
        return command;
    }

    /**
     * Method creating the dialog
     */
    @Override
    public void create() {
        super.create();
        setTitle("Enter command");
        setMessage("Enter command", IMessageProvider.INFORMATION);
    }

    /**
     * Method creating dialog area (Window)
     */
    @Override
    protected Control createDialogArea(Composite parent) {
        Composite area = (Composite) super.createDialogArea(parent);
        Composite container = new Composite(area, SWT.NONE);
        container.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
        GridLayout layout = new GridLayout(2, false);
        container.setLayout(layout);

        createCommandField(container);

        return area;
    }

    private void createCommandField(Composite container) {
        Label commandLabel = new Label(container, SWT.NONE);
        commandLabel.setText("Command");

        GridData data = new GridData();
        data.grabExcessHorizontalSpace = true;
        data.horizontalAlignment = GridData.FILL;

        commandField = new Text(container, SWT.BORDER);
        commandField.setLayoutData(data);        
    }
    
    @Override
    protected boolean isResizable() {
        return true;
    }

    private void saveInput() {
    	command = commandField.getText();
    }

    @Override
    protected void okPressed() {
        saveInput();
        super.okPressed();
    }

}