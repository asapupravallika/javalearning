package com.codegnan.fundamentals;

import java.util.Scanner;

public class AutomorphicNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		int square = number * number;
		int last_digit_number = number%10;
		int last_digit_square = square%10;
		if(last_digit_number == last_digit_square) {
			System.out.println("Automorphic Number");
		} else {
			System.out.println("Not a Automorphic Number");
		}
		scanner.close();
	}

}
