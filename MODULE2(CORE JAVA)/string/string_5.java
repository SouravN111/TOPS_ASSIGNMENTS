package com.assignment;

import java.util.Scanner;

public class string_5 {
	public static void main(String[] args) {
		String input;
		int pos;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Entr the string : ");
		input = sc.nextLine();
		
		System.out.print("Enter the position you want to know : ");
		pos = sc.nextInt();
		
		System.out.println("The character at position " + pos + " is " + input.charAt(pos-1));
	}
}
