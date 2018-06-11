package com.dom.behavioral.ChainOfResponsibility.Demo;

public class Request {
    public enum RequestType {
        CONFERENCE, PURCHASE
    }

    private RequestType requestType;
    private int amount;

    public Request(RequestType requestType, int amount) {
        this.requestType = requestType;
        this.amount = amount;
    }

    public RequestType getRequestType() {
        return requestType;
    }

    public int getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return requestType.name() + " " + amount;
    }
}
