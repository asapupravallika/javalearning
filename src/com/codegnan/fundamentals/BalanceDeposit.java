package com.codegnan.fundamentals;

import java.util.Scanner;

public class BalanceDeposit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int amount = sc.nextInt();
		int deposit = sc.nextInt();
		int balance = amount + deposit;
		boolean isBalanceOk = (balance > 1000) && (balance%2 == 0);
		System.out.println(balance);
		System.out.println(isBalanceOk);
		sc.close();
	}

}
