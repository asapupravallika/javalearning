package com.codegnan.fundamentals;

import java.util.Scanner;

public class PositiveNegative {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int n = sc.nextInt();
		String num = (n==0)? "Zero" : (n>0) ? "Positive" : "Negative";
		System.out.println("The given number is " + num);
		sc.close();
	}

}
