package com.nagarro.sl.day3;

public class SwappingDemo {

	static int c = 100; //global -> citizen of every country
	static int a = 20; 
	static int b = 30;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		int a = 20;
		int b = 30;
		*/
		System.out.println(a +" " + b);
		swap();
		System.out.println(a +" " + b);
		//System.out.println(c);
	}
	

	public static void swap() {
		//System.out.println(c);
		int temp = a;
		a = b;
		b = temp;
	}
	
	/*
	  public static void swap(int a, int b) {
		//System.out.println(c);
		int temp = a;
		a = b;
		b = temp;
	}
	 */
	
}
