package com.nagarro.sl.day8;

public class WavePrintRowWise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] matrix = { { 1, 2, 3 }, // 0
				           { 4, 5, 6 }, // 1
				           { 7, 8, 9 }, // 2
				           { 10, 11, 12 } // 3
		};
		
		System.out.println(matrix.length); //4
		System.out.println(matrix[3].length);
		for(int row = 0; row < matrix.length; row++) {
			if(row % 2 == 0) { //the row is even
				// L to R
				for(int col = 0; col < matrix[row].length; col++) {
					System.out.print(matrix[row][col] + " ");
				}
			} else { //the row is odd
				//R to L
				for(int col = matrix[row].length - 1 ; col >= 0; col--) {
					System.out.print(matrix[row][col] + " ");
				}
			}
			
			System.out.println();
		}
	}

}
