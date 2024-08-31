package com.assignment;

public class oops_9 {
	
	static void factorial(int n) {
		long fact = 1;
		for(int i=1;i<=n;i++) {
			fact = fact*i;
		}
		System.out.println("The factorial of " + n + " is " + fact);
	}
	
	public static void main(String[] args) {
		
		factorial(10);
	}
}
