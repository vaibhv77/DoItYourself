

//18.Write a java program to LCM of TWO given number using Prime Factors method.

//19.Check whether the Given Number is a Palindrome or NOT. 

import java.util.*;
public class PalindromeNum
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number");
		
		int num=sc.nextInt();
		
		int temp=num;
		int reverse=0;
		int digit;
		while(num>0)
		{
			digit=num%10;
			
			reverse=reverse*10+digit;
			
			num=num/10;
		}
		
		if(temp==reverse)
			System.out.println("Number is palindrome");
		
		else
			System.out.println("Number is not palindrome");
	}
}
			
		