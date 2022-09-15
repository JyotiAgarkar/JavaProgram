package JavaPracticeCode;
import java.util.*;


public class LargestNumerArray {
//find out Largest elemnt of array
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Size of array");
		int n=sc.nextInt();
		int [] array= new int[n];
		 
		  for(int i=0;i<n;i++)
			  
		  {
	 System.out.println("Enter "+i+ "Element");
			 
			  array[i]=sc.nextInt();	 
		  }
		 
		  int max=array[0];
		  for(int j=1;j<n;j++)
		  {
			  if(array[j]>max)
				  max=array[j];
		  }
		  System.out.println(max+" is the largest number");
	}

}
