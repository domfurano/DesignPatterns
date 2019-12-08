package com.dom.behavioral.mediator.demo;


public class TurnOnAllLightsCommand implements Command {
    private Mediator mediator;
    TurnOnAllLightsCommand(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void execute() {
        mediator.turnOnAllLights();
    }
}
