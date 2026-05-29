package com.codegnan.fundamentals;

import java.util.Scanner;

public class CompoundInterest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double principle = sc.nextDouble();
		double rate = sc.nextDouble();
		double time = sc.nextDouble();
		double amount = principle * Math.pow(1+(rate/100), time);
		System.out.println(amount);
		double ci = amount - principle;
		System.out.println(ci);
		sc.close();
	}
}