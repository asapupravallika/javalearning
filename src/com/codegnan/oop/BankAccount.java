package com.codegnan.oop;

public class BankAccount {
	String accountHolderName;
	long accountNumber;
	double balance;

	public void createAccount(String name, long accNumber, double initialBalance) {
		accountHolderName = name;
		accountNumber = accNumber;
		balance = initialBalance;
	}

	public void deposit(double amount) {
		balance += amount;
		System.out.println(balance + " deposit successful");
	}

	public void withdraw(double amount) {
		if (amount <= balance) {
			balance -= amount;
			System.out.println(balance + " withdraw successful");
		} else {
			System.out.println("Insufficient Funds");
		}
	}
	
	public void displayInfo() {
		System.out.println("Account Holder Name : " + accountHolderName);
		System.out.println("Account Number : " + accountNumber);
		System.out.println("Balance : " + balance);
	}
}

