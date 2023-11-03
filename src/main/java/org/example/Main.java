package org.example;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(5, ColorOfTransport.BLACK, new Engine(TypeOfEngine.GASOLINE, 1500, 107));
        Tractor tractor1 = new Tractor(2, ColorOfTransport.RED, new Engine(TypeOfEngine.DIESEL, 8000, 800), new Trailer(5000));
        Tractor tractor2 = new Tractor(2, ColorOfTransport.GREEN, new Engine(TypeOfEngine.DIESEL, 10000, 1000), new Trailer(15000));
        Car[] cars = {car, tractor1, tractor2};
        for (Car thisCar: cars) {
            System.out.println(thisCar.getInfo());
            thisCar.go();
            thisCar.go("home");
            thisCar.go("work", "home");
            System.out.println("---------------------------------------------------");
        }
    }
}