package com.assignment;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class collection_8 {
	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(4);
		numbers.add(1);
		numbers.add(3);
		numbers.add(6);
		numbers.add(5);
		numbers.add(7);
		numbers.add(2);
		
		
		System.out.println("Before sorting : " + numbers);
		for(int i=0;i<numbers.size();i++) {
			for(int j=i+1;j<numbers.size();j++) {
				if(numbers.get(i)>numbers.get(j)) {
					int temp = numbers.get(i);
					numbers.set(i, numbers.get(j));
					numbers.set(j, temp);
				}
			}
		}
		
//		Collections.sort(numbers);
		
		System.out.println("After sorting : " + numbers);
	}
}
