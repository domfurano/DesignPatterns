package com.dom.behavioral.command.Example;

class Task implements Runnable {
    private final int a;
    private final int b;

    Task(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public String toString() {
        return a + " " + b;
    }

    @Override
    public void run() {
        System.out.println(this.toString());
    }
}
