package com.codegnan.fundamentals;

import java.util.Scanner;

public class PartnershipsDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int investmentA = sc.nextInt();
		int monthsA = sc.nextInt();
		int investmentB = sc.nextInt();
		int joinedAfterA = sc.nextInt();
		int profit = sc.nextInt();
		
		int effectiveA = investmentA * monthsA;
		int monthsB = 12 - joinedAfterA;
		int effectiveB = investmentB * monthsB;
		int totalRatio = effectiveA + effectiveB;
		double bShare = ((double)effectiveB / totalRatio) * profit;
		
		System.out.println("B's share: " + bShare);
		sc.close();
	}

}
