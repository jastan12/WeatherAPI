package com.example.weatherapi;

public class Main {
    private double temp;
    private double temp_min;
    private double humidity;
    private double pressure;
    private double temp_max;

    public Main(double temp, double temp_min, double humidity, double pressure, double temp_max) {
        this.temp = temp;
        this.temp_min = temp_min;
        this.humidity = humidity;
        this.pressure = pressure;
        this.temp_max = temp_max;
    }

    public double getTemp() {
        return temp;
    }

    public double getTemp_min() {
        return temp_min;
    }

    public double getHumidity() {
        return humidity;
    }

    public double getPressure() {
        return pressure;
    }

    public double getTemp_max() {
        return temp_max;
    }
}
