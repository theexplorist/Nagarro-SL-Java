package com.nagarro.sl.day12;

public class StringBuiilderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Mutable
		/*
		StringBuilder sb = new StringBuilder("Hello");
		
		sb.append('l');
		System.out.println(sb.toString());
		*/
		
		//String str = "Hello";
		
		long start = System.currentTimeMillis();
		
		StringBuilder sb = new StringBuilder("Hello");
		for(int i = 0; i < 10000; i++) {
			sb.append('l');
		}
		
		long end = System.currentTimeMillis();
		System.out.println(end - start);
		//System.out.println(sb.toString());	
	}

}
