package com.codegnan.fundamentals;

import java.util.Scanner;

public class PositiveNumberExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int number = sc.nextInt();
		if(number>0) {
			System.out.println("The number " + number + " is positive.");
		}
		sc.close();
	}

}

