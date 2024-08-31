package com.assignment;

abstract class Shape{
	abstract void rectangleArea(double length, double breadth);
	abstract void squareArea(double side);
	abstract void circleArea(double radius);
}

class Area extends Shape{

	@Override
	void rectangleArea(double length, double breadth) {
		System.out.println("The area of rectangle is " + length*breadth);
	}

	@Override
	void squareArea(double side) {
		System.out.println("The area of square is " + side*side);
	}

	@Override
	void circleArea(double radius) {
		System.out.println("The area of circlr is " + 3.17*radius*radius);
	}
	
}

public class oops_10 {
	public static void main(String[] args) {
		Area a1 = new Area();
		a1.rectangleArea(10, 20);
		a1.squareArea(15);
		a1.circleArea(100);
	}
}
