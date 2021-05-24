package com.nagarro.sl.day7;

public class BubbleSort {

	private static void bubbleSort(int[] arr, int n) {
		// TODO Auto-generated method stub

		for (int pass = 1; pass <= n - 1; pass++) {
			for (int curr = 0; curr < n - pass; curr++) {
				if (arr[curr] > arr[curr + 1]) {
					int temp = arr[curr];
					arr[curr] = arr[curr + 1];
					arr[curr + 1] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 30, 50, 40, 1 };

		int n = 4;
		bubbleSort(arr, n);
		for (int e : arr) {
			System.out.println(e);
		}
	}

}
