package com.dom.behavioral.chainofresponsibility.Demo;

public class CEO extends Handler {
    @Override
    public void handleRequest(Request request) {
        System.out.println(request.toString() + " handled by CEO!");
    }
}
