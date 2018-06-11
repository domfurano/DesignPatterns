package com.dom.behavioral.ChainOfResponsibility.Demo;

public class CEO extends Handler {
    @Override
    public void handleRequest(Request request) {
        System.out.println(request.toString() + " handled by CEO!");
    }
}
