package com.staic_vs_instance;

public class CarHelper {
    static int price;
    private String color;

    public CarHelper(String color){
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
