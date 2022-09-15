package com.Fiquiently_Asked_Java_Program;

public class Swap2Num {

	public static void main(String[] args) 
	{
		int a=10;
		int b=20;
		int c;
		System.out.println("a="+a+" "+"b="+b);
		c=a+b;  
		a=c-a;  
		b=c-a;
		System.out.println("a="+a+" "+"b="+b);
	}

}
