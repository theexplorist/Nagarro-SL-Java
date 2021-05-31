package com.nagarro.sl.day10;

public class PrintDecresing {

	private static void printDec(int n) { // n = 5
		// TODO Auto-generated method stub

		//Base Case
		if(n == 0) {
			return;
		}
		
		//own work - printing myself
		System.out.println(n);
		
		//recursive call
		printDec(n - 1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		printDec(10);
	}

}
