package com.codegnan.fundamentals;

import java.util.Scanner;

public class ShopkeeperPurchase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int initialPrice = sc.nextInt();
		int discountAmount = sc.nextInt();
		int surcharge = sc.nextInt();
		int budget = sc.nextInt();
		
		int finalCost = initialPrice - discountAmount + surcharge;
		boolean budgetRange = finalCost > 0 && finalCost <= budget;
		System.out.println(finalCost);
		System.out.println(budgetRange);
		sc.close();
	}

}
