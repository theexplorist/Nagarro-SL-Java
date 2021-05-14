package com.nagarro.sl.day4;

public class ArraysDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		int a = 10;
		System.out.println(a);
		int[] kartik = new int[2];
		System.out.println(kartik);
		
		kartik = new int[3];
		System.out.println(kartik);
		
		System.out.println(kartik.length);
		*/
		
		int[] kartik = {1, 4, 5, 6};
		System.out.println(kartik.length); //4
		
		for(int index = 0; index < kartik.length; index++) {
			System.out.print(kartik[index] + " "); 
		}
	
	}

}
