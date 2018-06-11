package com.dom.behavioral.ChainOfResponsibility.Demo;

public class VP extends Handler {
    @Override
    public void handleRequest(Request request) {
        if (request.getRequestType() == Request.RequestType.PURCHASE) {
            if (request.getAmount() < 1500) {
                System.out.println( request.toString() + " approved by VP!");
            } else {
                System.out.println(request.toString() + " amount is too large to handle by VP.");
                successor.handleRequest(request);
            }
        }
    }
}
