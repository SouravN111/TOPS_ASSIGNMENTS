package com.assignment;

import java.util.ArrayList;
import java.util.Scanner;

public class collection_5 {
	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		names.add("Sourav");
		names.add("Pankaj");
		names.add("Vaibhav");
		names.add("Varshita");
		names.add("Ajey");
		names.add("Ravi");
		
		System.out.println("Names before updation : " + names);
		System.out.print("Enter a index between 0-" + (names.size()-1) + " : ");
		int index = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter name for updation : ");
		String name = sc.nextLine();
		names.set(index, name);
		System.out.println("Names after updation : " + names);
		
	}
}
