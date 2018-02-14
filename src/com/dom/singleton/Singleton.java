package com.dom.singleton;

// Not threadsafe
// Eagerly loaded
public class Singleton {
    private static Singleton instance = new Singleton();

    private Singleton() {
    }

    public static Singleton getInstance() {
        return instance;
    }
}
