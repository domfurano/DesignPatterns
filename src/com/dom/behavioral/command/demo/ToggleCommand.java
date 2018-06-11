package com.dom.behavioral.command.demo;

class ToggleCommand implements Command {

    private Light light;

    ToggleCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.toggle();
    }
}
