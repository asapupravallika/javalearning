package com.codegnan.fundamentals;

import java.util.Scanner;

public class DiamondPattern {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		int rows = scanner.nextInt();
		//part 1 upper part of diamond
		for(int i=1;i<=rows;i++) {
			//inner for loop 1: print leading spaces
			for(int j=1;j<=rows-i;j++) {
				System.out.print("  ");
			}
			//inner for loop 2: print stars
			for(int k=1;k<=2*i-1;k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		//part 2 lower part of diamond
		for(int i=rows-1;i>=1;i--) {
			for(int j=1;j<=rows-i;j++) {
				System.out.print("  ");
			}
			for(int k=1;k<=2*i-1;k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		scanner.close();
	}

}
