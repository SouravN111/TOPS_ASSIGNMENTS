package com.assignment;

class parent{
	void methParent() {
		System.out.println("This is a method of parent class.");
	}
}

class child extends parent{
	void methChild() {
		System.out.println("This is a method of child class.");
	}
}

public class oops_2 {
	public static void main(String[] args) {
		parent p1 = new parent();
		child c1 = new child();
		
		p1.methParent();
		c1.methChild();
		c1.methParent();
	}
}
