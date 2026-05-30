package com.codegnan.fundamentals;

import java.util.Scanner;

public class StudentGradeCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter marks:");
		int marks = sc.nextInt();
		char grade = (marks>90) ? 'A' : (marks>80) ? 'B' : (marks>70) ? 'C' : (marks>60) ? 'D' : (marks>50) ? 'E' : 'F';
		System.out.println("Grade : "+ grade);
		sc.close();
	}

}
