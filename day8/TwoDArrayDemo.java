package com.nagarro.sl.day8;

import java.util.Scanner;

public class TwoDArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = new int[7];
		int[][] arrTwoD = new int[4][3];

		System.out.println(arrTwoD.length); // number of rows
		System.out.println(arrTwoD[3].length); // number of cols
		System.out.println(arrTwoD); // address of 2D array
		System.out.println(arrTwoD[0]);// at every row a 1D array is present
		System.out.println(arrTwoD[1]);// prints address of array at 1th row

		int[] ar = new int[3];
		/*
		 * for(int index = 0; index < ar.length; index++) { //
		 * System.out.println(ar[index]); }
		 */
		/*
		 * for(int index = 0; index < ar.length; index++) { ar[index] = sc.nextInt(); }
		 */
		// System.out.println(ar[1]);

		// Hardcoding 2D array
		int[][] arrT = { { 1, 2, 3 }, // 0
				{ 4, 5, 6 }, // 1
				{ 7, 8, 9 }, // 2
				{ 10, 11, 12 } // 3
		};
		// System.out.println(arrT[1]);

		// Accessing element in (3, 1) cell
		System.out.println(arrT[3][1]);

		// Row wise 2D print
		for (int row = 0; row < 4; row++) {
			for (int col = 0; col < 3; col++) {
				System.out.print(arrT[row][col] + " ");
			}
			System.out.println();
		}

		int[][] arrr = new int[4][3];
		Scanner s = new Scanner(System.in);

		// Matrix input row-wise
		for (int row = 0; row < 4; row++) {
			for (int col = 0; col < 3; col++) {
				arrr[row][col] = s.nextInt();
			}
		}

		// Matrix output row wise
		for (int row = 0; row < 4; row++) {
			for (int col = 0; col < 3; col++)

			{
				System.out.print(arrr[row][col] + " ");
			}
			System.out.println();
		}

		int[][] matrix = new int[4][3];
		
		// matrix input col - wise
		for (int col = 0; col < 3; col++) {
			for (int row = 0; row < 4; row++) {
				matrix[row][col] = s.nextInt();
			}
		}

		for (int row = 0; row < 4; row++) {
			for (int col = 0; col < 3; col++) {
				System.out.print(matrix[row][col] + " ");
			}
			System.out.println();
		}
	}
}
