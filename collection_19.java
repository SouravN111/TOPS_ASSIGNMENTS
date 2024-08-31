package com.assignment;

import java.util.ArrayList;
import java.util.Scanner;

public class collection_19 {
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
		
		System.out.println("Before swapping : " + numbers);
		System.out.print("Enter the first index for swapping : ");
		int ind1 = sc.nextInt();
		System.out.print("Enter the second index for swapping : ");
		int ind2 = sc.nextInt();
		
		int temp = numbers.get(ind1);
		numbers.set(ind1, numbers.get(ind2));
		numbers.set(ind2, temp);
		System.out.println("After swapping : " + numbers);
	}
}
