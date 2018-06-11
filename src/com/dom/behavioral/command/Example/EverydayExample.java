package com.dom.behavioral.command.Example;

public class EverydayExample {
    public static void main(String[] args) {
        Task task1 = new Task(10, 12);
        Task task2 = new Task(11, 13);

        Thread thread1 = new Thread(task1);
        thread1.start();

        Thread thread2 = new Thread(task2);
        thread2.start();
    }
}
