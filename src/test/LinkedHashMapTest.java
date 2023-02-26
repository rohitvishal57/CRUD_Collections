package com.monocept.test;

import java.util.*;

public class LinkedHashMapTest {

	public static void main(String[] args) {
		// creating an empty linked hash map
		LinkedHashMap<Integer, String> mp = new LinkedHashMap<Integer, String>();

		// Add mappings to Map using put() method
		mp.put(3, "Robert");
		mp.put(2, "Kills");
		mp.put(1, "Donald");

		// Printing mappings to the console
		System.out.println("Mappings of LinkedHashMap : " + mp);

		// changing or updating value
		System.out.println("Initial map : " + mp);

		// Updating the value with key 2
		mp.put(2, "Saves");

		// Printing the updated Map
		System.out.println("Updated Map : " + mp);

		// replacing elements using replace
		mp.replace(1, "John");
		System.out.println("After replacement map : " + mp);

		// removing elements
		mp.remove(2);
		System.out.println("After removing key 2 updated map : " + mp);

		// iterating through linked hash map
		// For-each loop for traversal over Map
		System.out.println("Displaying elements in map : ");
		for (Map.Entry<Integer, String> mapElement : mp.entrySet()) {

			Integer key = mapElement.getKey();

			// Finding the value using getValue() method
			String value = mapElement.getValue();

			// Printing the key-value pairs
			System.out.println(key + " : " + value);
		}

		// checking map contains a specific value or not
		boolean containsValue = mp.containsValue("Bruce");
		System.out.println("Linked Hash Map contains Bruce : " + containsValue);
	}

}
