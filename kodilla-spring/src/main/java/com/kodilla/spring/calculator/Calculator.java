package com.kodilla.spring.calculator;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

@Service
public class Calculator {

    private final Display display;
    private double temp;

    @Autowired
    public Calculator(Display display) {
        this.display = display;
    }

    public double add(double a, double b){
        temp = a + b;
        display.displayValue(temp);
        return temp;
    }

    public double sub(double a, double b){
        temp = a - b;
        display.displayValue(temp);
        return temp;
    }

    public double mul(double a, double b){
        temp = a * b;
        display.displayValue(temp);
        return temp;
    }

    public double div(double a, double b){
        temp = a / b;
        display.displayValue(temp);
        return temp;
    }
}
