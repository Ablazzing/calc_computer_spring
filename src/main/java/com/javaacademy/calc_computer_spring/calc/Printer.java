package com.javaacademy.calc_computer_spring.calc;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class Printer {

    public String print(Object object) {
        return "печать чего угодно: %s".formatted(object);
    }
}
