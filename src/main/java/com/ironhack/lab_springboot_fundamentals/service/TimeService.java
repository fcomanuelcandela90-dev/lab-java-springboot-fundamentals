package com.ironhack.lab_springboot_fundamentals.service;

import org.springframework.stereotype.Service;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.TextStyle;
import java.util.Locale;

@Service
public class TimeService {

    public String getCurrentTime() {
        return LocalTime.now().toString();
    }

    public String getCurrentDate() {
        return LocalDate.now().toString();
    }

    public String getDayOfWeek() {
        return LocalDate.now().getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.ENGLISH);
    }

}
