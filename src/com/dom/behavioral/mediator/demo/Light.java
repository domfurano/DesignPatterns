package com.dom.behavioral.mediator.demo;

import java.util.List;

// Receiver
class Light {

    private boolean isOn = false;

    private String location = "";

    public Light() {
    }

    public Light(String location) {
        this.location = location;
    }

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
        System.out.println(location + " light switched on");
    }

    void off() {
        System.out.println(location + " light switched off");
    }
}
