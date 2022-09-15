package JavaPracticeCode;
import java.util.*;

public class FibonacciSeriews {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size of series");
		int n=sc.nextInt();
		int secondnumber=1;int firstnumber=0,number=0;
		for (int i=0;i<n;i++)
		{
			System.out.println(number +" ");
			number=firstnumber+secondnumber;
			
			firstnumber=secondnumber;
			secondnumber=number;
		}

	}

}
