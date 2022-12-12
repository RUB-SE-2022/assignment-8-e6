package de.rub.exercise8.calculator;

import de.rub.exercise8.calculator.framework.Framework;

public class Calculator {

    public Calculator() {
        Framework framework = new Framework("My Great Calculator", "10/2+6");
        framework.addButton("calculate");
        framework.renderUI();
    }

}
