package com.javaacademy.calc_computer_spring.calc;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
@Slf4j
public class Computer {
    private final Calculator calculator;
    private final Printer printer;

    public int addNumbers(int number1, int number2) {
        int result = calculator.add(number1, number2);
        log.info(printer.print(result));
        return result;
    }
}
