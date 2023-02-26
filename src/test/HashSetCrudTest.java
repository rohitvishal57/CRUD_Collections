package com.monocept.test;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetCrudTest {

	public static void main(String[] args) {
		// creating hashset of strings
		HashSet<String> set = new HashSet<String>();

		// adding elements to hashset
		set.add("Komal");
		set.add("Viswa");
		set.add("Carole");

		System.out.println(set);

		// trying to add duplicate but HashSet did not change it contains only unique
		// elements
		set.add("Komal");
		System.out.println(set);

		set.add("Naomi");
		System.out.println("Initial Hash set : " + set);

		// removing elements from hash set

		set.remove("Komal");
		System.out.println("After removing : " + set);

		// checking hash set contains specific element or not
		boolean contains = set.contains("Naomi");
		System.out.println(contains);

		// getting size of hashSet
		int size = set.size();
		System.out.println(size);

		// iterating through hash set
		Iterator itr = set.iterator();

		// Holds true till there is single element remaining in Set
		while (itr.hasNext()) {

			// Traversing elements and printing them
			System.out.print(itr.next() + ", ");
		}

		System.out.println();

		// Using enhanced for loop for traversal
		for (String s : set) {

			// Traversing elements and printing them
			System.out.print(s + ", ");
		}

	}

}
