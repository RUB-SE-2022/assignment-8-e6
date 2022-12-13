package de.rub.exercise8.calculator.framework;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.RowData;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Shell;

import java.util.ArrayList;

public class Framework {

    private final Display display;
    private final Shell shell;
    private final Text text;
    private final ArrayList<Button> buttons;

    /**
     * This constructor Initializes the Framework (Display, Shell and Text).
     * It is used to easily create UIs in the form we were Tasked to do.
     * @param title String that represents the title of the Window
     * @param baseText The default text that is shown in the entry-field
     */
    public Framework(String title, String baseText) {
        this.display = new Display();
        this.shell = new Shell(display);
        this.text = new Text(shell, 0);
        this.buttons = new ArrayList<>();

        shell.setText(title);
        // Here we're defining the default size of our Window
        text.setLayoutData(new RowData(300, SWT.DEFAULT));
        text.setText(baseText);
    }

    /**
     * This method, as its name might let you guess, enables the User to easily create a Button
     * to the Right of the textfield
     * @param text String representing the Name of the button (Its the String on the Button the user sees)
     * @return the button Object itself
     */
    public Button addButton(String text) {
        Button button = new Button(shell, 0);
        button.setText(text);
        buttons.add(button);
        return button;
    }

    /**
     * This Method renders the User Interface and closes it, if it's signaled to close.
     */
    public void renderUI() {
        shell.setLayout(new RowLayout());
        this.shell.pack();
        this.shell.open();
        while (!this.shell.isDisposed()) {
            if (!this.display.readAndDispatch()){
                this.display.sleep();
            }
        }
        this.display.dispose();
    }

}
