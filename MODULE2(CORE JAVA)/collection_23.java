package com.assignment;

import java.util.HashMap;

public class collection_23 {
	public static void main(String[] args) {
        HashMap<String, Integer> mapWithEntries = new HashMap<>();
        mapWithEntries.put("Apple", 1);
        mapWithEntries.put("Banana", 2);
        mapWithEntries.put("Cherry", 3);

        HashMap<String, Integer> emptyMap = new HashMap<>();

        System.out.println("Map with entries is empty: " + mapWithEntries.isEmpty());
        System.out.println("Empty map is empty: " + emptyMap.isEmpty());
    }
}
