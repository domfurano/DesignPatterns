package com.dom.structural.proxy;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class EverydayExample {
    public static void main(String[] args) {

    }

    public Object invoke(Object proxy, Method m, Object[] args) throws Throwable {
        Object result;
        try {
            result = m.invoke(proxy, args);
        } catch (InvocationTargetException e) {
            throw e.getTargetException();
        } catch (Exception e) {
            throw new RuntimeException("Unexpected invocation exception", e);
        }
        return result;
    }
}
