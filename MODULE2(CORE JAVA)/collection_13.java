package com.assignment;

import java.util.HashSet;
import java.util.Scanner;

public class collection_13 {
	public static void main(String[] args) {
		HashSet hs = new HashSet();
		Scanner sc = new Scanner(System.in);
		hs.add("Sourav");
		hs.add("Vansh");
		hs.add("Jacky");
		hs.add("Kartik");
		hs.add("Farhan");
		hs.add("Bhavesh");
		
		System.out.println(hs);
		System.out.println("The size of the set is " + hs.size());
	}
}
