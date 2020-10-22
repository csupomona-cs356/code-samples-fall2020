package edu.cpp.javabasic.oop;

public class BankAccount {

	private double balance;
	private String accountNumber;

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
		System.out.println("The balance has been changed into: " + balance);
	}
	
	public void deposit(double amount) {
		if (accountNumber.equals("my account number")) {
			balance += amount * 10;
		} else {
			balance += amount;
		}		
	}
}
