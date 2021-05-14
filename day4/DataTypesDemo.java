package com.nagarro.sl.day4;

import java.util.Scanner;

public class DataTypesDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		
		Scanner s = new Scanner(System.in);
		int a = 10;
		int b = s.nextInt();
		
		byte c = s.nextByte();
		short d = s.nextShort();
		long e = s.nextLong();
		*/
		/*
		byte b = 10; //smaller box
		short c; //big box
		//storing smaller box into big box
		c = b;
		
		short d; //32767
		int e = 32769;
		
		//storing bigger box into smaller box
		d = (short)(e); 
		
		
		//biggest box
		long l = 100000L;
		System.out.println(l);
		b = (byte)l;//explicit typecasting
		System.out.println(b);
		System.out.println(d);
		System.out.println(Long.MAX_VALUE);
		System.out.println(Long.MIN_VALUE);
		System.out.println(Short.MAX_VALUE);
		System.out.println(Short.MIN_VALUE);
		*/
		char ch = 'B';
		System.out.println(ch);
		
		System.out.println((char)(ch + 1));//C or 67 //(char)(67)
	}

}
