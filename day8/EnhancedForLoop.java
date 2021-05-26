package com.nagarro.sl.day8;

public class EnhancedForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1, 2, 3, 4};
		
		// 1D array print using enhanced for loop
		/*
		for(int element : arr) {
			System.out.println(element);
		}
		*/
		
		int[][] arrT = {
				        {1, 2, 3}, //0
				        {4, 5, 6}, //1
				        {7, 8, 9}  //2
				        };
		
		//int[] row = {1, 2, 3};
		//int[] row = {4, 5, 6};
		//int[] row = {7, 8, 9};
		
		// 2D array print using enhanced for loop
		for(int[] row : arrT) {
			for(int element : row) {
				System.out.print(element + " ");
			}
			
			System.out.println();
		}
	}

}
