package com.nagarro.sl.day6;

public class MinimumInRange {

	public static int minEl(int[] arr) {
		
		int minEl = arr[0];
		int minInd = 0;
		for(int index = 0; index <= arr.length - 1; index++) {
			if(arr[index] < minEl) {
				minEl = arr[index];
				minInd = index;
			}
		}
		
		return minInd;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {10, 5, 15, 20, 3, 6};
		int ans = minEl(arr);
		System.out.println(ans);
	}

}
