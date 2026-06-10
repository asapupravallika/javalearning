package com.codegnan.oop;

import java.util.Scanner;

public class FactorialUsingRecursion {
	
	public static long factorial(int n) {
		if(n==0) {
			return 1;
		}
		return n * factorial(n-1);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		if(n < 0 || n > 20) {
			System.out.println("Invalid Input. n must be between 0 to 20");
		} else {
			long fact = factorial(n);
			System.out.println(fact);
			scanner.close();
		}
	}

}
