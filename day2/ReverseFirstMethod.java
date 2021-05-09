package com.nagarro.sl.day2;

public class ReverseFirstMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 12345;
		int revNum = 0;
		while(num > 0) {
			//put the work
			
			int rem = num % 10;
			revNum = revNum * 10 + rem;
			
			num = num / 10;
		}
		
		System.out.println(revNum);
	}

}
