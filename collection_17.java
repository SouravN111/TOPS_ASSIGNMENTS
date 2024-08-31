package com.assignment;

import java.util.ArrayList;
import java.util.Scanner;

public class collection_17 {
	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		numbers.add(4);
		numbers.add(1);
		numbers.add(3);
		numbers.add(6);
		numbers.add(5);
		numbers.add(7);
		numbers.add(2);
		
		System.out.println(numbers);
		
		System.out.println("Enter from index : ");
		int from = sc.nextInt();
		System.out.println("Enter to index : ");
		int to = sc.nextInt();
		
		System.out.println(numbers.subList(from, to));
	}
}
