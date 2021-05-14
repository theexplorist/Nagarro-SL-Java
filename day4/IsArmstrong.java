package com.nagarro.sl.day4;

import java.util.Scanner;

public class IsArmstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		boolean ans = isArm(n);
		if (ans == true) {
			System.out.println(ans);
		} else {
			System.out.println(ans);
		}
	}

	public static boolean isArm(int n) { // n = 371

		int numDig = numDigits(n); // 3
		int temp = n; //n = 371
		int newNum = 0;
		while (n > 0) { 
			int digit = n % 10;
			n /= 10;
			newNum += Math.pow(digit, numDig);
		}

		if (temp == newNum) { //371 == newNum
			return true;
		} else {
			return false;
		}
	}

	public static int numDigits(int n) {

		int count = 0;
		while (n > 0) {
			n = n / 10;
			count++;
		}
		return count;
	}

}
