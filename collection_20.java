package com.assignment;

import java.util.ArrayList;

public class collection_20 {
	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		list2.add(5);
		list2.add(6);
		list2.add(7);
		System.out.println("list1 : " + list1);
		System.out.println("list2 : " + list2);
		list1.addAll(list2);
		System.out.println("Joined list : " + list1);
	}
}
