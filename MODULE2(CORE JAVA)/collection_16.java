package com.assignment;

import java.util.ArrayList;
import java.util.Collections;

public class collection_16 {
	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(4);
		numbers.add(1);
		numbers.add(3);
		numbers.add(6);
		numbers.add(5);
		numbers.add(7);
		numbers.add(2);
		
		System.out.println("List before reversing : " + numbers);
		Collections.reverse(numbers);
		System.out.println("List after reversing : " + numbers);
	}
}
