package com.assignment;

import java.util.Scanner;

public class exception_6 {

	static void validateAge(int age) {
		if(age>18) {
			System.out.println("You can vote.");
		}
		else {
			throw new ArithmeticException();
		}
	}
	
	public static void main(String[] args) {
		int age;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your age : ");
		age = sc.nextInt();
		
		try {
			validateAge(age);
		}catch(ArithmeticException e) {
			System.out.println("You cannot vote.");
		}
	}
}
