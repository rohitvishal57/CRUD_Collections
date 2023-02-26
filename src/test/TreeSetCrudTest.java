package com.monocept.test;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetCrudTest {

	public static void main(String[] args) {
		// creating tree set of string
		NavigableSet<String> treeSet = new TreeSet<>();

		// adding elements to the tree set
		treeSet.add("Navin");
		treeSet.add("Ranu");
		treeSet.add("Sumit");
		treeSet.add("Ganesh");
		treeSet.add("Sikha");
		treeSet.add("Piyush");

		// Printing the elements inside the TreeSet object
		System.out.println("Tree Set is " + treeSet);

		// printing the first value of tree set
		System.out.println("\nFirst Value is  : " + treeSet.first());

		// printing the last value of tree set
		System.out.println("Last Value is  : " + treeSet.last());

		// values just greater and smaller than the above string
		System.out.println("\nJust Higher to Ranu :" + treeSet.higher("Ranu"));
		System.out.println("Just Lower to Ranu :" + treeSet.lower("Ranu"));

		// Print and display initial elements of TreeSet
		System.out.println("\nInitial TreeSet :" + treeSet);

		// Removing a specific existing element inserted above
		treeSet.remove("Ranu");

		// Printing the updated TreeSet
		System.out.println("\nAfter removing element Ranu updated Tree Set is :" + treeSet);

		// Now removing the first element using pollFirst() method
		treeSet.pollFirst();

		// Again printing the updated TreeSet
		System.out.println("\nAfter removing first " + treeSet);

		// Removing the last element using pollLast() method
		treeSet.pollLast();

		// printing the tree set after removing last
		System.out.println("\nAfter removing last " + treeSet);

	}

}
