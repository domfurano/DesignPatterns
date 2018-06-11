package com.dom.creational.Factory;


import java.util.Calendar;

public class FactoryEverydayDemo {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance(); // Returns GregorianCalendar type
        System.out.println(calendar);
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
    }
}
