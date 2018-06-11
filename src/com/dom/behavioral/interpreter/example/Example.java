package com.dom.behavioral.interpreter.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example {
    public static void main(String[] args) {

        String input = "Lions, and tigers, and bears! Oh, my!";

        Pattern pattern = Pattern.compile("(lion|cat|dog|wolf|bear|human|tiger|liger)", Pattern.CASE_INSENSITIVE);


        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
