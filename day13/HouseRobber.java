package com.nagarro.sl.day13;

import java.util.Arrays;

public class HouseRobber {
	
	public static int maxAmount(int[] house, int pos, int numHouses, int[] dp) {
		if(pos >= numHouses) {
			return 0;
		}
		
		if(dp[pos] != -1) {
			return dp[pos];
		}
		//rob the house
		int c1 = house[pos] + maxAmount(house, pos + 2, numHouses, dp);
		int c2 = maxAmount(house, pos + 1, numHouses, dp);
		
		//my work
		return dp[pos] = Math.max(c1, c2);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] house = {2, 7, 9, 3, 1};
		
		int[] dp = new int[house.length + 1];
		
		Arrays.fill(dp, -1);
		int ans = maxAmount(house, 0, house.length, dp);
		System.out.println(ans);
	}

}
