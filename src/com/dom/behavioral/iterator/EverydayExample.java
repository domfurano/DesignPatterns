package com.dom.behavioral.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EverydayExample {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        names.add("Bryan");
        names.add("Aaron");
        names.add("Jason");

        Iterator<String> namesIterator = names.iterator();

        // for-each is syntactic sugar for this
        while(namesIterator.hasNext()) {
            String name = namesIterator.next();
            System.out.println("name = " + name);
            namesIterator.remove();
        }

        System.out.println("Names size = " + names.size());
    }
}
