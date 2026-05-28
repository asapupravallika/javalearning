package com.codegnan.fundamentals;

import java.util.Scanner;

public class SimpleInterestCalculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Principle Amount : ");
		double principle = scanner.nextDouble();
		System.out.println("Enter rate of interest (in %) :");
		double rate = scanner.nextDouble();
		System.out.println("Enter Time (in Years) :");
		double time = scanner.nextDouble();
		double si = (principle * time * rate) / 100;
		double totalAmount = si + principle;
		System.out.println("Simple Interest : " + si);
		System.out.println("Total Amount : " + totalAmount);
		scanner.close();
	}
}