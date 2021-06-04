package com.nagarro.sl.day12;

public class MazePath {

	static int count;
	public static void printPaths(int sr, int sc, int er, int ec, String path) {
		
		//+ve base case
		if(sr == er && sc == ec) {
			count++;
			System.out.println(path);
			return;
		}
		
		//-ve base cases - outside the maze
		
		if(sr > er || sc > ec) {
			return;
		}
		
		//recursive choices
		
		//Horizontal
		printPaths(sr, sc + 1, er, ec, path + 'H');
		//vertical
		printPaths(sr + 1, sc, er, ec, path + 'V');
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		count = 0;
		printPaths(0, 0, 3, 2, "");
		System.out.println(count);
	}

}
