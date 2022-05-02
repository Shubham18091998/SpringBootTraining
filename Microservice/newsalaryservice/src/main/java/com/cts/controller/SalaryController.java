package com.cts.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.cts.dao.EmployeeDao;
import com.cts.model.Employee;
@RestController
public class SalaryController {
	// @Autowired
	//	RestTemplate restTemplate;
	 @Autowired
	 EmployeeDao employeeDao;
	 @GetMapping("/empsal/{empno}")
		public Employee updateSalary(@PathVariable("empno") int empno ) {
		  //Employee emp=restTemplate.getForObject("http://eureka-employee-service/employee/{"+empno+"}",Employee.class);
			  // Employee emp = new Employee(101,"Anita",2000);
		      // int salary= emp.getSalary();
			  // salary+=101;
			  // emp.setSalary(salary);
		      Employee emp=employeeDao.getEmployee(empno);
			   return employeeDao.updateSalary(emp);
		}	
}
