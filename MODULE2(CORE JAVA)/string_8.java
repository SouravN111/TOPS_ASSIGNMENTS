package com.assignment;

import java.util.Scanner;

public class string_8 {
	public static void main(String[] args) {
		String str, strend;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the string : ");
		str = sc.nextLine();
		System.out.print("Enter the end string : ");
		strend = sc.nextLine();
		
		boolean ans = str.endsWith(strend);

		System.out.println(ans);
	}
}
