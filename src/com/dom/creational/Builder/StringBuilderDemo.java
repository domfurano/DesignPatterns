package com.dom.creational.builder;

public class StringBuilderDemo {

    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("a string ");

        stringBuilder.append(42);

        System.out.println(stringBuilder.toString());
    }

}
