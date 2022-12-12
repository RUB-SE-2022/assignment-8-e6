package de.rub.exercise8.fileuploader;

import de.rub.exercise8.calculator.framework.Framework;

public class FileUploader {
    public FileUploader() {
        Framework framework = new Framework("File Uploader", "");
        framework.addButton("browse");
        framework.addButton("upload");
        framework.renderUI();
    }
}

