package com.dom.behavioral.command.demo;

// Receiver
class Light {

    private boolean isOn = false;

    void toggle() {
        if (isOn) {
            isOn = false;
            off();
        } else {
            isOn = true;
            on();
        }
    }

    boolean isOn() {
        return isOn;
    }

    void on() {
        System.out.println("Light switched on");
    }

    void off() {
        System.out.println("Light switched off");
    }
}
