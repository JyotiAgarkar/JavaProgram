package JavaPracticeCode;
import java.util.*;
public class DuplicateNumber {

	public static void main(String[] args) 
	{
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
             
            
             int temp=0;
             for(int i=0;i<n;i++)
             {
            	 int cnt=0;
            	 for(int j=i+1;j<n;j++)
      
                   {
            		 
            		
            	 if(array[i]==array[j])
            	 {
            		 temp++;
            		 cnt++;
                 System.out.println(array[i]+" is the Duplicate number for"+cnt);
                 break;
            	 }
            	 }
             }
   if(temp==0)
    {
    System.out.println("no duplicate");
  
    
    
    }
}





	}


