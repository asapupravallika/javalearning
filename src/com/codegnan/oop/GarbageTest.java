package com.codegnan.oop;

public class GarbageTest {
	protected void finalize() {
		System.out.println("Garbage Collector called finalize()");//not called but gc executes is
	}
	
	public static void main(String[] args) {
		GarbageTest obj = new GarbageTest();
		obj = null;
		System.out.println("Requesting Garbage Collection");
		System.gc(); // using system call
		System.out.println("End of main method");
	}

}
