package com.dom.structural.flyweight.demo;

public class Demo {
    public static void main(String[] args) {
        InventorySystem inventorySystem = new InventorySystem();
        for (int i = 0; i < 26; i++) {
            String s = String.valueOf((char) (('A' + (i % 3))));
            int num = (int)(Math.random() * 1000);
            inventorySystem.takeOrder(s, num);
        }
        inventorySystem.process();
        System.out.println(inventorySystem.report());
    }
}
