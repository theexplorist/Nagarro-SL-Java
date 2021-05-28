package com.nagarro.sl.day9;

public class StringQuestions {
	
	public static void printAllSubstring(String s) {
		for(int si = 0; si <= s.length() - 1; si++) {
			for(int ei = si + 1; ei <= s.length(); ei++) {
				System.out.println(s.substring(si, ei));
			}
		}
	}
	
	public static void printAllPalindromicSubstrings(String s) {
		for(int si = 0; si <= s.length() - 1; si++) {
			for(int ei = si + 1; ei <= s.length(); ei++) {
				String subString = s.substring(si, ei);
				if(isPalindrome(subString)) {
					System.out.println(subString);
				}
			}
		}
	}
	public static boolean isPalindrome(String actualString) {
		
		int sp = 0, ep = actualString.length() - 1;
		
		//repeated work - comparing sp and ep char
		
		while(sp < ep) { //sp = ep we will stop the loop
			if(actualString.charAt(sp) != actualString.charAt(ep)) {
				//my string is not palindrome
				return false;
			}
			
			sp++;
			ep--;
		}
		//if we are here on this line that means string is palindrome
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		String s = "nitim";
		
		boolean ans = isPalindrome(s);
		
		System.out.println(ans);
		*/
		
		String s = "nitin bro";
		printAllPalindromicSubstrings(s);
	}

}
