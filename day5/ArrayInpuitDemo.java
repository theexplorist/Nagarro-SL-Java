package com.nagarro.sl.day5;

import java.util.Scanner;

public class ArrayInpuitDemo {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = new int[4];
		
		Scanner s = new Scanner(System.in);
		/*
		arr[0] = s.nextInt();
		arr[1] = s.nextInt();
		arr[2] = s.nextInt();
		arr[3] = s.nextInt();
		*/
		
		for(int index = 0; index < arr.length; index++) {
			arr[index] = s.nextInt();
		}
		
		/*
		for(int index = 0; index < arr.length; index++) {
			System.out.println(arr[index]);
		}
		*/
		
		for(int element : arr) {
			System.out.println(element);
		}
	}

}
