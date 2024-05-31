package org.example;

import org.example.Receiver.Light;

public class Main {
    public static void main(String[] args) {

        Invoker invoker = new Invoker(new LightsOnCommand(new Light()));
        invoker.executeCommand1();
        invoker.unexecuteCommand1();

    }
}