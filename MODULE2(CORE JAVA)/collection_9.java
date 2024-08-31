package com.assignment;

import java.util.ArrayList;
import java.util.Scanner;

public class collection_9 {
	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		ArrayList<String> names2 = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		names.add("Sourav");
		names.add("Pankaj");
		names.add("Vaibhav");
		names.add("Varshita");
		names.add("Ajey");
		names.add("Ravi");
		System.out.println("names : " + names);
		names2.addAll(names);
		System.out.println("names2 : " + names2);
	}
}
