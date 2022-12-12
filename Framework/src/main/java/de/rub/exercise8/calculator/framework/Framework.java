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
    public Framework(String title, String baseText) {
        this.display = new Display();
        this.shell = new Shell(display);
        this.text = new Text(shell, 0);
        this.buttons = new ArrayList<>();

        shell.setText(title);
        text.setLayoutData(new RowData(300, SWT.DEFAULT));
        text.setText(baseText);
    }

    public Button addButton(String text) {
        Button button = new Button(shell, 0);
        button.setText(text);
        buttons.add(button);
        return button;
    }

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
