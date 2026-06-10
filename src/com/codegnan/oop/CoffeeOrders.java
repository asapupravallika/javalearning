package com.codegnan.oop;

public class CoffeeOrders {
	public static int calculateDiscount(int totalOrders) {
		if(totalOrders<0) {
			return 0;
		}
		int discount = (int)(totalOrders * 0.10);
		if(discount > 100) {
			discount = 100;
		}
		return discount;
	}
	
	public int calculateOrderDiscount(int orderAmount) {
		if(orderAmount<0) {
			return 0;
		}
		int discount;
		if(orderAmount<50) {
			discount = (int)(orderAmount * 0.05);
		} else {
			discount = (int)(orderAmount * 0.15);
		}
		if(discount>100) {
			discount = 100;
		}
		return discount;
	}
	
}
