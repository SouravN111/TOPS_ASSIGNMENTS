package com.assignment;

import java.util.HashSet;

public class collection_27 {
	public static void main(String[] args) {
        HashSet<String> set1 = new HashSet<>();
        set1.add("Apple");
        set1.add("Banana");
        set1.add("Cherry");
        set1.add("Date");

        HashSet<String> set2 = new HashSet<>();
        set2.add("Banana");
        set2.add("Cherry");
        set2.add("Elderberry");
        set2.add("Fig");

        System.out.println("Original set1: " + set1);
        System.out.println("Original set2: " + set2);

        set1.retainAll(set2);

        System.out.println("Common elements: " + set1);
    }
}
