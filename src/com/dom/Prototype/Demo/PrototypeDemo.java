package com.dom.Prototype.Demo;

public class PrototypeDemo {
    public static void main(String[] args) {
        Registry registry = new Registry();
        Movie movie = (Movie) registry.createItem("Movie");
        movie.setTitle("Creational Patterns in Java");

        System.out.println(movie);
        System.out.println(movie.getRuntime());
        System.out.println(movie.getTitle());
        System.out.println(movie.getUrl());

        Book anotherMovie = (Book) registry.createItem("Book");
        anotherMovie.setTitle("Gang of Four");

        System.out.println(anotherMovie);
        System.out.println(anotherMovie.getNumberOfPages());
        System.out.println(anotherMovie.getTitle());
        System.out.println(anotherMovie.getUrl());
    }
}
