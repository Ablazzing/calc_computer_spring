package com.javaacademy.calc_computer_spring;

import com.javaacademy.calc_computer_spring.calc.Calculator;
import com.javaacademy.calc_computer_spring.calc.Computer;
import com.javaacademy.calc_computer_spring.calc.Printer;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.ApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class ComputerIntegrationTest {
    @Autowired
    private Computer computer;

    @Test
    public void addSuccess() {
        int result = computer.addNumbers(10, 10);
        int expected = 20;
        assertEquals(expected, result);
    }
}
