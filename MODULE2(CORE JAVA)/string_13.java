package com.assignment;

class PrintIntChar{
	void printIntchar(int n, char c) {
		System.out.println("int : " + n + ", char : " + c);
	}
	
	void printIntchar(char c, int n) {
		System.out.println("int : " + n + ", char : " + c);
	}
}

public class string_13 {
	public static void main(String[] args) {
		PrintIntChar pc1 = new PrintIntChar();
		pc1.printIntchar(9, 's');
		pc1.printIntchar('V', 57);
	}
}
