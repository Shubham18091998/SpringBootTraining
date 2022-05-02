package com.cts.salaryservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.cts.*")
public class NewsalaryserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(NewsalaryserviceApplication.class, args);
	}

}
