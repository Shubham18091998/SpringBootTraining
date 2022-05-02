package com.cts.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.cts.model.*;
@RestController
public class EmployeeController {
    @GetMapping("/employee")
	public Employee getEmployee() {
		Employee emp= new Employee(102,"Meena",3000);
		return emp;
	}
}
