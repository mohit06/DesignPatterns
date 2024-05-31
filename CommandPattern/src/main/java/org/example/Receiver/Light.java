package org.example.Receiver;

public class Light {

    private boolean switchLightOn = false;

    public void setLightOn(){
        this.switchLightOn=true;
        System.out.println("Lights On.");
    }

    public void setLightOff(){
        this.switchLightOn=false;
        System.out.println("Lights Off.");
    }

    public boolean isLightOn(){
        return switchLightOn;
    }
}
