package com.assignment;

import java.util.Scanner;

class Triangle{
	double side1, side2, side3;
	Scanner sc = new Scanner(System.in);
	
	Triangle(){
		System.out.println("Enter first side of the triangle : ");
		this.side1 = sc.nextDouble();
		System.out.println("Enter second side of the triangle : ");
		this.side2 = sc.nextDouble();
		System.out.println("Enter third side of the triangle : ");
		this.side3 = sc.nextDouble();
	}
	
	void printPerimeter() {
		double perimeter = side1 + side2 + side3;
		System.out.println("The perimeter of the triangle is " + perimeter);
	}
}

public class oops_5 {
	public static void main(String[] args) {
		Triangle t1 = new Triangle();
		t1.printPerimeter();
	}
}
