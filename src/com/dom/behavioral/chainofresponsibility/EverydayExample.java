package com.dom.behavioral.chainofresponsibility;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EverydayExample {
    private static final Logger logger = Logger.getLogger(EverydayExample.class.getName());

    public static void main(String[] args) {
        logger.setLevel(Level.FINER);

        ConsoleHandler consoleHandler = new ConsoleHandler();
        consoleHandler.setLevel(Level.FINER);
        logger.addHandler(consoleHandler);

        logger.finest("Finest level of logging"); // No handler that can "handle" this log
        logger.finer("Finer level, but not as fine as finest");
        logger.fine("Fine, but not as fine as finer or finest");
    }
}
