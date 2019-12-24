package com.simulation.weather.service;

import com.simulation.weather.model.Weather;
import com.simulation.weather.util.WeatherData;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Collections;
import java.util.Objects;
import java.util.stream.Collectors;

@Service
public class WeatherService {
    public StringBuilder getWeatherByCity(String city[]) {
        if(city.length == 0) {
            return new StringBuilder("Re-run program with city to get weather data");
        }
        WeatherData.prepareWeatherData();
        StringBuilder weatherData = new StringBuilder();
        for (String c : city) {
            Collection<Weather> cityWeather = WeatherData.getWeatherDataByCity(c);
            String data = cityWeather.stream().map(weather -> weather.toString()).collect(Collectors.joining(System.getProperty("line.separator")));
            if (data == null || data.isEmpty()) {
                weatherData.append(c + ": City Weather not available currently");
            } else {
                weatherData.append(data);
            }
            weatherData.append(System.getProperty("line.separator"));
        }

        return weatherData;
    }
}
