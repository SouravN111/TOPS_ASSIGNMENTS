package com.assignment;

import java.util.Scanner;

public class basic_5 {
	public static void main(String[] args) {
		int n, sum=0;
		float avg;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter n : ");
		n = scanner.nextInt();
		for(int i=1;i<=n;i++) {
			sum = sum + i;
		}
		avg = (float)sum/n;
		System.out.println("Sum : " + sum);
		System.out.println("Average : " + avg);
	}
}
