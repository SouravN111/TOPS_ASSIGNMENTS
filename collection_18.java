package com.assignment;

import java.util.ArrayList;

public class collection_18 {
	public static void main(String[] args) {
		ArrayList<String> fruits = new ArrayList<String>();
		fruits.add("Grapes");
		fruits.add("Watermelon");
		fruits.add("Dragonfruit");
		fruits.add("Guava");
		fruits.add("Kiwi");
		
		ArrayList<String> fruits2 = new ArrayList<String>();
		fruits2.add("Grapes");
		fruits2.add("Watermelon");
		fruits2.add("Dragonfruit");
		fruits2.add("Guava");
		fruits2.add("Kiwi");
//		fruits2.add("Tamarind");
		
		System.out.println("fruits : " + fruits);
		System.out.println("fruits2 : " + fruits2);
		boolean isEqual = fruits.equals(fruits2);
		System.out.println("Result of comparison : " + isEqual);
		
		
		
	}
}
