package com.nagarro.sl.day11;

public class ValidParenthesis {

	// ans - "", n - 2
	private static void sol(String ans, int n, int obc, int cbc) {
		// TODO Auto-generated method stub

		if(obc == n && cbc == n) {
			System.out.println(ans);
			return;
		}
		
		if(obc < n) {
			//make a call for putting ( in our ans
			sol(ans + '(', n, obc + 1, cbc);
		} 
		
		if(obc > cbc) {
			//make a call for putting ) in our ans
			sol(ans + ')', n, obc, cbc + 1);
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sol("", 4, 0, 0); // ( ( ) ) 
	}

}
