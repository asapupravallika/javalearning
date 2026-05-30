package com.codegnan.fundamentals;

import java.util.Scanner;

public class VotingEligibility {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age:");
		int age = sc.nextInt();
		String eligibility = age >= 18 ? "You are Eligible to Vote" : "You are not Eligible to Vote";
		System.out.println(eligibility);
		sc.close();
	}

}
