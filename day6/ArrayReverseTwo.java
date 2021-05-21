package com.nagarro.sl.day6;

public class ArrayReverseTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10, 5, 6, 4, 3}; // 3 4 6 5 10
		
		int l = 0;
		int r = arr.length - 1; //4
		
		while(l < r) {
			int temp = arr[l];
			arr[l] = arr[r];
			arr[r] = temp;
			
			l++;
			r--;
		}
		
		for(int index = 0; index < arr.length; index++) {
			System.out.print(arr[index] + " ");
		}
	}

}
