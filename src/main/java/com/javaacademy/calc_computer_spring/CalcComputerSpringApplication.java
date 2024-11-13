package com.javaacademy.calc_computer_spring;

import com.javaacademy.calc_computer_spring.calc.Calculator;
import com.javaacademy.calc_computer_spring.calc.Computer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@Slf4j
public class CalcComputerSpringApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(CalcComputerSpringApplication.class, args);
		Calculator calculator = context.getBean(Calculator.class);
		int result = calculator.add(5, 5);
		log.info("Результат сложения {}", result);

		Computer computer = context.getBean(Computer.class);
		int result2 = computer.addNumbers(10, 10);
		log.info("Результат сложения компьютера {}", result2);
	}

}
