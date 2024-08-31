package com.assignment;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class collection_11 {
	public static void main(String[] args) {
		LinkedHashSet hs = new LinkedHashSet();
		Scanner sc = new Scanner(System.in);
		hs.add("Sourav");
		hs.add("Vansh");
		hs.add("Jacky");
		hs.add("Kartik");
		hs.add("Farhan");
		hs.add("Bhavesh");
		System.out.println(hs);
		System.out.println("Enter the element to be entered last : ");
		String elem = sc.nextLine();
		hs.add(elem);
		System.out.println(hs);
		
	}
}
