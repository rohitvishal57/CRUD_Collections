package com.monocept.test;

import java.util.ArrayList;

import com.monocept.model.Employee;

public class ArrayListCRUDTest {

	public static void main(String[] args) {
		// creating list of employees which stores Employee objects
		ArrayList<Employee> employees = new ArrayList<Employee>();

		// Creating objects of employee
		Employee emp1 = new Employee(1, "Rohit", 12000);
		Employee emp2 = new Employee(2, "Aang", 15300);
		Employee emp3 = new Employee(5, "Katara", 10000);
		Employee emp4 = new Employee(7, "Ranjit", 8000);

		// adding employee to the array employees
		employees.add(emp1);
		employees.add(emp2);
		employees.add(emp3);
		System.out.println(employees);
		System.out.println();

		// adding employee emp4 to the specific location i.e at location 2
		employees.add(2, emp4);
		System.out.println(employees);
		System.out.println();

		// getting employee at index 3
		Employee emp = employees.get(3);
		System.out.println(emp);
		System.out.println();

		// getting the total number of elements in arrayList employees
		int size = employees.size();
		System.out.println("Size of employees array : " + size);
		System.out.println();

		// checking if a employee is present in the list or not
		boolean isPresent = employees.contains(emp1);
		System.out.println(isPresent);
		System.out.println();

		// remove a employee from the list
		employees.remove(emp1);
		System.out.println(employees);
		System.out.println();

		// remove a employee by index
		employees.remove(2);
		System.out.println(employees);
		System.out.println();

		// finding index of specific employee
		int ind = employees.indexOf(emp);
		System.out.println("index of employee " + emp + " is " + ind);

	}

}
