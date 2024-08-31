package com.assignment;

class PrintNumbers{
	void printNumber(int n) {
		System.out.println("int : " + n);
	}
	
	void printNumber(float n) {
		System.out.println("float : " + n);
	}
	
	void printNumber(long n) {
		System.out.println("long : " + n);
	}
	
	void printNumber(double n) {
		System.out.println("double : " + n);
	}
}

public class string_12 {
	public static void main(String[] args) {
		PrintNumbers num = new PrintNumbers();
		num.printNumber(5);
		num.printNumber((float)5.9);
		num.printNumber((long)50569);
		num.printNumber(29047.89);
	}
}
