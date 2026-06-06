package com.codegnan.fundamentals;

import java.util.Scanner;

public class ArrayExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		/*String[] fruits = {"apple", "banana", "kiwi", "mango", "pomegranate"}; 
		for(int i=0;i<fruits.length;i++) {
			System.out.println(fruits[i]);
		}
		
		//enhanced for loop
		System.out.println("Using enhanced for loop");
		for(String fru : fruits) {
			System.out.println(fru);
		} */
		
		/*System.out.println("Enter the Size of an Array:");
		int size = scanner.nextInt();
		String[] places = new String[size]; //array creation
		System.out.println("Enter elements of Array:");
		for(int i=0;i<size;i++) {
			System.out.println("Element at index " + i + " : " );
			places[i] = scanner.next();
		}
		
		System.out.println("The elements in the array are:");
		for(String place : places) {
			System.out.print(place + " ");
		}
		
		System.out.println("Reversing an array");
		for(int i=places.length-1;i>=0;i--) {
			System.out.println(places[i]);
		}*/
		
		
		int size = scanner.nextInt();
		String[] strings = new String[size];
		for(int i=0;i<size;i++) {
			strings[i] = scanner.next();
		}
		
		for(String str : strings) {
			System.out.println(str+" is"+(isPalindrome(str)?" a palindrome" : " not a palindrome"));
		}
		
		scanner.close();
	}
	
	public static boolean isPalindrome(String str) {
		int left=0, right=str.length()-1;
		while(left < right) {
			if(str.charAt(left++) != str.charAt(right--)) {
				return false;
			}
		}
		return true;
	}

}
