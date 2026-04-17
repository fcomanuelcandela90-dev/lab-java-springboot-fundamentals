package com.ironhack.lab_springboot_fundamentals.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @GetMapping("hello")
    public String sayHello() {
        return "Hello, World!";
    }

    @GetMapping("hello/{name}")
    public String sayHello(@PathVariable String name) {
        return "Hello, " + name + "!";
    }

    @GetMapping("add/{number1}/{number2}")
    public int add(@PathVariable int number1, @PathVariable int number2) {
        return number1 + number2;
    }

    @GetMapping("multiply/{number1}/{number2}")
    public int multiply(@PathVariable int number1, @PathVariable int number2) {
        return number1 * number2;
    }
}
