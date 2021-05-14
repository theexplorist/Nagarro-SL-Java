package com.nagarro.sl.day4;

import java.util.Scanner;

public class LowerUpper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		char ch = 'B';
		char cc = s.next().charAt(0);//taking char input in java
		System.out.println(cc);
		if(ch >= 65 && ch <= 90) {
			System.out.println("UpperCase!");
		} else if(ch >= 97 && ch <= 122) {
			System.out.println("LowerCase!");
		} else {
			System.out.println("Invalid");
		}
	}

}
