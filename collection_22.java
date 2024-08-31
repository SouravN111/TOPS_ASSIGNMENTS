package com.assignment;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class collection_22 {
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
		ArrayList list = new ArrayList();
		
		Iterator itr = hs.iterator();
		int i=0;
		while(itr.hasNext()) {
			list.add(itr.next());
			i++;
		}
		System.out.println("list : " + list);

	}
}
