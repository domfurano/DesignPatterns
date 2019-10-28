package com.dom.behavioral.strategy;

import java.util.*;

public class EverydayExample {

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();

        // Can swap out the sorting strategy of a collection by
        // implementing a new comparator.
        Collections.sort(people, (o1, o2) -> {
            if (o1.getAge() > o2.getAge()) {
                return 1;
            }

            if (o1.getAge() < o2.getAge()) {
                return -1;
            }

            return 0;
        });
    }

    class Person {
        int age;

        int getAge() {
            return age;
        }
    }
}

