package com.assignment;

import java.util.Scanner;

public class string_7 {
	public static void main(String[] args) {
		String str1, str2;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter first string : ");
		str1 = sc.nextLine();
		System.out.print("Enter second string : ");
		str2 = sc.nextLine();
		
		int res = str1.compareTo(str2);
		
		if(res==0) {
			System.out.println("True. The strings are equal.");
		}
		else {
			System.out.println("False. The strings are not equal.");
		}
	}
}
