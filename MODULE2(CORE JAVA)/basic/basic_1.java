package com.assignment;

import java.util.Scanner;

public class basic_1 {
	public static void main(String[] args) {
		int a, b, c;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a : ");
		a = sc.nextInt();
		System.out.print("Enter b : ");
		b = sc.nextInt();
		System.out.print("Enter c : ");
		c = sc.nextInt();
		
		if(a>b) {
			if(a>c) {
				System.out.println("a is maximum : " + a);
			}
			else{
				System.out.println("c is maximum : " + b);
			}
		}
		else {
			if(b>c) {
				System.out.println("b is maximum : " + b);
			}
			else {
				System.out.println("c is maximum : " + c);
			}
		}
	}
}
