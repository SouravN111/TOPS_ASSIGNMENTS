package com.assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class collection_10 {
	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		names.add("Sourav");
		names.add("Pankaj");
		names.add("Vaibhav");
		names.add("Varshita");
		names.add("Ajey");
		names.add("Ravi");
		System.out.println("List before shuffling : " + names);
		Collections.shuffle(names);
		System.out.println("List after shuffling : " + names);
	}
}
