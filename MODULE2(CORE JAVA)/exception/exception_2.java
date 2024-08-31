package com.assignment;

import java.util.Scanner;

public class exception_2 {
	public static void main(String[] args) {
		int num1, num2, ans;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number 1 : ");
		num1 = sc.nextInt();
		System.out.println("Enter number 2 : ");
		num2 = sc.nextInt();
		
		try {
			ans = num1/num2;
			System.out.println("The answer is " + ans);
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
