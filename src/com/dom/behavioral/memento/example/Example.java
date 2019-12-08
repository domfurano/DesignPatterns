package com.dom.behavioral.memento.example;


import java.io.*;

public class Example {

    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setName("Dominic Furano");
        employee.setAddress("299 S. Main St.");
        employee.setPhone("801-555-5555");
        serialize(employee);
        Employee deserializedEmployee = deserialize();
        System.out.println(deserializedEmployee.getName());
    }

    private static void serialize(Employee employee) {
        try {
            try (FileOutputStream stream = new FileOutputStream("./employee.ser")) {
                try (ObjectOutputStream out = new ObjectOutputStream(stream)) {
                    out.writeObject(employee);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static Employee deserialize() {
        try (FileInputStream stream = new FileInputStream("./employee.ser")) {
            try (ObjectInputStream in = new ObjectInputStream(stream)) {
                return (Employee) in.readObject();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
                return null;
            }
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
