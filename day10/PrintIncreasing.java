package com.nagarro.sl.day10;

public class PrintIncreasing {

	private static void printInc(int n) { // n = 5
		// TODO Auto-generated method stub

		// Base Case
		if (n == 0) { // n = 1?
			return;
		}

		// recursive call
		printInc(n - 1);

		// own work - printing myself
		System.out.println(n);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printInc(5);
	}

}
