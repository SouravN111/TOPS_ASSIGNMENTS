package com.assignment;

import java.util.Scanner;

public class basic_6 {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter no. of lines : ");
		n = sc.nextInt();
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(j+1 + " ");
			}
			System.out.println();
		}
	}
}
