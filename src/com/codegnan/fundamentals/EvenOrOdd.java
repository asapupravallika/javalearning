package com.codegnan.fundamentals;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String result = (num%2 == 0) ? "Even" : "Odd";
		System.out.println(num + " is " + result);
		sc.close();
	}

}
