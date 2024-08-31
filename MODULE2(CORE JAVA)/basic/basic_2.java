package com.assignment;

import java.util.Scanner;

public class basic_2 {
	public static void main(String[] args) {
		char ch;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a character : ");
		ch = sc.next().charAt(0);
		
		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U') {
			System.out.println(ch + " is a vowel.");
		}
		else {
			System.out.println(ch + " is a consonant.");
		}
	}
}
