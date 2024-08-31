package com.assignment;

import java.util.Collection;
import java.util.HashMap;

public class collection_28 {
	public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Apple", 1);
        map.put("Banana", 2);
        map.put("Cherry", 3);
        map.put("Date", 4);

        Collection<Integer> values = map.values();

        System.out.println("Collection view of the values: " + values);
    }
}
