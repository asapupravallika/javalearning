package com.codegnan.oop;

public class Car {
	private String model;
	private String year;
	private String color;

	public Car() {
		this("2019","yellow");
		System.out.println("No parameters");
	}

	public Car(String model, String year, String color) {
		super();
		System.out.println("3 parameters");
		this.model = model;
		this.year = year;
		this.color = color;
	}
	
	public Car(String year, String color) {
		super();
		System.out.println("2 parameters");
		this.year = year;
		this.color = color;
	}

	public void displayCarDetails() {
		System.out.println("Model : " + model);
		System.out.println("Year : " + year);
		System.out.println("Color : " + color);
	}



	public static void main(String[] args) {
		Car c1 = new Car("Nexon", "2022", "White");
		c1.displayCarDetails();
	}

}
