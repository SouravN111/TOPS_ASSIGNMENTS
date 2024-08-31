package com.assignment;

class ShapeArea {
	void printArea(int side) {
		System.out.println("The area of square is " + side*side);
	}
	
	void printArea(int length, int breadth) {
		System.out.println("The area of rectangle is " + length*breadth);
	}
}

public class oops_1 {
	public static void main(String[] args) {
		ShapeArea s1 = new ShapeArea();
		s1.printArea(10);
		s1.printArea(5, 12);
	}
}
