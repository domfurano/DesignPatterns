package com.dom.behavioral.observer.example;

import java.util.Observable;

public class TwitterStream extends Observable {
    public void someoneTweeted() {
        setChanged();
        notifyObservers();
    }
}
