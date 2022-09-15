package com.Fiquiently_Asked_Java_Program;

public class FabonacciSeries {

	public static void main(String[] args) 
	{
		int n1=0;
		int n2=1;
		System.out.print(n1+" "+n2);
		int sum=0;
		
		for(int i=1; i<=5; i++)
		{
			sum=n1+n2;
			System.out.print(" "+sum);
			n1=n2;
			n2=sum;
		}
		
		
		

	}

}
