package com.nagarro.sl.day6;

public class ArrayReversePrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {10, 5, 6, 4, 3}; // 3 4 6 5 10
		
		for(int index = 4; index >= 0; index--) {
			System.out.print(arr[index] + " ");
		}
	}

}
