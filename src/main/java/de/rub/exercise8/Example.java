package de.rub.exercise8;

import de.rub.exercise8.calculator.Calculator;
import de.rub.exercise8.fileuploader.FileUploader;
import de.rub.exercise8.ping.Ping;

public class Example {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Ping ping = new Ping();
        FileUploader fileUploader = new FileUploader();
    }
}
