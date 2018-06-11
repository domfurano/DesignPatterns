package com.dom.behavioral.ChainOfResponsibility.Demo;

public class Director extends Handler {
    @Override
    public void handleRequest(Request request) {
        if (request.getRequestType() == Request.RequestType.CONFERENCE) {
            System.out.println( request.toString() + " approved by director!");
        } else {
            System.out.println("Director cannot approve " + request.toString() + " handing off to successor.");
            successor.handleRequest(request);
        }
    }
}
