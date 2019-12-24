package com.simulation.weather.main;

import com.simulation.weather.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.simulation.weather")
public class WeatherApp implements CommandLineRunner {

    @Autowired
    private WeatherService weatherService;

    public static void main(String args[]){
        SpringApplication app = new SpringApplication(WeatherApp.class);
        app.setBannerMode(Banner.Mode.OFF);
        app.run(args);
    }

    public void run(String... args) throws Exception {
        StringBuilder weather = weatherService.getWeatherByCity(args);
        System.out.println(weather);
    }
}
