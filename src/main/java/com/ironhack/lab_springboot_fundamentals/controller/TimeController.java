package com.ironhack.lab_springboot_fundamentals.controller;

import com.ironhack.lab_springboot_fundamentals.service.TimeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class TimeController {
    private final TimeService timeService;

    public TimeController(TimeService timeService) {
        this.timeService = timeService;
    }

    @GetMapping("time")
    public String getCurrentTime() {
        return timeService.getCurrentTime();
    }

    @GetMapping("date")
    public String getCurrentDate() {
        return timeService.getCurrentDate();
    }

    @GetMapping("day")
    public String getDayOfWeek() {
        return timeService.getDayOfWeek();
    }

    @GetMapping("all")
    public Map<String, String> getAllTimeInfo(){
        return Map.of(
            "time", timeService.getCurrentTime(),
            "date", timeService.getCurrentDate(),
            "day", timeService.getDayOfWeek()
        );
    }
}
