package com.dom.structural.composite.DemoCompositeMenu;

public class CompositeMenuDemo {
    public static void main(String[] args) {
        Menu mainMenu = new Menu("Main", "/main");
        MenuItem safetyMenyItem = new MenuItem("Safety", "/safety");
        mainMenu.add(safetyMenyItem);
        MenuItem claimsSubMenu = new MenuItem("Claims", "/claims");
        mainMenu.add(claimsSubMenu);
        MenuItem personalClaimSubMenu = new MenuItem("Personal Claims", "/personalClaims");
        mainMenu.add(personalClaimSubMenu);
        System.out.println(mainMenu.toString());
    }
}
