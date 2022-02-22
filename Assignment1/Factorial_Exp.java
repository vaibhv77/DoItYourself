

//2.Write a Java Program to find the Factorial of given number. 

import java.util.*;

public class Factorial_Exp
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		
		int num= sc.nextInt();
		
		int fact=1;
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorial = "+fact);
	}
}