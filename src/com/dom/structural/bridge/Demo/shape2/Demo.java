package com.dom.structural.bridge.Demo.shape2;

public class Demo {

    public static void main(String[] args) {
        Color blue = new Blue();

        Shape square = new Square(blue);

        square.applyColor();
    }
}
