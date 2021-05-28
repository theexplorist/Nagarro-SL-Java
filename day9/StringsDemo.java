package com.nagarro.sl.day9;

import java.util.Scanner;

public class StringsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		System.out.println("Yo!"); //"Yo!" - String
		
		//int a = 10;
		String str = "kartik"; //declaration and hardcoding the string
		System.out.println(str);
		
		System.out.println(str.length()); //6
		
		//Input String from the user using next()
		Scanner s = new Scanner(System.in);
		String st1 = s.next();
		System.out.println(st1);
		*/
		/*
		//Some important functions of string class
		
		String s = "helleoo";
		
		//use charAt()
		char ch = s.charAt(0); //'h'
		System.out.println(ch);
		
		//print char at last index - (length - 1) 
		
		System.out.println(s.charAt(s.length() - 1));
		
		//use substring(sr, er) - sr - inc. er - exc
		System.out.println(s.substring(1, 3)); //el
		System.out.println(s.substring(1, 6)); //elloo
		System.out.println(s.substring(1, s.length())); //elloo
		System.out.println(s.substring(1)); //elloo
		
		//use indexOf() - first occurrence index of a character in a string
		System.out.println(s.indexOf('e')); // char 'e'
		System.out.println(s.indexOf('l')); // first occur of 'l'
		
		//use lastIndexOf() - last occurrence index of a char 
		
		System.out.println(s.lastIndexOf('e'));
		System.out.println(s.lastIndexOf('l'));
		
		//use startsWith(prefix) - boolean
		
		System.out.println(s.startsWith("he")); //is s starting with "he"?
		System.out.println(s.startsWith("He")); //is s starting with "He"?
		
		//use endsWith(suffix) - boolean
		
		System.out.println(s.endsWith("oo"));
		System.out.println(s.endsWith("oO"));
		*/
		
		//Equality in the strings
		
		// ==(operator) or equals() -> function
		
		Scanner s = new Scanner(System.in);
		String s1 = "abc"; //in the intern pool
		String s2 = "abc"; //in the intern pool
		String s3 = s.next(); //make a new string 
		System.out.println(s1 == s2); //true //location are same
		System.out.println(s1 == s3);// t  or a f
		
		//Making a new string everytime by hardcoding
		String s4 = new String("abc");//100% allocate new memory
		//int[] arr = new int[5];
		System.out.println(s1 == s4); //false
		
		// == compares the location where pointer is pointing to
		//equals() - compares the value only
		System.out.println(s1.equals(s4)); //true
		//fayasHome == kartikHome //false
		//fayasHome.equals(kartikHome) //true
	}

}
