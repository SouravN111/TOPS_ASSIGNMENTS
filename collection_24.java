package com.assignment;

import java.util.ArrayList;

public class collection_24 {
	public static void main(String[] args) {
		ArrayList<Integer> age = new ArrayList<Integer>();
		age.add(70);
		age.add(19);
		age.add(89);
		age.add(21);
		System.out.println(age);
		System.out.println("The list is now storing " + age.size() + " elements.");
		age.ensureCapacity(100);
		System.out.println("The list can now store 100 elements.");
	}
}
