package com.codegnan.oop;

import java.util.Date;

public class RuntimeDemo {

	public static void main(String[] args) {
		Runtime runtime = Runtime.getRuntime(); // to get object of runtime method
		System.out.println("Total Memory of the heap " + runtime.totalMemory());
		System.out.println("Free Memory of the heap " + runtime.freeMemory());
		for(int i=0;i<10000;i++) {
			Date d = new Date(); //10000 objects created
			d = null;
		}
		System.out.println("Free Memory of the heap " + runtime.freeMemory());
		runtime.gc();
		System.out.println("Free Memory of the heap " + runtime.freeMemory());
	}

}
