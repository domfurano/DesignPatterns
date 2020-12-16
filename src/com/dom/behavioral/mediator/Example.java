package com.dom.behavioral.mediator;

import java.awt.*;
import java.util.Timer;
import java.util.TimerTask;

class Example {

    private final Toolkit toolkit;
    private final Timer timer;

    public Example(int seconds) {
        toolkit = Toolkit.getDefaultToolkit();
        timer = new Timer();
        timer.schedule(new RemindTask(), seconds * 1000);
    }

    public static void main(String[] args) {
        Example example = new Example(3);
    }

    class RemindTask extends TimerTask {
        @Override
        public void run() {
            System.out.println("Times up!");
            toolkit.beep();
        }
    }
}