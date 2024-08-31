package com.assignment;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class collection_15 {
	public static void main(String[] args) {
		HashMap hm = new HashMap();
		Scanner sc = new Scanner(System.in);
		hm.put(101, "Sourav");
		hm.put(102, "Pankaj");
		hm.put(103, "Vaibhav");
		hm.put(104, "Nilang");
		hm.put(105, "Kashish");
		
		System.out.println("The size of hashmap is " + hm.size());
	}
}
