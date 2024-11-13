package com.javaacademy.calc_computer_spring;

import com.javaacademy.calc_computer_spring.calc.Calculator;
import com.javaacademy.calc_computer_spring.calc.Computer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.mock.mockito.SpyBean;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class ComputerWithFakeCalcIntegrationTest {
    @Autowired
    private Computer computer;
    @MockBean
    private Calculator calculator;

    @Test
    public void addSuccess() {
        Mockito.when(calculator.add(7, 2)).thenReturn(9);

        int result = computer.addNumbers(7, 2);
        int expected = 9;

        assertEquals(expected, result);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/calc/calc_cases.csv", numLinesToSkip = 1, delimiter = ';')
    public void addSuccessCsv(int number1, int number2, int expected) {
        int result = computer.addNumbers(number1, number2);
        assertEquals(expected, result);
    }

}
