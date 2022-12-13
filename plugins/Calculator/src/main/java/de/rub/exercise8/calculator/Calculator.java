package de.rub.exercise8.calculator;

import de.rub.exercise8.calculator.framework.Framework;

public class Calculator {

    public Calculator() {
        // Here we're Just creating an Instance of our Framework
        Framework framework = new Framework("My Great Calculator", "10/2+6");
        framework.addButton("calculate"); // This, like the method name says, just creates a button.
        framework.renderUI(); //this displays our UI.
    }

}
