package com.dom.structural.bridge.Demo.shape2;

public abstract class Shape {

    protected Color color;

    public Shape(Color color) { // Composition
        this.color = color;
    }

    abstract public void applyColor();

}
