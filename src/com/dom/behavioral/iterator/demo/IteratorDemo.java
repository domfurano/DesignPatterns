package com.dom.behavioral.iterator.demo;

import java.util.Iterator;

public class IteratorDemo {

    public static void main(String[] args) {
        BikeRepository bikeRepository = new BikeRepository();

        bikeRepository.addBike("Cervelo");
        bikeRepository.addBike("Scott");
        bikeRepository.addBike("Fuji");

        Iterator<String> bikeIterator = bikeRepository.iterator();

        while(bikeIterator.hasNext()) {
            System.out.println(bikeIterator.next());
        }
    }
}
