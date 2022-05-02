package com.cts.dao;

import com.cts.model.Employee;

public interface EmployeeDao{
     Employee getEmployee(int empno);
     public Employee updateSalary(Employee emp);
}
