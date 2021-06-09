package com.nagarro.sl.day13;

import java.util.Arrays;
import java.util.Scanner;

public class FibonacciRecursive {

	private static long nthFibo(int n, long[] experience) {
		// TODO Auto-generated method stub

		// Base Case
		if (n == 0 || n == 1) { // fib(0) = 0 and fib(1) = 1
			return n;
		}

		//how we can check if we are seeing same problem again
		if(experience[n] != -1) {
			//repeated sub problem
			return experience[n];
		}
		// 2 choices

		//i am seeing this problem for the first time
		long c1 = nthFibo(n - 1, experience);
		long c2 = nthFibo(n - 2, experience);

		// our work

		return experience[n] = c1 + c2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		long[] experience = new long[n + 1];
		
		Arrays.fill(experience, -1);
		long a = nthFibo(n, experience);
		System.out.println(a);
	}
}
