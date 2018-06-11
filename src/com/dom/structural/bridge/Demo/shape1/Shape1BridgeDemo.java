package com.dom.structural.bridge.Demo.shape1;

public class Shape1BridgeDemo {
    public static void main(String[] args) {
        Circle circle = new BlueCircle();

        Square square = new RedSqaure();

        circle.applyColor();
        square.applyColor();

        // Will cause an explosion of classes for new colors or shapes
    }
}
