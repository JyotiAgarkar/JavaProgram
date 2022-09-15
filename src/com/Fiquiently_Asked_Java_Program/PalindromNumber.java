package com.Fiquiently_Asked_Java_Program;

import java.util.Scanner;

public class PalindromNumber {

	public static void main(String[] args) 
	{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the Number:");
			int num=sc.nextInt();
			
			int org_num=num;
			int rev=0;
			
			while(num!=0)
			{
				rev=rev*10+num%10;
				num=num/10;
			}
			if(org_num==rev)
			{
				System.out.println(org_num+" "+"is Palendrom Number");
			}
			else
			{
				System.out.println(org_num+" "+"is Not Palendrom Number");
			}

	}

}
