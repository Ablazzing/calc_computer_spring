package com.javaacademy.calc_computer_spring;

import com.javaacademy.calc_computer_spring.calc.Calculator;

public class CalculatorSpy extends Calculator {
    private Calculator calculator;

    public CalculatorSpy(Calculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public int add(int number1, int number2) {
        if (number1 == 0 && number2 == 0) {
            return 1;
        }

        return calculator.add(number1, number2);
    }
}
