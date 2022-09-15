package com.Fiquiently_Asked_Java_Program;

import java.util.Random;

public class RandomNumAndString {

	public static void main(String[] args) 
	{
		Random ran=new Random();
		int num = ran.nextInt(10);
		
		System.out.println(num);

	}

}
