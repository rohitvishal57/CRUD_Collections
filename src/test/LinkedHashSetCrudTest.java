package com.monocept.test;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetCrudTest {

	public static void main(String[] args) {
		// creating a linked hash set of string
		LinkedHashSet<String> names = new LinkedHashSet<String>();

		// adding elements to the linked hash list
		names.add("Amit");
		names.add("Aang");
		names.add("Katara");
		names.add("Souka");

		System.out.println(names);
		System.out.println();

		// removing elements
		System.out.println("Before removing elements in linked hash set are :");
		System.out.println(names);
		System.out.println();
		names.remove("Amit");
		System.out.println("After removing elements in linked hash set : ");
		System.out.println(names);
		System.out.println();
		
		// Displaying Linked Hash Set elements
		// Iterating though the LinkedHashSet using iterators
		System.out.println("Displaying elements of linked hash set:");
		Iterator itr = names.iterator();

		while (itr.hasNext()) {
			System.out.print(itr.next() + ", ");
		}
		System.out.println();

		// Using enhanced for loop for iteration
		for (String s : names) {
			System.out.print(s + ", ");
		}

		System.out.println();

		// checking is element present in the linked hash set
		boolean isThere = names.contains("Kazumi");
		System.out.println(isThere);
		System.out.println();

		// checking linked hash set is empty or not
		boolean empty = names.isEmpty();
		System.out.println("Linked Hash Set is Empty : " + empty);

		// getting size of linked hash set
		int size = names.size();
		System.out.println("size of linked hash set : " + size);

	}

}
