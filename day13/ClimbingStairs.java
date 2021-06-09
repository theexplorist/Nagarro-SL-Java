package com.nagarro.sl.day13;

import java.util.Arrays;

public class ClimbingStairs {

	private static int ways(int pos, int n, int[] dp) {
		// TODO Auto-generated method stub
		
		//+ve base case
		if(pos == n) { //reached the top
			return 1; //we have got a legal way
		}
		
		//-ve base case
		if(pos > n) { //outside the staircase, beyond the top
			return 0; //no way buddy
		}
		
		if(dp[n] != -1) {
			return dp[n];
		}
		
		//how many choices - 2
		int c1 = ways(pos + 1, n, dp);
		int c2 = ways(pos + 2, n, dp);
		int c3 = ways(pos + 3, n, dp);
		// my work
		return dp[n] = c1 + c2;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 8;
		int[] dp = new int[n + 1];
		Arrays.fill(dp, -1);
		int ans = ways(0, n, dp);
		System.out.println(ans);
	}

}
