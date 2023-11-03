package org.example;

import java.awt.*;

public class Transport {
    private int passengers;
    private ColorOfTransport color;
    private Engine engine;

    public Transport(int passengers, ColorOfTransport color, Engine engine) {
        this.passengers = passengers;
        this.color = color;
        this.engine = engine;
    }

    public int getPassengers() {
        return passengers;
    }

    public ColorOfTransport getColor() {
        return color;
    }

    public Engine getEngine() {
        return engine;
    }

    public void makeBeep() {
        System.out.println("Transport make a own sound");
    }

    public String getInfo() {
        return engine.getInfo() + "Passengers: " + passengers + "\n" + color.getInfo();
    }

    public String startEngine() {
        return "Engine was started!!!";
    }

}
