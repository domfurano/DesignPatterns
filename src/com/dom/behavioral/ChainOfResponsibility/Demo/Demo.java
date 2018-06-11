package com.dom.behavioral.ChainOfResponsibility.Demo;

public class Demo {

    public static void main(String[] args) {
        Director bryan = new Director();
        VP crystal = new VP();
        CEO jeff = new CEO();

        bryan.setSuccessor(crystal);
        crystal.setSuccessor(jeff);

        Request request = new Request(Request.RequestType.CONFERENCE, 500);
        bryan.handleRequest(request);

        request = new Request(Request.RequestType.PURCHASE, 1000);
        bryan.handleRequest(request);

        request = new Request(Request.RequestType.PURCHASE, 2000);
        bryan.handleRequest(request);
    }
}
