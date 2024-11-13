package com.javaacademy.calc_computer_spring;

import com.javaacademy.calc_computer_spring.calc.Printer;

public class PrinterSpy extends Printer {
    private Printer printer;

    public PrinterSpy(Printer printer) {
        this.printer = printer;
    }

    @Override
    public String print(Object object) {
        if (object.equals(Integer.valueOf(45))) {
            return "45";
        }
        if (object.equals("Юрий")) {
            return "Юрий";
        }
        return printer.print(object);
    }
}
