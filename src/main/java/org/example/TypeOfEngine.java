package org.example;

public enum TypeOfEngine {
    GASOLINE("Gasoline"),
    DIESEL("Diesel"),
    ELECTRIC("Electric");
    private String type;
    TypeOfEngine(String type) {
        this.type = type;
    }
    public String getInfo() {
        return "Type of engine: " + type + "\n";
    }

}
