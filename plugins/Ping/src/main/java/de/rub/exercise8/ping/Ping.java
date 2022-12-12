package de.rub.exercise8.ping;

import de.rub.exercise8.calculator.framework.Framework;

public class Ping {
    public Ping() {
        Framework framework = new Framework("Ping", "127.0.0.1");
        framework.addButton("ping");
        framework.renderUI();
    }
}
