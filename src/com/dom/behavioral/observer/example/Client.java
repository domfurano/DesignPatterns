package com.dom.behavioral.observer.example;

import java.util.Observable;
import java.util.Observer;

public class Client implements Observer {
    private final String name;

    public Client(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("Update " + name + "'s stream. Someone tweeted something.");
    }
}
