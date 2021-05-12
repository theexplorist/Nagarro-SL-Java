package com.nagarro.sl.day3;

import java.util.Scanner;

public class FunctionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hey Robo, add the numbers!");
		//addition();
		
		Scanner s = new Scanner(System.in);
		
		int a = s.nextInt(); //20
		int b = s.nextInt(); //30
		//additionUserInput(a, b);
		/*
		System.out.println(a +" " + b);
		additionUserInput2(a, b);
		System.out.println(a +" " + b);
		*/
		
		System.out.println("Hey Robo, Thank you for adding!");
	}
	
	public static void additionUserInput2(int aClone, int bClone) {
		aClone = 50;
		bClone = 60;
	}
	
	public static void additionUserInput(int aClone, int bClone) {
		System.out.println(aClone + bClone);
	}
	
	
	public static void addition() { //nothing to be returned
		
		int a = 10;
		int b = 20;
		
		System.out.println(a + b);
	}

}
