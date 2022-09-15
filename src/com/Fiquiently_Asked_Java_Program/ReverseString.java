package com.Fiquiently_Asked_Java_Program;

public class ReverseString {

	public static void main(String[] args) 
	{
// By using StringBuffer Class:
	     String s="Shailesh";
//	     StringBuffer sb=new StringBuffer(s);
//	     System.out.println(sb.reverse());
	     
//By using Character Array:
	     char a[]=s.toCharArray();
	     int len = s.length();
	     String rev="";
	     for(int i=len-1; i>=0; i--)
	     {
	    	 
	    	  rev=rev+a[i];
	     }
	 
		System.out.println(rev);
	     
	     
	}

}
