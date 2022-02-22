

//3.Find the Factorial of a number using Recursion. 

import java.util.*;


public class Factorial_Rec
{
	
	static int fun_fact(int a)
	{
		if(a==0)
			return 1;
		else
			return (a*fun_fact(a-1));
	}
	
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int num= sc.nextInt();
		
		int fact=1;
		
		fact=fun_fact(num);
		System.out.println("Factorial= "+fact);
	}
}