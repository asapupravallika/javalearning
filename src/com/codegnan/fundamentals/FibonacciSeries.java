package com.codegnan.fundamentals;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of term in Fibonacci Series:");
		int numberOfTerms = scanner.nextInt();
		int firstTerm = 0, secondTerm = 1;
		System.out.println("Fibonacci Series:");
		System.out.print(firstTerm + " " + secondTerm + " ");
		for (int i = 2; i < numberOfTerms; i++) {
			int nextTerm = firstTerm + secondTerm;
			System.out.print(nextTerm + " ");
			firstTerm = secondTerm;
			secondTerm = nextTerm;
		}
		scanner.close();
	}

}
