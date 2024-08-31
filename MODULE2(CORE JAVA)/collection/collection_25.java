package com.assignment;

import java.util.ArrayList;
import java.util.Scanner;

public class collection_25 {
	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list1.add(5);
		list1.add(6);
		list1.add(7);
		
		System.out.println(list1);
		System.out.println("Enter the element you want to update at second position : ");
		int val = sc.nextInt();
		list1.set(1, val);
		System.out.println(list1);
	}
}
