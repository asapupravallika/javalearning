package com.codegnan.oop;

public class Person {
	int age;
	String name;
	
	public Person(String name, int age) {  //parameterized constructor 
		this.name = name;
		this.age = age;  
	}
	
	public Person() { //constructor overloading & default constructor
		
	}
	
	public static void main(String[] args) {
		Person p1 = new Person("pravi", 21);
		System.out.println("My name is " + p1.name + " and age is " + p1.age);
	}

}
