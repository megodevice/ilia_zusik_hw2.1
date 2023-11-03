package org.example;

public class Engine {
    private TypeOfEngine typeOfEngine;
    private int volume;
    private int power;

    public Engine(TypeOfEngine typeOfEngine, int volume, int power) {
        this.typeOfEngine = typeOfEngine;
        this.volume = volume;
        this.power = power;
    }

    public TypeOfEngine getTypeOfEngine() {
        return typeOfEngine;
    }

    public int getVolume() {
        return volume;
    }

    public int getPower() {
        return power;
    }

    public String getInfo() {
        return typeOfEngine.getInfo() +
                ((typeOfEngine == TypeOfEngine.ELECTRIC) ? "Power: " + power + "\n" :
                        "Power: " + power + "\n" + "Volume: " + volume + "\n");
    }
}
