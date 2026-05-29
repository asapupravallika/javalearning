package com.codegnan.fundamentals;

import java.util.Scanner;

public class StudentScoreEvaluation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s1 = sc.nextInt();
		int s2 = sc.nextInt();
		int s3 = sc.nextInt();
		int total = s1 + s2 + s3;
		int avg = total / 3;
		
		boolean isAvgOk = avg>=50;
		boolean areScoresOk = (s1 > 40) && (s2 > 40) && (s3 > 40);
		boolean isEligible = isAvgOk && areScoresOk;
		System.out.println(total);
		System.out.println(avg);
		System.out.println(isEligible);
		sc.close();
	}
}