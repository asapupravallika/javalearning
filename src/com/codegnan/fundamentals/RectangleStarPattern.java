package com.codegnan.fundamentals;

import java.util.Scanner;

public class RectangleStarPattern {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of rows: ");
		int rows = scanner.nextInt();
		System.out.println("Enter number of columns: ");
		int cols = scanner.nextInt();
		// outer for loop is for rows
		for (int i = 1; i <= rows; i++) {
			//inner for loop is for columns
			for (int j = 1; j <= cols; j++) {
				//System.out.print((rows-i) + " ");
				//System.out.print((cols-j) + " ");
				//System.out.print("*" + " ");
				//System.out.print(i + " ");
				//System.out.print(j + " ");
				//System.out.print((char)(96+j) + " ");
				//System.out.print((char)(96+i) + " ");
				System.out.print((char)(101-i) + " ");
			}
			System.out.println();
		}
		scanner.close();
	}
}
