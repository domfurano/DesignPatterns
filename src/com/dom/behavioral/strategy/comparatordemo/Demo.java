package com.dom.behavioral.strategy.demo;

import java.util.List;

public class Demo {

    private static void printContents(List<Person> people) {
        for (Person person: people) {
            System.out.println(person.getName());
        }
    }

    public static void main(String[] args) {
        Person bryan = new Person("Bryan", "801-555-1212", 39);
        Person mark = new Person("Mark", "801-444-1234", 41);
        Person chris = new Person("Chris", "801-222-5151", 38);

    }
}
