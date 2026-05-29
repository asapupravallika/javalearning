package com.codegnan.fundamentals;

import java.util.Scanner;

public class ciInMonths {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Principle Amount:");
		double principle = sc.nextDouble();
		System.out.println("Enter the Rate of Interest:");
		double rate = sc.nextDouble();
		System.out.println("Enter the Time (in months):");
		double time = sc.nextDouble();
		double amount = principle * (Math.pow(1 + (rate/100), time/12));
		double ci = amount - principle;
		System.out.println("Amount : " + amount);
		System.out.println("Compound Interest : " + ci);
		sc.close();
	}

}
