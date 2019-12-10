package com.example.weatherapi;

public class Wind {
    private int deg;
    private double speed;

    public Wind(int deg, double speed) {
        this.deg = deg;
        this.speed = speed;
    }

    public int getDeg() {
        return deg;
    }

    public double getSpeed() {
        return speed;
    }
}
