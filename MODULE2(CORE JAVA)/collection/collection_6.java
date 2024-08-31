package com.assignment;

import java.util.ArrayList;
import java.util.Scanner;

public class collection_6 {
	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		names.add("Sourav");
		names.add("Pankaj");
		names.add("Vaibhav");
		names.add("Varshita");
		names.add("Ajey");
		names.add("Ravi");
		
		System.out.println("Names before removing third element : " + names);
		names.remove(2);
		System.out.println("Names after removing the third element : " + names);
		
	}
}
