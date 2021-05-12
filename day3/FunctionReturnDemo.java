package com.nagarro.sl.day3;

import java.util.Scanner;

public class FunctionReturnDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    Scanner s = new Scanner(System.in);

		int a = s.nextInt(); // 20
		int b = s.nextInt(); // 30
		
		int sum = additionRobo(a, b);
		System.out.println(sum);
	}

	public static int additionRobo(int a, int b) {
		int sum = a + b; // calc //50
		return sum; // returning you the res
	}

}
