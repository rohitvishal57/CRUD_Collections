package com.monocept.test;

import java.util.TreeMap;

public class TreeMapCrudTest {

	public static void main(String[] args) {
		// creating a tree map
		TreeMap<Integer, String> tMap = new TreeMap<Integer, String>();

		// inserting elements using put
		tMap.put(1, "Sradhha");
		tMap.put(3, "BMW");
		tMap.put(4, "Honda");
		tMap.put(2, "peacock");
		tMap.put(8, "Rikshaw");
		tMap.put(9, "Norway");
		tMap.put(5, "Lion");

		System.out.println("Elements of TreeMap : " + tMap);

		// Inserting the element at specified corresponding to specified key
		tMap.put(1, "Funny");
		System.out.println("Elements of TreeMap after replacing shradhha : " + tMap);

		// removing elements
		// Printing all elements of Map before removal
		System.out.println("All elements of TreeMap before removing " + tMap);

		// Removing the element corresponding to key
		tMap.remove(4);

		// Printing updated TreeMap
		System.out.println("After removal key 4 TreeMap : " + tMap);

		// return first lowest key
		Integer firstKey = tMap.firstKey();
		System.out.println("First Key : " + firstKey);

		// replacing a element
		tMap.replace(1, "Dora");
		System.out.println("After replacement 1 Shradhha replaced : " + tMap);

		// checking if the TreeMap contains a value
		boolean containsValue = tMap.containsValue("Dora");
		System.out.println("Value is available in TreeMap :" + containsValue);

	}

}
