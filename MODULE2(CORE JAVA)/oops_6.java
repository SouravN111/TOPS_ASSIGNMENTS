package com.assignment;

abstract class Parent1{
	void message() {
		System.out.println("Inside Parent class method.");
	}
}

class Child1 extends Parent1{
	void message() {
		System.out.println("Inside Child1 class method.");
	}
}

class Child2 extends Parent1{
	void message() {
		System.out.println("Inside Child2 class method.");
	}
}

public class oops_6 {
	public static void main(String[] args) {
		Child1 c1 = new Child1();
		Child2 c2 = new Child2();
		
		c1.message();
		c2.message();
	}
}
