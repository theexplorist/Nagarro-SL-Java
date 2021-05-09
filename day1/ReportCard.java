package com.nagarro.sl.day1;

import java.util.Scanner;

public class ReportCard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the marks you got!");
		int marks = scn.nextInt();//pause
		
		if(marks >= 91 && marks <= 100) {
			System.out.println("you got A+!");
		} else if(marks >= 81 && marks <= 90) {
			System.out.println("you got A!");
		} else if(marks >= 71 && marks <= 80) {
			System.out.println("you got B!");
		} else if(marks >= 61 && marks <= 70) {
			System.out.println("you got C!");
		} else if(marks >= 51 && marks <= 60) {
			System.out.println("you got D!");
		} else {
			System.out.println("You are doomed!");
		}
		
	}

}
