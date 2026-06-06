package com.codegnan.fundamentals;

import java.util.Scanner;

public class PalindromeNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number:");
		int number = scanner.nextInt();
		int original = number;
		int reversedNumber = 0;
		while(number!=0) {
			int digit = number%10;
			reversedNumber = reversedNumber * 10 + digit;
			number /= 10;
		}
		
		if(original == reversedNumber) {
			System.out.println(original + " is a Palindrome Number.");
		} else {
			System.out.println(original + " is not a Palindrome Number.");
		}
		
		scanner.close();

	}
}
