
//12.Write a Java Program to find sum of the digits of a given number. 


import java.util.*;
public class SumofDigits
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		int digit;
		int sum=0;
		
		while(num>0)
		{
			digit=num%10;
			
			sum=sum+digit;
			
			num=num/10;
		}
		
		System.out.print(sum);
	}
}
		