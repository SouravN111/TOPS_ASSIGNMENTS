package com.assignment;

import java.util.Scanner;

class Member{
	String name, phone, address;
	int age, salary; 
	Scanner sc = new Scanner(System.in);
	
	Member(){
		System.out.print("Enter name : ");
		name = sc.nextLine();
		System.out.print("Enter age : ");
		age = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter phone no. : ");
		phone = sc.nextLine();
		System.out.print("Enter address : ");
		address = sc.nextLine();
		System.out.print("Enter salary : ");
		salary = sc.nextInt();
	}
	
	void printDetails() {
		System.out.println("\n*****MEMBER DETAILS*****\n");
		System.out.println("NAME : " + name);
		System.out.println("AGE : " + age + " years");
		System.out.println("PHONE NO. : " + phone);
		System.out.println("ADDRESS : " + address);
		System.out.println("SALARY : " + salary);
	}
}

public class oops_3 {
	public static void main(String[] args) {
		Member m1 = new Member();
		m1.printDetails();
	}
}
