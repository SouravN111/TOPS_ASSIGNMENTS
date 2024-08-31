package com.assignment;

import java.util.ArrayList;
import java.util.Scanner;

public class collection_7 {
	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		names.add("Sourav");
		names.add("Pankaj");
		names.add("Vaibhav");
		names.add("Varshita");
		names.add("Ajey");
		names.add("Ravi");
		System.out.println(names);
		System.out.print("Enter an element for searching : ");
		String search = sc.nextLine();
		
		System.out.println(search + " is present at position " + names.indexOf(search));
		
	}
}
