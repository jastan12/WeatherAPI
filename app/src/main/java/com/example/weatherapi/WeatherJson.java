package com.example.weatherapi;

import java.util.List;

public class WeatherJson {
    private int visibility;
    private int timezone;
    private Main main;
    private Clouds clouds;
    private Sys sys;
    private long dt;
    private Coord coord;
    private List<Weather> weather;
    private String name;
    private int cod;
    private long id;
    private String stations;
    private Wind wind;

    public WeatherJson(int visibility, int timezone, Main main, Clouds clouds, Sys sys, long dt, Coord coord, List<Weather> weather, String name, int cod, long id, String stations, Wind wind) {
        this.visibility = visibility;
        this.timezone = timezone;
        this.main = main;
        this.clouds = clouds;
        this.sys = sys;
        this.dt = dt;
        this.coord = coord;
        this.weather = weather;
        this.name = name;
        this.cod = cod;
        this.id = id;
        this.stations = stations;
        this.wind = wind;
    }

    public int getVisibility() {
        return visibility;
    }

    public int getTimezone() {
        return timezone;
    }

    public Main getMain() {
        return main;
    }

    public Clouds getClouds() {
        return clouds;
    }

    public Sys getSys() {
        return sys;
    }

    public long getDt() {
        return dt;
    }

    public Coord getCoord() {
        return coord;
    }

    public List<Weather> getWeather() {
        return weather;
    }

    public String getName() {
        return name;
    }

    public int getCod() {
        return cod;
    }

    public long getId() {
        return id;
    }

    public String getStations() {
        return stations;
    }

    public Wind getWind() {
        return wind;
    }
}
