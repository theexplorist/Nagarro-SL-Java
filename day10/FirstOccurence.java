package com.nagarro.sl.day10;

public class FirstOccurence {

	//arr = {10, 5, 4, 20, 4}, 0th, 4
	private static int firstOccurence(int[] arr, int ci, int searched) {
		// TODO Auto-generated method stub

		//Base case
		if(ci == arr.length) { //empty array, do not make a check further, element not found
			return -1;
		}
		//my work
		if(arr[ci] == searched) {
			return ci; //found the first occu of searched
		}
		
		//Order recursion to reduce the array
		return firstOccurence(arr, ci + 1, searched);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10, 5, 4, 20, 4};
		
		int ans = firstOccurence(arr, 0, 30);
		System.out.println(ans);
	}

}
