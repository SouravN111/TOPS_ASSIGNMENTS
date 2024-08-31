package com.assignment;

import java.util.Scanner;

public class string_3 {
	public static void main(String[] args) {
		int n, ans;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the integer : ");
		n = sc.nextInt();
		
		ans = n + (n * 10 + n) + (n * 100 + n * 10 + n);
		
		System.out.println("The result is " + ans);
	}
}
