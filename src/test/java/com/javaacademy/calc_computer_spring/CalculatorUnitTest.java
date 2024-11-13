package com.javaacademy.calc_computer_spring;

import com.javaacademy.calc_computer_spring.calc.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorUnitTest {

    @Test
    public void addSuccess() {
        Calculator calculator = new Calculator();
        int result = calculator.add(5, 5);
        int expected = 10;
        assertEquals(expected, result);
    }


}
