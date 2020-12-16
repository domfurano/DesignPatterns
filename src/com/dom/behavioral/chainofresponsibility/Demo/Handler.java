package com.dom.behavioral.chainofresponsibility.Demo;

public abstract class Handler {
    Handler successor;
    void setSuccessor(Handler successor) {
        this.successor = successor;
    }
    abstract void handleRequest(Request request);
}
