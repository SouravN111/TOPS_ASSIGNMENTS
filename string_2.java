package com.assignment;

import java.util.Scanner;

public class string_2 {
	public static void main(String[] args) {
		char c;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the character : ");
		c = sc.next().charAt(0);
		
		System.out.println("The ASCII value of character " + c + " is " + (int)c);
	}
}
