package com.nagarro.sl.day12;

import java.util.ArrayList;
import java.util.Collections;

class Person {
	String name;
	int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
}

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int[] arr = new int[5];
		// System.out.println(arr);
		
		// 1 method
		
		ArrayList<Integer> dynamicArray = new ArrayList<>();

		System.out.println(dynamicArray.size());
		// Adding elements in arraylist(add())
		dynamicArray.add(10);
		dynamicArray.add(20);
		dynamicArray.add(30);

		// size()
		System.out.println(dynamicArray.size());
		System.out.println(dynamicArray); // show you the elements

		/*
		 * //get(index) for(int index = 0; index < dynamicArray.size(); index++) {
		 * System.out.println(dynamicArray.get(index)); }
		 */

		// Short hand for loop
		for (int element : dynamicArray) {
			System.out.println(element);
		}

		// take the input

		/*
		Scanner s = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			int inp = s.nextInt();
			dynamicArray.add(inp);
		}
		*/

		System.out.println(dynamicArray);

		Collections.sort(dynamicArray);
		System.out.println("After Sorting!");
		System.out.println(dynamicArray);

		// Arrays.sort(the name of the array)

		Person kartik = new Person("Kartik", 23);

		// Person[] arr = new Person[5];
		ArrayList<Person> customerList = new ArrayList<>();
		customerList.add(kartik);
		
		ArrayList<String> list = new ArrayList<>();
		list.add("Kartik");
		list.add("ABC");
		list.add("DEF");
		
		System.out.println(list);
		
		Collections.sort(list); //lexicographically
		
		System.out.println(list);
		
		
	}

}
