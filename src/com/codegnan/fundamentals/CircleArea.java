package com.codegnan.fundamentals;

import java.util.Scanner;

public class CircleArea {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int radius = sc.nextInt();
		float pi = 3.14f;
		double area = pi * radius * radius;
		System.out.println(area);
		sc.close();
	}
}
