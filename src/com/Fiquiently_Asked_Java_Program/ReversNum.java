package com.Fiquiently_Asked_Java_Program;

import java.util.Scanner;

public class ReversNum {

	public static void main(String[] args) 
	{
	     Scanner sc=new Scanner(System.in);
	     System.out.println("Enter the number:");
	     int num=sc.nextInt();
	     
	     StringBuffer sb=new StringBuffer(String.valueOf(num));
	     StringBuffer rev = sb.reverse();
	     
	     System.out.println(rev);

	}

}
