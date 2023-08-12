package com.bean;
import java.util.HashMap;
import java.util.Map;

public class AddMapToAnother {

	public static void main(String[] args) {
	
		        Map<String, Integer> map1 = new HashMap<>();
		        map1.put("one", 1);
		        map1.put("two", 2);

		        Map<String, Integer> map2 = new HashMap<>();
		        map2.put("three", 3);
		        map2.put("four", 4);

		        // Add all entries from map2 to map1
		        map1.putAll(map2);

		        System.out.println(map1); // Output: {one=1, two=2, three=3, four=4}
		    }
		}

	
