package com.codegnan.fundamentals;

import java.util.Scanner;

public class LibraryFineCalculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int code = scanner.nextInt();
		int days = scanner.nextInt();
		if(days <= 30) {
			days = days;
		} else {
			System.out.println("Enter days from 1 to 30");
			return;
		}
		switch(code) {
		case 1:
			System.out.println(1 * days);
			break;
		case 2:
			System.out.println(2 * days);
			break;
		case 3:
			System.out.println(5 * days);
			break;
		default:
			System.out.println("Invalid Code");
			break;
		}
		scanner.close();
	}

}
