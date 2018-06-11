package com.dom.behavioral.command.demo;

// Invoker
class Switch {
    void storeAndExecute(Command command) {
        command.execute();
    }
}
