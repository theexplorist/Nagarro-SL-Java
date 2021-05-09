package com.nagarro.sl.day1;

public class IfElseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int indiaRuns = 250;
		int sLRuns = 250;
		
		
		if(indiaRuns > sLRuns) { //when ind will won
			System.out.println("Yo India Won!");
		} else if(indiaRuns == sLRuns) {
			System.out.println("Match Drawn!");
		} else {
			System.out.println("Yo Sri Lanka Won!");
		}
	}

}
