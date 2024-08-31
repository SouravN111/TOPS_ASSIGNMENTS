package com.assignment;

public class exception_7_1_InsufficientFund extends Exception {
	double amount;
	
	public exception_7_1_InsufficientFund(double amount) {
		this.amount = amount;
	}
	
	double getAmount() {
		return this.amount;
	}
}