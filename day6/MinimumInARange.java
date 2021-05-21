package com.nagarro.sl.day6;

public class MinimumInARange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {10, 5, 15, 20, 3, 6};
		
		int l = 0;
		int r = 3;
		
		int minEl = arr[l];
		for(int index = l; index <= r; index++) {
			if(arr[index] < minEl) {
				minEl = arr[index];
			}
		}
		
		System.out.println(minEl);
	}

}
