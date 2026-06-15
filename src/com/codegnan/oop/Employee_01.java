package com.codegnan.oop;

public class Employee_01 {
	private int id;
	private String name;
	private double salary;
	
	public Employee_01(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public void setId(int id) {
		if(id<0) {
			System.out.println("Invalid ID");
			System.exit(0);
		} else {
			this.id = id;
		}
		//setter for id
	}
	
	public int getId() {
		return id;
	}
	
	public void setName(String name) {
		if(name == null || name.equals("")) {
			System.out.println("Invalid Name");
			System.exit(0);
		} else {
			this.name = name;
		}
	}
	
	public String getName() {
		return name;
	}
	
	public void setSalary(double salary) {
		if(salary<0) {
			System.out.println("Invalid Salary");
			System.exit(0);
		} else {
			this.salary = salary;
		}
	}
	
	public double getSalary() {
		return salary;
	}

	public void displayDetails() {
		System.out.println("Employee Id : " + id);
		System.out.println("Employee Name : " + name);
		System.out.println("Employee Salary : " + salary);
	}
	
	
}
