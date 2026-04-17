package com.ironhack.lab_springboot_fundamentals.controller;

import com.ironhack.lab_springboot_fundamentals.service.WeatherService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("weather")
public class WeatherController {
    private final WeatherService weatherService;

    public WeatherController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }
    @GetMapping("temperature")
    public int getTemperature() {
        return weatherService.getCurrentTemperature();
    }
    @GetMapping("condition")
    public String getCondition() {
        return weatherService.getWeatherCondition();
    }
    @GetMapping("wind")
    public int getWind() {
        return weatherService.getWindSpeed();

    }
    @GetMapping("all")
    public Map<String, Object> getAllWeather(){
        return Map.of(
            "temperature", weatherService.getCurrentTemperature(),
            "condition", weatherService.getWeatherCondition(),
            "wind", weatherService.getWindSpeed()
        );
    }

}


