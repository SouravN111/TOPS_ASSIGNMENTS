package com.assignment;

import java.util.Scanner;

public class exception_4 {
	public static void main(String[] args) {
		int num1, num2, ans;
		int arr[] = new int[5];
		arr[0] = 18;
		arr[1] = 26;
		arr[2] = 97;
		arr[3] = 57;
		arr[4] = 56;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number 1 : ");
		num1 = sc.nextInt();
		System.out.println("Enter number 2 : ");
		num2 = sc.nextInt();
		
		
		try {
			ans = num1/num2;
			System.out.println("The answer is " + ans);
			
			System.out.println("Enter the index you want to access : ");
			int index = sc.nextInt();
			System.out.println("Element is " + arr[index]);
		}catch(ArithmeticException e) {
			System.out.println(e);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
	}
}
