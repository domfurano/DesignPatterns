package com.dom.structural.adapter;

import java.util.Arrays;
import java.util.List;

public class AdapterEverydayExample {

    public static void main(String[] args) {
        Integer[] array = new Integer[] {42, 43, 44};

        // It is an adapter because it is just adapting functionality rather than adding or decorating the class.
        // That is a separate pattern called the "Decorator" pattern.

        // Java API makes good use of generics and returns the correct object type without us having to specify it.

        // Arrays is the legacy API.

        // Poor example because it is one method (one adapter) of whatever array type being passed in.
        List<Integer> list = Arrays.asList(array);

        System.out.println(array);

        System.out.println(list);
    }
}
