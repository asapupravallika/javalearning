package com.codegnan.oop;

public class Box {
	double width; // instance variable
	double height;
	double depth;

	// instance method - create object to call
	public void volume() {
		System.out.println("Box Height : " + height);
		System.out.println("Box Width : " + width);
		System.out.println("Box Depth : " + depth);
		double volume = width * depth * height;
		System.out.println("Box Volume is : " + volume);
	}

	public static void main(String[] args) {
		Box myBox1 = new Box();
		myBox1.volume();
		
		Box myBox2 = new Box();
		myBox2.height = 10.0;
		myBox2.width = 12.0;
		myBox2.depth = 2.0;
		myBox2.volume();
	}

}
