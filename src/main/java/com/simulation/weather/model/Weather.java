package com.simulation.weather.model;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Weather {
    private String city;
    private Double latitude;
    private Double longitude;
    private Double elevation;
    private String position;
    private LocalDateTime localTime;
    private String conditions;
    private Double temperature;
    private Double pressure;
    private Integer humidity;

    public Weather(String city, Double latitude, Double longitude, Double elevation, LocalDateTime localTime, String conditions, Double temperature, Double pressure, Integer humidity) {
        this.city = city;
        this.latitude = latitude;
        this.longitude = longitude;
        this.elevation = elevation;
        this.position = this.latitude+ ","+this.longitude+","+this.elevation;
        this.localTime = localTime;
        this.conditions = conditions;
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
    }

    @Override
    public String toString() {
        return
                city + "|" +
                position + "|" +
                localTime + "|" +
                conditions + "|" +
                temperature + "|" +
                pressure + "|" +
                humidity
                ;
    }
}
