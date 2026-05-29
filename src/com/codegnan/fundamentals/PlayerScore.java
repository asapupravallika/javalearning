package com.codegnan.fundamentals;

import java.util.Scanner;

public class PlayerScore {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int baseScore = sc.nextInt();
		int bonus = sc.nextInt();
		
		int totalScore = 2 * (baseScore + bonus);
		boolean result = (totalScore > 50) && (bonus % 2 != 0);
		System.out.println(totalScore);
		System.out.println(result);
		sc.close();
	}
}