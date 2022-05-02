package com.cts.controller;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cts.dao.EmployeeDao;
import com.cts.dao.EmployeeDaoImpl;
import com.cts.model.Employee;

@RestController
public class EmployeeController {
	@Autowired
	EmployeeDao empDao;
	@GetMapping("/employee/{empno}")
	public Employee getEmployee(@PathVariable("empno") int empno) {
	//EmployeeDao empDao= new EmployeeDaoImpl();
	   return empDao.getEmployee(empno);	
		
	}
	
}
