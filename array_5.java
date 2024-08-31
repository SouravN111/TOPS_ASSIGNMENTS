package com.assignment;

import java.util.Scanner;

public class array_5 {
	public static void main(String[] args) {
		String str;
		int count = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the string : ");
		str = sc.nextLine();
		
		char[] strChar = str.toCharArray();
		
		for(char i : strChar) {
			count++;
		}
		
		System.out.println("Length of string : " + count);
	}
}
