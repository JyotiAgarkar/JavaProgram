package com.Fiquiently_Asked_Java_Program;

public class SumOfDigitsInNumber {

	public static void main(String[] args) 
	{
			int num=1234;
			int sum=0;
			
			while(num!=0)
			{
				sum=sum+num%10;
				num=num/10;
			}
			System.out.println("Sum of Digits in number:"+sum);

	}

}
