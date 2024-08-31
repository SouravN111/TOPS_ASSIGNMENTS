package com.assignment;


public class exception_7_2_CheckingAccount {
	int accno;
	double balance;
	String cname;
	
	public exception_7_2_CheckingAccount(int accno, double balance, String cname) {
		this.accno = accno;
		this.balance = balance;
		this.cname = cname;
		System.out.println("Hello " + cname + ", Your account number " + accno + " is opened with balance " + balance + " Rs");
	}
	
	void deposit(double amount) {
		this.balance = this.balance + amount;
	}
	
	void withdraw(double amount) throws exception_7_1_InsufficientFund{
		if(amount<=this.balance) {
			this.balance = this.balance - amount;
		}
		else {
			throw new exception_7_1_InsufficientFund(amount-this.balance);
		}
	}
	
	void checkBalance() {
		System.out.println("Current balance : " + this.balance);
	}
}
