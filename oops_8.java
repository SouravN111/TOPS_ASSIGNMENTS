package com.assignment;

abstract class Marks{
	abstract void getPercentage();
}

class StudentA extends Marks{
	float marks1, marks2, marks3;
	StudentA(float m1, float m2, float m3){
		this.marks1 = m1;
		this.marks2 = m2;
		this.marks3 = m3;
	}
	void getPercentage() {
		float percentage = (marks1+marks2+marks3) / 3;
		System.out.println("Percentage of studentA class : " + percentage);
	}
}

class StudentB extends Marks{
	float marks1, marks2, marks3, marks4;
	StudentB(float m1, float m2, float m3, float m4){
		this.marks1 = m1;
		this.marks2 = m2;
		this.marks3 = m3;
		this.marks4 = m4;
	}
	void getPercentage() {
		float percentage = (marks1+marks2+marks3+marks4) / 4;
		System.out.println("Percentage of studentB class : " + percentage);
	}
}

public class oops_8 {
	public static void main(String[] args) {
		StudentA a1 = new StudentA(90, 89, 74);
		StudentB b1 = new StudentB(99, 100, 45, 69);
		
		a1.getPercentage();
		b1.getPercentage();
	}
}
