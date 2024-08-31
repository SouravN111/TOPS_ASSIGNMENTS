package com.assignment;

import java.util.Scanner;

public class string_6 {
	public static void main(String[] args) {
		String str1, str2, res;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter first string : ");
		str1 = sc.nextLine();
		System.out.print("Enter second string : ");
		str2 = sc.nextLine();
		
		res = str1 + str2;
		
		System.out.println("Concatenated string : " + res);
	}
}
