

//20.Write a Java Program to print all the Prime Factors of the Given Number.

import java.util.*;
public class PrimeFactors
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number");
		
		int num=sc.nextInt();
		int temp=num;
		int i=2;
		
		while(num>1)
		{
			if(num%i==0)
			{
				System.out.println(i +" ");
				num=num/i;
			}
			
			else
				i++;
		}
	}
}
			
			
		
		