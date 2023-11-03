package org.example;

public class Trailer {
    private int loadableWeight;

    public Trailer(int loadableWeight) {
        this.loadableWeight = loadableWeight;
    }

    public int getLoadableWeight() {
        return loadableWeight;
    }

    public String getInfo() {
        return "Loadable weight of trailer: " + loadableWeight + "\n";
    }
}
