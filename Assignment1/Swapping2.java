
//5.Swap two numbers without using third variable approach 2. 

import java.util.*;

public class Swapping2
{
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter values of a&b");
		int a= sc.nextInt();
		int b= sc.nextInt();
		
		System.out.println("Before swapping " +a+ " "+b);
	
		a=a*b;   //200=20*10
		b=a/b;   //20=200/10
		a=a/b;   //10=200/20
		
		System.out.println("After swapping " +a+ " "+b);
	}
}
	