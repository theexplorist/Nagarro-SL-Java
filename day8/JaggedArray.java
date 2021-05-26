package com.nagarro.sl.day8;

public class JaggedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] jaggedArray = { 
				{ 1, 2, 3 }, // 0
				{ 4, 5, 6, 7 }, // 1
				{ 8, 9 }, // 2
				{ 10, 11, 12, 13, 14 }// 3
		};
		
		//print num cols in 1th row
		System.out.println(jaggedArray[1].length);
		//print num cols in 3th row
		System.out.println(jaggedArray[3].length);
		//memory address of 1D array at 1th row
		System.out.println(jaggedArray[1]);
		
		for(int row = 0; row < jaggedArray.length; row++) {
			for(int col = 0; col < jaggedArray[row].length; col++) {
				System.out.print(jaggedArray[row][col] + " ");
			}
			System.out.println();
		}
	}

}
