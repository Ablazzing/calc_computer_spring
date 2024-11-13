package com.javaacademy.calc_computer_spring;

import com.javaacademy.calc_computer_spring.calc.Printer;

public class PrinterMock extends Printer {
    @Override
    public String print(Object object) {
        if (object.equals(Integer.valueOf(45))) {
            return "45";
        }
        if (object.equals("Юрий")) {
            return "Юрий";
        }
        return null;
    }
}
