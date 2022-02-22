

//7.How to check the given number is Positive or Negative in Java? 

import java.util.*;


public class Positive_Negative
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter number to be checked");
		
		int num= sc.nextInt();
		
		if(num<0)
			System.out.println("Number is Negative");
		
		else if(num>0)
			System.out.println("Number is Positive");
		
		else
			System.out.println("Number is 0");
	}
}