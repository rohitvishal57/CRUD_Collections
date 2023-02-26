package com.monocept.test;

import java.util.LinkedList;

public class LinkedListCrudTest {

	public static void main(String[] args) {
		// creating a linked list of string
		LinkedList<String> names = new LinkedList<String>();

		// adding elements to the linked list
		names.add("Amit");
		names.add("Aang");
		names.add("Katara");

		System.out.println(names);

		// adding at specific location
		names.add(2, "Souka");
		System.out.println(names);

		// updating elements in linked list that is changing
		System.out.println("\nInitial Linked list : " + names);

		// updating value at location
		names.set(1, "Sunita");
		System.out.println("\nUpdated Linked List " + names);

		// removing elements
		names.remove("Amit");
		System.out.println(names);

		// removing by index
		names.remove(1);
		System.out.println(names);
		System.out.println();

		// Displaying the Linked List i.e iterating
		// Using the Get method and the for loop
		for (int i = 0; i < names.size(); i++) {

			System.out.print(names.get(i) + " ");
		}

		System.out.println();

		// Using the for each loop
		for (String str : names)
			System.out.print(str + " ");

		System.out.println();
		// adding elements to linked list addFirst() add at beginning
		names.addFirst("Kazumi");
		// adding elements to linked list addLast() add at ens
		names.addLast("Nakamura");

		System.out.println(names);

		// checking is element present in the list
		boolean isThere = names.contains("Kazumi");
		System.out.println(isThere);

		// removes head element of linked list
		String headEle = names.remove();
		System.out.println(headEle);

		// removes specific element
		names.remove("Sunita");
		System.out.println(names);

		// adding more elements
		names.add(1, "Nivedita");
		names.add("Korosuke");
		System.out.println();

		// removing first element
		System.out.println("Initial Linked List : " + names);
		String removeFirst = names.removeFirst();
		System.out.println("first element of linked list is : " + removeFirst);

		// removing last element
		System.out.println("Initial Linked List : " + names);
		String removeLast = names.removeLast();
		System.out.println("last element of linked list is : " + removeLast);

	}

}
