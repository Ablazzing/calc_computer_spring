package com.javaacademy.calc_computer_spring;

import com.javaacademy.calc_computer_spring.calc.Printer;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.mock.mockito.SpyBean;

@SpringBootTest
public class PrinterTest {
    @SpyBean
    private Printer printer;

    @Test
    public void printSuccess() {
        Mockito.doReturn("45").when(printer).print(45);
        //Mockito.when(printer.print(45)).thenReturn("45"); - Только для MockBean
        String result = printer.print(45);
        System.out.println(result);

        Mockito.doReturn("Юрий").when(printer).print("Юрий");
        //Mockito.when(printer.print("Юрий")).thenReturn("Юрий"); - Только для MockBean
        String result2 = printer.print("Юрий");
        System.out.println(result2);

        String result3 = printer.print("Анбу");
        System.out.println(result3);
    }


}
