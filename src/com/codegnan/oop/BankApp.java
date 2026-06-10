package com.codegnan.oop;

public class BankApp {

	public static void main(String[] args) {
		BankAccount acc1 = new BankAccount();
		acc1.createAccount("pravi", 98765412, 50000);
		BankAccount acc2 = new BankAccount();
		acc2.createAccount("lucky",12345764, 40000);
		acc1.deposit(10000);
		acc2.withdraw(2700);
		acc1.displayInfo();
		acc2.withdraw(20000);
		acc2.displayInfo();
	}

}
