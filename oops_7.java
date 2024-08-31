package com.assignment;

abstract class Bank{
	abstract void getBalance();
}

class BankA extends Bank{
	double balance = 100;
	void getBalance() {
		System.out.println("BankA Balance : $" + this.balance);
	}
}

class BankB extends Bank{
	double balance = 150;
	void getBalance() {
		System.out.println("BankB Balance : $" + this.balance);
	}
}

class BankC extends Bank{
	double balance = 200;
	void getBalance() {
		System.out.println("BankC Balance : $" + this.balance);
	}
}

public class oops_7 {
	public static void main(String[] args) {
		BankA b1 = new BankA();
		BankB b2 = new BankB();
		BankC b3 = new BankC();
		
		b1.getBalance();
		b2.getBalance();
		b3.getBalance();
	}
}
