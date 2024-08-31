package com.assignment;

import java.util.Scanner;

public class oops_11 {
public static void main(String[] args) {
	int marks;
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter your marks : ");
	marks = sc.nextInt();
	
	if(marks>90) {
		System.out.println("Congratulations, You got A Grade.");
	}
	else if(marks>80) {
		System.out.println("Bravo, You got B+ Grade.");
	}
	else if(marks>70) {
		System.out.println("Hurray, You got B Grade.");
	}
	else if(marks>60) {
		System.out.println("You got C+ Grade.");
	}
	else if(marks>50) {
		System.out.println("You got C Grade.");
	}
	else if(marks>40) {
		System.out.println("You got D Grade.");
	}
	else {
		System.out.println("You are fail.");
	}
}
}
