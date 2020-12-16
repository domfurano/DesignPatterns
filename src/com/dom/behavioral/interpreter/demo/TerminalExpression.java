package com.dom.behavioral.interpreter.demo;

import java.util.StringTokenizer;

public class TerminalExpression implements Expression {

    private String data;

    TerminalExpression(String data) {
        this.data = data;
    }

    @Override
    public boolean interpret(String context) {
        StringTokenizer tokenizer = new StringTokenizer(context);
        while (tokenizer.hasMoreTokens()) {
            String next = tokenizer.nextToken();
            if (next.equals(data)) {
                return true;
            }
        }
        return false;
    }
}
