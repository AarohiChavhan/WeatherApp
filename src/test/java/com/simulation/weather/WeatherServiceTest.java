package com.simulation.weather;

import com.simulation.weather.main.WeatherApp;
import com.simulation.weather.service.WeatherService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = WeatherApp.class)
public class WeatherServiceTest {

    @Autowired
    private WeatherService service;

    @Test
    public void testWhenCityDataExists(){
        String cityList[] = {"Mumbai", "Shanghai"};
        StringBuilder data= service.getWeatherByCity(cityList);
        assertNotNull(data);
        assertTrue(data.toString().contains(cityList[0]));
        assertTrue(data.toString().contains(cityList[1]));
    }

    @Test
    public void testWhenNoCityEntered(){
        String cityList[] ={};
        StringBuilder data= service.getWeatherByCity(cityList);
        assertEquals("Re-run program with city to get weather data", data.toString());
    }

    @Test
    public void testWhenCityNotPresent(){
        String cityList[]={"Kolkata"};
        StringBuilder data= service.getWeatherByCity(cityList);
        assertTrue(data.toString().contains("City Weather not available currently"));
    }
}
