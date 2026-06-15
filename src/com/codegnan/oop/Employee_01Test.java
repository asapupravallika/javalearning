package com.codegnan.oop;

public class Employee_01Test {
	public static void main(String[] args) {
		Employee_01 emp = new Employee_01(111, "Lucky", 35000);
		emp.displayDetails();
		emp.setId(101);
		emp.setName("Pravallika");
		emp.setSalary(70000);
		emp.displayDetails();
	}
}
