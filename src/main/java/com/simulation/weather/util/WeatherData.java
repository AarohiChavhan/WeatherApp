package com.simulation.weather.util;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;
import com.simulation.weather.model.Weather;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Collection;

public class WeatherData {
    private static Multimap<String, Weather> weatherData = ArrayListMultimap.create();

    public static void prepareWeatherData() {

        weatherData.put("Sydney", new Weather("Sydney",-33.87,151.21, 260.0, LocalDateTime.parse("2019-12-24T10:00:03Z",DateTimeFormatter.ISO_DATE_TIME),"Rainy",22.0,1016.0,83));
        weatherData.put("Sydney", new Weather("Sydney",-33.87,151.21, 260.0, LocalDateTime.parse("2019-12-24T11:00:05Z",DateTimeFormatter.ISO_DATE_TIME),"Rainy",21.5,1100.0,85));
        weatherData.put("Sydney", new Weather("Sydney",-33.87,151.21, 260.0, LocalDateTime.parse("2019-12-24T12:00:11Z",DateTimeFormatter.ISO_DATE_TIME),"Rainy",21.0,1100.0,87));

        weatherData.put("Mumbai", new Weather("Mumbai",19.01,72.85, 14.0, LocalDateTime.parse("2019-12-24T10:00:03Z",DateTimeFormatter.ISO_DATE_TIME),"Sunny",27.0,1011.0,58));
        weatherData.put("Mumbai", new Weather("Mumbai",19.01,72.85, 14.0, LocalDateTime.parse("2019-12-24T11:00:05Z",DateTimeFormatter.ISO_DATE_TIME),"Sunny",30.5,1056.8,60));
        weatherData.put("Mumbai", new Weather("Mumbai",19.01,72.85, 14.0, LocalDateTime.parse("2019-12-24T12:00:11Z",DateTimeFormatter.ISO_DATE_TIME),"Sunny",32.0,1089.9,65));

        weatherData.put("Singapore", new Weather("Singapore",1.29,103.85, 538.0, LocalDateTime.parse("2019-12-24T10:00:03Z",DateTimeFormatter.ISO_DATE_TIME),"Sunny",22.3,1009.0,60));
        weatherData.put("Singapore", new Weather("Singapore",1.29,103.85, 538.0, LocalDateTime.parse("2019-12-24T11:00:05Z",DateTimeFormatter.ISO_DATE_TIME),"Sunny",27.5,1020.8,65));
        weatherData.put("Singapore", new Weather("Singapore",1.29,103.85, 538.0, LocalDateTime.parse("2019-12-24T12:00:11Z",DateTimeFormatter.ISO_DATE_TIME),"Sunny",30.0,1050.1,70));

        weatherData.put("New York", new Weather("New York",40.71,-74.01, 10.0, LocalDateTime.parse("2019-12-24T10:00:03Z",DateTimeFormatter.ISO_DATE_TIME),"Snow",3.0,1017.0,60));
        weatherData.put("New York", new Weather("New York",40.71,-74.01, 10.0, LocalDateTime.parse("2019-12-24T11:00:05Z",DateTimeFormatter.ISO_DATE_TIME),"Snow",2.1,1020.8,62));
        weatherData.put("New York", new Weather("New York",40.71,-74.01, 10.0, LocalDateTime.parse("2019-12-24T12:00:11Z",DateTimeFormatter.ISO_DATE_TIME),"Snow",2.0,1074.3,70));

        weatherData.put("Shanghai", new Weather("Shanghai",31.22,121.46, 4.0, LocalDateTime.parse("2019-12-24T10:00:03Z",DateTimeFormatter.ISO_DATE_TIME),"Sunny",10.0,1017.0,60));
        weatherData.put("Shanghai", new Weather("Shanghai",31.22,121.46, 4.0, LocalDateTime.parse("2019-12-24T11:00:05Z",DateTimeFormatter.ISO_DATE_TIME),"Sunny",12.1,1020.8,62));
        weatherData.put("Shanghai", new Weather("Shanghai",31.22,121.46, 4.0, LocalDateTime.parse("2019-12-24T12:00:11Z",DateTimeFormatter.ISO_DATE_TIME),"Sunny",14.5,1074.3,70));

        weatherData.put("Paris", new Weather("Paris",48.85,2.35, 154.0, LocalDateTime.parse("2019-12-24T10:00:03Z",DateTimeFormatter.ISO_DATE_TIME),"Rain",10.0,987.5,60));
        weatherData.put("Paris", new Weather("Paris",48.85,2.35, 154.0, LocalDateTime.parse("2019-12-24T11:00:05Z",DateTimeFormatter.ISO_DATE_TIME),"Rain",12.1,990.0,62));
        weatherData.put("Paris", new Weather("Paris",48.85,2.35, 154.0, LocalDateTime.parse("2019-12-24T12:00:11Z",DateTimeFormatter.ISO_DATE_TIME),"Sunny",14.5,1011.2,59));

        weatherData.put("Bali", new Weather("Bali",25.18,73.28, 15.0, LocalDateTime.parse("2019-12-24T10:00:03Z",DateTimeFormatter.ISO_DATE_TIME),"Sunny",16.0,1087.5,58));
        weatherData.put("Bali", new Weather("Bali",25.18,73.28, 15.0, LocalDateTime.parse("2019-12-24T11:00:05Z",DateTimeFormatter.ISO_DATE_TIME),"Sunny",18.1,1102.6,66));
        weatherData.put("Bali", new Weather("Bali",25.18,73.28, 15.0, LocalDateTime.parse("2019-12-24T12:00:11Z",DateTimeFormatter.ISO_DATE_TIME),"Sunny",19.7,1108.6,70));

        weatherData.put("Kuala Lumpur", new Weather("Kuala Lumpur",3.14,101.6, 155.0, LocalDateTime.parse("2019-12-24T10:00:03Z",DateTimeFormatter.ISO_DATE_TIME),"Sunny",20.0,1087.5,60));
        weatherData.put("Kuala Lumpur", new Weather("Kuala Lumpur",3.14,101.6, 155.0, LocalDateTime.parse("2019-12-24T11:00:05Z",DateTimeFormatter.ISO_DATE_TIME),"Rain",19.1,1102.6,66));
        weatherData.put("Kuala Lumpur", new Weather("Kuala Lumpur",3.14,101.6, 155.0, LocalDateTime.parse("2019-12-24T12:00:11Z",DateTimeFormatter.ISO_DATE_TIME),"Rain",18.7,1108.6,70));

        weatherData.put("Manila", new Weather("Manila",14.6,120.98, 10.0, LocalDateTime.parse("2019-12-24T10:00:03Z",DateTimeFormatter.ISO_DATE_TIME),"Sunny",20.5,1009.6,62));
        weatherData.put("Manila", new Weather("Manila",14.6,120.98, 10.0, LocalDateTime.parse("2019-12-24T11:00:05Z",DateTimeFormatter.ISO_DATE_TIME),"Sunny",22.8,1100.5,65));
        weatherData.put("Manila", new Weather("Manila",14.6,120.98, 10.0, LocalDateTime.parse("2019-12-24T12:00:11Z",DateTimeFormatter.ISO_DATE_TIME),"Sunny",25.7,1100.5,68));

        weatherData.put("Quebec", new Weather("Quebec",46.81,-71.21, 10.0, LocalDateTime.parse("2019-12-24T10:00:03Z",DateTimeFormatter.ISO_DATE_TIME),"Snow",-2.0,1022.0,67));
        weatherData.put("Quebec", new Weather("Quebec",46.81,-71.21, 10.0, LocalDateTime.parse("2019-12-24T11:00:05Z",DateTimeFormatter.ISO_DATE_TIME),"Snow",-5.5,1158.7,69));
        weatherData.put("Quebec", new Weather("Quebec",46.81,-71.21, 10.0, LocalDateTime.parse("2019-12-24T12:00:11Z",DateTimeFormatter.ISO_DATE_TIME),"Snow",-10.5,1160.5,71));

    }

    public static Collection<Weather> getWeatherDataByCity(String city){
        return weatherData.get(city);
    }

}
