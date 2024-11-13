package com.javaacademy.calc_computer_spring;

import com.javaacademy.calc_computer_spring.calc.Calculator;

public class CalculatorMock extends Calculator {
    @Override
    public int add(int number1, int number2) {
        if (number1 == 10 && number2 == 10) {
            return 20;
        }
        return 0;
    }
}
