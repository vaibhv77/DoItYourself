

//4.Swap two numbers without using third variable approach 1. 

import java.util.*;

public class Swapping1
{
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter values of a&b");
		int a= sc.nextInt();
		int b= sc.nextInt();
		
		System.out.println("Before swapping " +a+ " "+b);
	
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("After swapping " +a+ " "+b);
	}
}
		
		

