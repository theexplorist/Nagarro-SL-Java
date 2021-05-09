package com.nagarro.sl.day2;

import java.util.Scanner;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		
		System.out.println(134 / 10);
		int div = 2;
		boolean isPrime = true; //we are assuming that the number is prime until proven not prime
		while(div <= num - 1) {
			//work - check if divisible
			if(num % div == 0) {
				isPrime = false;
				System.out.println("Bro you are not prime!");
				break;
			}
			//manipulate condn var
			div++;
		}
		
		if(isPrime) { //if(isPrime == true)
			System.out.println("You are prime!");
		}
	}

}
