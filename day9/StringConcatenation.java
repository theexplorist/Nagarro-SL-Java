package com.nagarro.sl.day9;

public class StringConcatenation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "Hello "; //strings are immutable
		String s2 = "buddy";
		
		String s4 = "Hello buddy";
		String s3 = s1 + s2; //Hello buddy 1 operation (length of string 1 + length of string 2)
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3 == s4);
		//System.out.println(s3);		
	}

}
