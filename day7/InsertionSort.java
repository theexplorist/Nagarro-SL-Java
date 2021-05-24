package com.nagarro.sl.day7;

public class InsertionSort {

	private static void insertionSort(int[] arr, int n) {
		// TODO Auto-generated method stub
		
		for(int curr = 1; curr < n; curr++) {
			int currcard = arr[curr];
			int prevCardIndex = curr - 1;
			while(prevCardIndex >= 0 && arr[prevCardIndex] > currcard) {
				arr[prevCardIndex + 1] = arr[prevCardIndex];
				prevCardIndex--;
			}
			arr[prevCardIndex + 1] = currcard;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 9, 2, 7, 5, 4 };

		int n = 5;
		insertionSort(arr, n);
		for (int e : arr) {
			System.out.println(e);
		}
	}

}
