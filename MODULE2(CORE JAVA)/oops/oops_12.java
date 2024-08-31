package com.assignment;

class Shape1{
	void method() {
		System.out.println("This is shape.");
	}
}

class Rectangle1 extends Shape1{
	void method() {
		super.method();
		System.out.println("This is rectangle.");
	}
}

class Circle extends Shape1{
	void method() {
		System.out.println("This is circle.");
	}
}

class Square1 extends Rectangle1{
	void method() {
		super.method();
		System.out.println("Square is a rectangle.");
	}
}

public class oops_12 {
	public static void main(String[] args) {
		Square1 s1 = new Square1();
		s1.method();
	}
}
