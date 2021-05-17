package com.nagarro.sl.day5;

public class FindTheMaximumInArray {

	private static int maxInArray(int[] arr) {
		// TODO Auto-generated method stub
		
		int max = Integer.MIN_VALUE; 
		
		for(int index = 0; index < arr.length; index++) {
			int currEl = arr[index];
			
			if(max < currEl) {
				max = currEl;
			}
		}
		
		return max;
	}
	
	private static int maxInArrayIndex(int[] arr) {
		// TODO Auto-generated method stub
		
		int max = Integer.MIN_VALUE; 
		int maxIndex = 0;
		for(int index = 0; index < arr.length; index++) {
			int currEl = arr[index];
			
			if(max < currEl) {
				max = currEl; //new max
				maxIndex = index; //new index
			}
		}
		
		return maxIndex;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {-1, 10, 2, 5, 15, 4};
		
		int ans = maxInArrayIndex(arr);
		System.out.println(ans);
		System.out.println(arr[ans]);
		
	}

}
