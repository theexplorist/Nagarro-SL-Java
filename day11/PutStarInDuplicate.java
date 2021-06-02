package com.nagarro.sl.day11;

public class PutStarInDuplicate {

	public static void sol(String inp, String ans) { // ans = "helo"

		if (inp.length() == 1) {
			System.out.println(ans + inp);
			return;
		}

		char ch0 = inp.charAt(0);
		char ch1 = inp.charAt(1);
		if (ch0 != ch1) {
			sol(inp.substring(1), ans + ch0);
		} else {
			sol(inp.substring(1), ans + ch0 + '*');
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		sol("Helloo", "");
	}

}
