package com.nagarro.sl.day11;

public class PrintingSubsequences {
    //inp -> "abc", ans -> ""
	public static void printSubsequences(String inp, String ans) {
		
		//B.C 
		if(inp.length() == 0) {
			System.out.println(ans);
			return;
		}
		
		char newChar = inp.charAt(0);
		String restOfInputString = inp.substring(1);
		
		printSubsequences(restOfInputString, ans); //excl
		printSubsequences(restOfInputString, ans + newChar); //incl
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		printSubsequences("abc", "");
	}

}
