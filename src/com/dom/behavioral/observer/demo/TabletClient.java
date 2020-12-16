package com.dom.behavioral.observer.demo;

public class TabletClient extends Observer {
    public TabletClient(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    public void addMessage(String message) {
        subject.setState(message + " - sent from tablet");
    }

    @Override
    void update() {
        System.out.println("Tablet Stream: " + subject.getState());
    }
}
