package com.Fiquiently_Asked_Java_Program;

import java.util.Scanner;

public class CountNoOfDigitsInNum {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		int count=0;
		
		while(num!=0)
		{
			num=num/10;
			count++;
		}
		System.out.println("Number of Digits:"+count);

	}

}
