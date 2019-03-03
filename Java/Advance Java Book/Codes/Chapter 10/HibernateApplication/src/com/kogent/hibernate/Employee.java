package com.kogent.hibernate;

public class Employee {

	int employeeId;
	
	String name;

	int age;

	double salary;

	public int getEmployeeId() {
		return employeeId;
	}
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public double getSalary() {
		return salary;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}
}
