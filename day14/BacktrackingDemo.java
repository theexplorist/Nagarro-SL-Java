package com.nagarro.sl.day14;

public class BacktrackingDemo {

	public static void ravinduPrank(String[] fayasHouse, int cRoom) {

		if (cRoom == fayasHouse.length) {
			return;
		}

		fayasHouse[cRoom] = "Green";
		ravinduPrank(fayasHouse, cRoom + 1);
		fayasHouse[cRoom] = "Blue"; // undoing step(backtracking)
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] fayasHouse = { "Blue", "Blue", "Blue", "Blue" };

		for (String el : fayasHouse) {
			System.out.println(el);
		}

		ravinduPrank(fayasHouse, 0);
		System.out.println("after the prank!");
		for (String el : fayasHouse) {
			System.out.println(el);
		}
	}
}
