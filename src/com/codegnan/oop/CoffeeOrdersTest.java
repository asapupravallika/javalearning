package com.codegnan.oop;

import java.util.Scanner;

public class CoffeeOrdersTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int totalOrders = sc.nextInt();
		int orderAmount = sc.nextInt();
		int staticDiscount = CoffeeOrders.calculateDiscount(totalOrders);
		CoffeeOrders coffee = new CoffeeOrders();
		int instanceDiscount = coffee.calculateOrderDiscount(orderAmount);
		System.out.println(staticDiscount + " " + instanceDiscount);
		sc.close();
	}
}
