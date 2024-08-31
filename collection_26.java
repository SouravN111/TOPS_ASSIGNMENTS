package com.assignment;

import java.util.ArrayList;

public class collection_26 {
	public static void main(String[] args) {
		ArrayList<String> brands = new ArrayList<String>();
		brands.add("Zara");
		brands.add("HnM");
		brands.add("WestSide");
		brands.add("Ralph Lauren");
		brands.add("US Polo");
		brands.add("Nike");
		
		for(int i=0;i<brands.size();i++) {
			System.out.println("brands[" + i + "] = " + brands.get(i));
		}
	}
}
