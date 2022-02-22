
//14.How to add two numbers without using the arithmetic operators in Java? 

import java.util.*;

public class AddNumbers
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers to be add");
		
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		for(int i=1;i<=b;i++)
		{
			a++;
		}
		
		System.out.println("Sum= "+a);
	}
}
		
		
		