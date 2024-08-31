package com.assignment;

import java.util.ArrayList;

public class collection_3 {
	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		numbers.add(6);
		numbers.add(7);
		
		System.out.println("Before adding element at first : " + numbers);
		numbers.addFirst(100);
		System.out.println("After adding element at first : " + numbers);
	}
}
