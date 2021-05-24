package com.nagarro.sl.day7;

public class SelectionSort {

	public static void selectionSort(int[] arr, int n) {
		// TODO Auto-generated constructor stub
		
		//keep the marker
		for(int marker = 0; marker < n - 1; marker++) {
			
			int minEl = arr[marker];
			int minInd = marker;
			
			//min element - [markerIndex to last element]
			for(int curr = marker; curr < n; curr++) {
				if(arr[curr] < minEl) {
					minEl = arr[curr];
					minInd = curr;
				}
			}
			//swap after finding min element (arr[marker] ,  arr[minInd]
			int temp = arr[marker];
			arr[marker] = arr[minInd];
			arr[minInd] = temp;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {30, 20, 40, 10};
		
		int n = 4;
		selectionSort(arr, n);
		for(int e : arr) {
			System.out.println(e);
		}
	}

}
