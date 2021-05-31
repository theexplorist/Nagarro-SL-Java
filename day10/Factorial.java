package com.nagarro.sl.day10;

public class Factorial {

	private static int factorial(int n) { //n = 5 = 5 * 4!
		// TODO Auto-generated method stub
		
		//1 . stop the recursion somewhere (Base Case)
		if(n == 1) {
			return 1;
		}
		
		//2 . Recursive Calls
		int recAns = factorial(n - 1); //fact(4) -> fact(3)
		
		//3 .my work is multiplying n! = n * (n - 1)!
		int myAns = n * recAns;
		
		return myAns;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ans = factorial(6);
		System.out.println(ans);
	}

}
