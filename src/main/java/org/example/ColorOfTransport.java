package org.example;

public enum ColorOfTransport {
    RED("Red"),
    GREEN("Green"),
    BLACK("Black");
    private String color;
    ColorOfTransport(String color) {
        this.color = color;
    }
    public String getInfo() {
        return "Color: " + color + "\n";
    }
}
