package JavaPracticeCode;
import java.util.*;
//to check Armstrong number
public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
 System.out.println("Enter number");
 
		int OriginalNumber=sc.nextInt();
 
 int number=OriginalNumber;
 int rem,sum=0;
 
 while(number!=0)
 {
	 rem=number%10;
	 sum+=rem*rem*rem;
	 number=number/10;
 }
 if(sum==OriginalNumber)
		 
 {
	 System.out.println(OriginalNumber +" is armstrong Number");
 }else System.out.println(OriginalNumber +" not Armstrong Number");
	}

}
