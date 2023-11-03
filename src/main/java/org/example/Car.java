package org.example;

import java.awt.*;

public class Car extends Transport {
    public Car(int passengers, ColorOfTransport color, Engine engine) {
        super(passengers, color, engine);
    }

    public final void go() {
        System.out.println("The car drove off in an unknown direction");
    }
    public void go(String where) {
        System.out.println("The car drove away in the direction of the " + where);
    }

    public void go(String where, String fromWhere) {
        System.out.println("The car drove away from the " + fromWhere + " in the direction of the " + where);
    }


}
