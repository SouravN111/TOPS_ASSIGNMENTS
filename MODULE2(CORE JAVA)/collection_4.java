package com.assignment;

import java.util.ArrayList;
import java.util.Scanner;

public class collection_4 {
	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		names.add("Sourav");
		names.add("Pankaj");
		names.add("Vaibhav");
		names.add("Varshita");
		names.add("Ajey");
		names.add("Ravi");
		
		System.out.print("Enter a index between 0-" + (names.size()-1) + " : ");
		int index = sc.nextInt();
		
		System.out.println("Element at index " + index + " is " + names.get(index));
	}
}
