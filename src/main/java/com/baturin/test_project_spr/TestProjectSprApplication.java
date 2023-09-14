package com.baturin.test_project_spr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class TestProjectSprApplication {

	@Autowired

	Calculator calculator;
	public static void main(String[] args) {

		SpringApplication.run(TestProjectSprApplication.class, args);
	}
	@Bean
	public void outToConsole() {
		System.out.print("Result: ");
		calculator.calc(2, 3);
	}

}
