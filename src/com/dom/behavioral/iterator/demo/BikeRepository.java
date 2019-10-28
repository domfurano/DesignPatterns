package com.dom.behavioral.iterator.demo;

import java.util.Iterator;

class BikeRepository implements Iterable<String> {

    private String[] bikes;
    private int index;

    BikeRepository() {
        bikes = new String[10];
        index = 0;
    }

    void addBike(String bike) {
        if (index == bikes.length) {
            resize();
        }

        bikes[index] = bike;
        index++;
    }

    private void resize() {
        String[] largerBikes = new String[bikes.length + 5];
        System.arraycopy(bikes, 0, largerBikes, 0, bikes.length);
        bikes = largerBikes;
    }

    @Override
    public Iterator<String> iterator() {
        Iterator<String> iterator = new Iterator<String>() {

            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < bikes.length && bikes[index] != null;
            }

            @Override
            public String next() {
                return bikes[index++];
            }
        };

        return iterator;
    }
}
