

//16.Write a Java Program to find GCD of two given numbers. 


import java.util.*;

public class FindGCD
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter numbers");
		
		int a1=sc.nextInt();
		int a2=sc.nextInt();
		
		while(a1!=a2)
		{
			if(a1>a2)
				a1=a1-a2;
			
			else
				a2=a2-a1;
		}
		
		System.out.println("GCD is "+a2);
	}
}
		
		
		
		