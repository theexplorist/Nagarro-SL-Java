package com.nagarro.sl.day14;

public class BInarySearch {

	private static int binarySearch(int[] arr, int searched) {
		// TODO Auto-generated method stub

		int left = 0;
		int right = arr.length - 1;
		
		while(left <= right) {
			int midIndex = (left + right) / 2;
			
			if(arr[midIndex] < searched) {
				left = midIndex + 1;
			} else if(arr[midIndex] > searched) {
				right = midIndex - 1;
			} else { //equal
				//we have got the element
				return midIndex;
			}
		}
		
		//left has surpassed right
		
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {5, 10, 15, 20};
		
		int ans = binarySearch(arr, 10);
		System.out.println(ans);
	}

}
