package com.Fiquiently_Asked_Java_Program;

import java.util.Scanner;

public class LargestOf3Num {

	public static void main(String[] args) 
	{
		//by using ternary Operater
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Number:");
		int a=sc.nextInt();
		
		System.out.println("Enter Second Number:");
		int b=sc.nextInt();
		
		System.out.println("Enter Third Number:");
		int c=sc.nextInt();
		
		//by using ternary Operater (a>b?a:b)
		int largest=c>(a>b?a:b)?c:(a>b?a:b);
		
		System.out.println("Largest number:"+largest);
		

	}

}
