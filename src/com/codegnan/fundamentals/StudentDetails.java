package com.codegnan.fundamentals;

import java.util.Scanner;

public class StudentDetails {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your RollNo :");
		int rollNumber = scanner.nextInt();
		System.out.println("Enter your name :");
		String name = scanner.next();
		System.out.println("Enter your age :");
		int age = scanner.nextInt();
		System.out.println("Enter Student Grade : ");
		char grade = scanner.next().charAt(0);
		System.out.println("Student Details");
		System.out.println("----------------------------------");
		System.out.println("Student RollNumber : " + rollNumber);
		System.out.println("Student Name : " + name);
		System.out.println("Student Age : " + age);
		System.out.println("Student Grade : " + grade);
		scanner.close();
	}

}
