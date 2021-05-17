package com.nagarro.sl.day5;

public class ArrayDemosImp {

	public static void changePaint(boolean[] houseClone) {
		houseClone[0] = true;
	}
	
	public static void changePaint2(boolean roomNumber) {
		roomNumber = true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean[] house = new boolean[3];
		
		//System.out.println(house[2]);
		
		/*
		System.out.println(house[0]);
		changePaint(house);
		System.out.println(house[0]);
		*/
		System.out.println(house[0]);
		changePaint2(house[0]);
		System.out.println(house[0]);
	}

}
