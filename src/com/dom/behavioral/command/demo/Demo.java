package com.dom.behavioral.command.demo;

import java.util.ArrayList;
import java.util.List;

class Demo {
    public static void main(String[] args) {
        Light bedroomLight = new Light();
        Light kitchenLight = new Light();
        Switch lightSwitch = new Switch();

        Command command = new ToggleCommand(bedroomLight);

        lightSwitch.storeAndExecute(command);
//        lightSwitch.storeAndExecute(command);
//        lightSwitch.storeAndExecute(command);

        List<Light> lightList = new ArrayList<>();
        lightList.add(bedroomLight);
        lightList.add(kitchenLight);

        Command allLightsCommand = new AllLightsCommand(lightList);

        lightSwitch.storeAndExecute(allLightsCommand);
    }
}
