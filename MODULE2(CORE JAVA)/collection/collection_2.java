package com.assignment;

import java.util.ArrayList;
import java.util.Iterator;

public class collection_2 {
	public static void main(String[] args) {
		ArrayList<String> colors = new ArrayList<String>();
		colors.add("Red");
		colors.add("Green");
		colors.add("Blue");
		colors.add("White");
		colors.add("Purple");
		colors.add("Black");
		
		Iterator itr = colors.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
