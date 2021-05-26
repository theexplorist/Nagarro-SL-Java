package com.nagarro.sl.day8;

public class SpiralPrint {

	public static void spiralDisplay(int[][] arr) {

		int sRow = 0;
		int eRow = arr.length - 1;
		int sCol = 0;
		int eCol = arr[0].length - 1;

		int total = arr.length * arr[0].length; // total elements which are supposed to be printed
		int count = 0; // elements which are printed till now

		while (count < total) {

			// first Row
			for (int col = sCol; col <= eCol && count < total; col++) {

				System.out.print(arr[sRow][col] + ", ");
				count++;
			}
			sRow++;

			// last col
			for (int row = sRow; row <= eRow && count < total; row++) {
				System.out.print(arr[row][eCol] + ", ");
				count++;
			}
			eCol--;

			// last row
			for (int col = eCol; col >= sCol && count < total; col--) {
				System.out.print(arr[eRow][col] + ", ");
				count++;
			}
			eRow--;

			// first col
			for (int r = eRow; r >= sRow && count < total; r--) {
				System.out.print(arr[r][sCol] + ", ");
				count++;
			}
			sCol++;

		}
		System.out.println("END");
		System.out.println();

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] matrix = { { 1, 2, 3, 20 }, // 0
				{ 4, 5, 6, 30 }, // 1
				{ 7, 8, 9, 40 }, // 2
				{ 10, 11, 12, 50 } // 3
		};

		spiralDisplay(matrix);
	}

}
