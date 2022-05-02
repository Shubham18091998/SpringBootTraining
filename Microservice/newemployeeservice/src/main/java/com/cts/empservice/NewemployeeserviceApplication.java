package com.cts.empservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.cts.*")
public class NewemployeeserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(NewemployeeserviceApplication.class, args);
	}

}
