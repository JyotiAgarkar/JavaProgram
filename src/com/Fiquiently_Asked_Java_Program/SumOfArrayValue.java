package com.Fiquiently_Asked_Java_Program;

public class SumOfArrayValue {

	public static void main(String[] args) 
	{
		int a[]= {1,2,3,4,5};
		int sum=0;
		
		for(int value:a)
		{
			sum=sum+value;
		}
		System.out.println(sum);

	}

}
