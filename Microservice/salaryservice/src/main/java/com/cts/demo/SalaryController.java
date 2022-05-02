package com.cts.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.cts.model.Employee;

@RestController
public class SalaryController {
    @Autowired
	RestTemplate restTemplate;
	@GetMapping("/empsal")
	public Employee updateSalary() {
	  Employee emp=restTemplate.getForObject("http://eureka-employee-service/employee",Employee.class);
		   int salary= emp.getSalary();
		   salary+=1000;
		   emp.setSalary(salary);
		   return emp;
	}
	
}
