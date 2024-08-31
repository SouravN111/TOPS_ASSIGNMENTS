package com.assignment;

import java.util.Scanner;

public class array_6 {
	public static void main(String[] args) {
		String str, rev = "";
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the string : ");
		str = sc.nextLine();
		
		char[] strChar = str.toCharArray();
		
		for(int i=strChar.length-1;i>=0;i--) {
			rev = rev + strChar[i];
		}
		
		System.out.println("Original string : " + str);
		System.out.println("Reversed string : " + rev);
		
		if(str.toLowerCase().equals(rev.toLowerCase())) {
			System.out.println("Both the strings are palindrome.");
		}
		else {
			System.out.println("The strings are not palindrome");
		}
	}
}
