package com.assignment;

import java.util.Scanner;


public class exception_7_3_Bank {
	public static void main(String[] args) {
		double amount;
		Scanner sc = new Scanner(System.in);
		exception_7_2_CheckingAccount cust1 = new exception_7_2_CheckingAccount(1001, 7000, "Sourav");
		
		while(true) {
			System.out.println("***************************************************************");
			System.out.println("1. Deposit");
			System.out.println("2. Withdraw");
			System.out.println("3. Chck balance");
			System.out.println("4. Exit");
			System.out.println("***************************************************************");
			System.out.print("Enter your choice : ");
			int choice = sc.nextInt();
			System.out.println("***************************************************************");
			
			if(choice==1) {
				System.out.print("Enter deposit amount : ");
				amount = sc.nextDouble();
				cust1.deposit(amount);
				System.out.println("***************************************************************");
			}
			else if(choice==2) {
				try {
					System.out.print("Enter withdrawal amount : ");
					amount = sc.nextDouble();
					cust1.withdraw(amount);
					System.out.println("***************************************************************");
				}catch(exception_7_1_InsufficientFund e) {
					System.out.println("Sorry, you need another " + e.getAmount() + " Rs to make a withdrawal.");
					System.out.println("***************************************************************");
				}
			}
			else if(choice==3) {
				cust1.checkBalance();
				System.out.println("***************************************************************");
			}
			else if(choice==4) {
				System.out.println("Thank you for using our services.");
				System.out.println("***************************************************************");
				break;
			}
			else {
				System.out.println("Please enter valid choice.");
			}
		}
	}
}
