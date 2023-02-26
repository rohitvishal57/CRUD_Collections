package com.monocept.test;

import java.util.HashMap;

public class HashMapCrudTest {

	public static void main(String[] args) {
		// creating a hash map
		HashMap<Integer, String> hshMap = new HashMap<Integer, String>();

		// adding elements to hash map using put
		hshMap.put(1, "Rohit");
		hshMap.put(8, "Sivanya");
		hshMap.put(3, "Rani");
		hshMap.put(4, "Jitendra");
		hshMap.put(5, "Luv");
		hshMap.put(6, "David");

		// printing elements of hash map
		System.out.println("Mapping of HashMap are : " + hshMap);

		// updating value using put
		hshMap.put(3, "Alena");
		System.out.println("Updated Map " + hshMap);

		// replacing value using replace method
		hshMap.replace(5, "Sandy");
		System.out.println("HashMap after replacement : " + hshMap);

		// Initial HashMap
		System.out.println("Initial Mappings of HashMap are : " + hshMap);

		// remove element with a key using remove method
		hshMap.remove(4);

		// Final HashMap
		System.out.println("Mappings after removal are : " + hshMap);

	}

}
