package com.assignment;

import java.util.HashSet;
import java.util.Iterator;

public class collection_21 {
	public static void main(String[] args) {
		HashSet hs = new HashSet();
		hs.add(156);
		hs.add(54);
		hs.add(235);
		hs.add(123);
		hs.add(102);
		hs.add(79);
		hs.add(99);
		
		System.out.println("Set : " + hs);
		int[] arr = new int[hs.size()];
		
		Iterator itr = hs.iterator();
		int i=0;
		while(itr.hasNext()) {
			arr[i] = (int)itr.next();
			i++;
		}
		System.out.println("Array : ");
		for(int j=0;j<arr.length;j++) {
			System.out.print(arr[j] + "  ");
		}

	}
}
