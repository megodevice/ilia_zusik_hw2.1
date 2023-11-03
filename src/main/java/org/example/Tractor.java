package org.example;

import java.awt.*;

public final class Tractor extends Car {
    public Tractor(int passengers, ColorOfTransport color, Engine engine, Trailer trailer) {
        super(passengers, color, engine);
        this.trailer = trailer;
    }

    private Trailer trailer;

    public Trailer getTrailer() {
        return trailer;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + trailer.getInfo();
    }
}
