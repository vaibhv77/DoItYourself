
//15.Write a java program to Reverse a given number. 

import java.util.*;

public class ReverseNum
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number to be reverse");
		
		int num=sc.nextInt();
		
		
		int reverse=0;
		
		while(num!=0)
		{
			int digit=num%10;
			
			reverse= reverse*10+ digit;
			
			num=num/10;
			
		}
		
		System.out.println("reversed number "+reverse);
	}
}
		
		
	