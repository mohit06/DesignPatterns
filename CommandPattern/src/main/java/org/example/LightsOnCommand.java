package org.example;

import org.example.Receiver.Light;

import java.util.List;

public class LightsOnCommand implements ICommand{

    Light light;

    public LightsOnCommand(Light light){
        this.light =  light;
    }

    @Override
    public void execute() {
        light.setLightOn();
    }

    @Override
    public void unexecute() {
        light.setLightOff();
    }
}
