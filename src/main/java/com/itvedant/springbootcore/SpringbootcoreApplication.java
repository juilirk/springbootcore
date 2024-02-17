package com.itvedant.springbootcore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.itvedant.student"})
public class SpringbootcoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootcoreApplication.class, args);
	}

}
