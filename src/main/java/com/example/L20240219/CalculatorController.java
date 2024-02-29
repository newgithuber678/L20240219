package com.example.L20240219;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    private final CalculatorService service;

    public CalculatorController(CalculatorService service) {
        this.service = service;
    }

    @GetMapping("")
    public String hello() {
        return "Добро пожаловать в калькулятор";
    }

    @GetMapping("/plus")
    public String plus(Integer num1, Integer num2) {
        if (num1 == null || num2 == null)
            throw new IllegalArgumentException();
        return num1 + " + " + num2 + " = " + service.plus(num1, num2).toString();
    }

    @GetMapping("/minus")
    public String minus(Integer num1, Integer num2) {
        if (num1 == null || num2 == null)
            throw new IllegalArgumentException();
        return num1 + " - " + num2 + " = " + service.minus(num1, num2).toString();
    }

    @GetMapping("/multiply")
    public String multiply(Integer num1, Integer num2) {
        if (num1 == null || num2 == null)
            throw new IllegalArgumentException();
        return num1 + " * " + num2 + " = " + service.multiply(num1, num2).toString();
    }

    @GetMapping("/divide")
    public String divide(Integer num1, Integer num2) {
        if (num1 == null || num2 == null)
            throw new IllegalArgumentException();
        return num1 + " / " + num2 + " = " + service.divide(num1, num2).toString();
    }
}
