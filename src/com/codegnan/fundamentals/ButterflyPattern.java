package com.codegnan.fundamentals;

import java.util.Scanner;

public class ButterflyPattern {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int rows = scanner.nextInt();
		//upper part
		for(int i=1;i<=rows;i++) {
			//inner for loop 1 prints stars for left wing
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			//inner for loop 2 prints spaces
			int spaces = 2*(rows-i);
			for(int j=1;j<=spaces;j++) {
				System.out.print(" ");
			}
			//inner for loop 3 prints stars for right wing
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		//lower part
		for(int i=rows;i>=1;i--) {  //i=rows-1
			//inner for loop 4
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			int spaces = 2*(rows-i);
			for(int j=1;j<=spaces;j++) {
				System.out.print(" ");
			}
			
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		scanner.close();
	}

}
