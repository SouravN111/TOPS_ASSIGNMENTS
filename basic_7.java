package com.assignment;

import java.util.Scanner;

public class basic_7 {
	public static void main(String[] args) {
		int n, count = 1;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter no. of lines : ");
		n = sc.nextInt();
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(count++ + " ");
			}
			System.out.println();
		}
	}
}
