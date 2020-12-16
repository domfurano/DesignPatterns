package com.dom.behavioral.observer.demo;

public abstract class Observer {
    protected Subject subject;
    abstract void update();
}
