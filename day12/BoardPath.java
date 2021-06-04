package com.nagarro.sl.day12;

public class BoardPath {

	static int count;
	private static void printBoardPath(int sp, int ep, String path) {
		// TODO Auto-generated method stub
		
		if(sp == ep) {
			count++;
			System.out.println(path);
			return;
		}
		
		if(sp > ep) {
			return;
		}
		
		//choices
		
		/*
		printBoardPath(sp + 1, ep, path + 1);
		printBoardPath(sp + 2, ep, path + 2);
		printBoardPath(sp + 3, ep, path + 3);
		printBoardPath(sp + 4, ep, path + 4);
		printBoardPath(sp + 5, ep, path + 5);
		printBoardPath(sp + 6, ep, path + 6);
		*/
		for(int choice = 1; choice <= 6; choice++) {
			printBoardPath(sp + choice, ep, path + choice);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.out.println("Hello" + 4);
		count = 0;
		printBoardPath(0, 7, "");
		System.out.println("count is : " + count);
	}

}
