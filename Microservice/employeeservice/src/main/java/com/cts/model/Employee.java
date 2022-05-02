package com.cts.model;

public class Employee {
	private int epno;
	private String name;
	private int salary;

	public Employee() {
		super();
	}

	public Employee(int epno, String name, int salary) {
		super();
		this.epno = epno;
		this.name = name;
		this.salary = salary;
	}

	public int getEpno() {
		return epno;
	}

	public void setEpno(int epno) {
		this.epno = epno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

}
