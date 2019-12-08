package com.dom.behavioral.mediator.demo;

import java.util.ArrayList;
import java.util.List;

class Mediator {
    private List<Light> lights = new ArrayList<>();

    void registerLight(Light light) {
        lights.add(light);
    }

    void turnOnAllLights() {
        lights.forEach(light -> {
            if (!light.isOn()) {
                light.toggle();
            }
        });
    }

    void turnOffAllLights() {
        lights.forEach(light -> {
            if (light.isOn()) {
                light.toggle();
            }
        });
    }
}
