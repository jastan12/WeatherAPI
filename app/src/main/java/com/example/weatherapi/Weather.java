package com.example.weatherapi;

public class Weather {
   private String icon;
   private String description;
   private String main;
   private String id;

    public Weather(String icon, String description, String main, String id) {
        this.icon = icon;
        this.description = description;
        this.main = main;
        this.id = id;
    }

    public String getIcon() {
        return icon;
    }

    public String getDescription() {
        return description;
    }

    public String getMain() {
        return main;
    }

    public String getId() {
        return id;
    }
}
