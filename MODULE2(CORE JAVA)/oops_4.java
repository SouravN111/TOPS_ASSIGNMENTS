package com.assignment;

class Rectangle{
	double length, breadth;
	
	Rectangle(double length, double breadth){
		this.length = length;
		this.breadth = breadth;
	}
	
	void printArea() {
		double area = length*breadth;
		System.out.println("The area of the rectangle is " + area);
	}
	
	void printPerimeter() {
		double perimeter = 2 * (length+breadth);
		System.out.println("The perimeter of the rectangle is " + perimeter);
	}
}

class Square extends Rectangle{
	double side;
	Square(double side){
		super(side, side);
	}
}

public class oops_4 {
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(10, 20);
		r1.printArea();
		r1.printPerimeter();
		
		Square s1 = new Square(10);
		s1.printArea();
		s1.printPerimeter();
	}
}
