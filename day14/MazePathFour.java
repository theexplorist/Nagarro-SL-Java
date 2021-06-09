package com.nagarro.sl.day14;

public class MazePathFour {

	static int count;
	public static void printPaths(int[][] maze, int sr, int sc, int er, int ec, String path, boolean[][] vis) {
		
		//+ve base case
		if(sr == er && sc == ec) {
			count++;
			System.out.println(path);
			return;
		}
		
		//-ve base cases - outside the maze
		
		if(sr > er || sc > ec || sr < 0 || sc < 0 || vis[sr][sc] == true || maze[sr][sc] == 1) {
			return;
		}
		
		
		vis[sr][sc] = true; //mark current cell as visited
		//recursive choices
		printPaths(maze, sr - 1, sc, er, ec, path + 'U', vis); //UP
		printPaths(maze, sr + 1, sc, er, ec, path + 'D', vis); //Down
		printPaths(maze, sr, sc + 1, er, ec, path + 'R', vis); //Right
		printPaths(maze, sr, sc - 1, er, ec, path + 'L', vis); //LEft	
		
		vis[sr][sc] = false; //backtracking
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] maze = {{0, 1, 0}, {0, 0, 0}, {0, 1, 0}};
		
		printPaths(maze, 0, 0, 2, 2, "", new boolean[3][3]);
	}

}
