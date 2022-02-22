

//8.Write a Java Program to find whether given number is Leap year or NOT?

import java.util.*;

public class LeapYear1
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter year to be checked");
		
		int year=sc.nextInt();
		
		if(((year%4==0) && (year%100!=0))||(year%400==0))
			System.out.println("given year is leap year ");
		
		else
			System.out.println("given year is non leap year ");
	}
}
		
