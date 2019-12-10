package com.example.weatherapi;


public class Sys {
    private String country;
    private long sunrise;
    private long sunset;
    private int id;
    private int type;
    private double message;

    public Sys(String country, long sunrise, long sunset, int id, int type, double message) {
        this.country = country;
        this.sunrise = sunrise;
        this.sunset = sunset;
        this.id = id;
        this.type = type;
        this.message = message;
    }

    public String getCountry() {
        return country;
    }

    public long getSunrise() {
        return sunrise;
    }

    public long getSunset() {
        return sunset;
    }

    public int getId() {
        return id;
    }

    public int getType() {
        return type;
    }

    public double getMessage() {
        return message;
    }
}
