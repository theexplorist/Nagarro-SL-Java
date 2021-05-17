package com.nagarro.sl.day5;

public class SwappingDemosArray {

	public static void printArray(int[] ar) {
		for(int el : ar) {
			System.out.print(el + " ");
		}
		System.out.println();
	}
	public static void swap1(int[] ar1Clone, int[] ar2Clone) {
		int[] temp = ar1Clone;
		ar1Clone = ar2Clone;
		ar2Clone = temp;
	}
	
	public static void swap2(int[] ar1Clone, int[] ar2Clone, int i, int j) {
		int temp = ar1Clone[i];
		ar1Clone[i] = ar2Clone[j];
		ar2Clone[j] = temp;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] ar1 = {1, 2, 3};
		int[] ar2 = {4, 5, 6};
		
		printArray(ar1);
		printArray(ar2);
		

		
		swap2(ar1, ar2, 0, 0);
		System.out.println("--------------------");
		printArray(ar1);
		printArray(ar2);
		
		
	}

}
