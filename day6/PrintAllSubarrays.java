package com.nagarro.sl.day6;

public class PrintAllSubarrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {4, 5, 6};
		
		for(int start = 0; start <= arr.length - 1; start++) { // 0, 1, 2
			for(int end = start; end <= arr.length - 1; end++) {
				//print elements in range [start, end]
				int sum = 0;
				for(int pr = start; pr <= end; pr++) {
					sum = sum + arr[pr];
					System.out.print(arr[pr] + " ");
				}
				System.out.print(sum);
				System.out.println();
			}
		}
	}

}
