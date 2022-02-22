

//17.Write a java program to LCM of TWO given number. 

import java.util.*;

public class FindLCM
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter numbers");
		
		int a1=sc.nextInt();
		int a2=sc.nextInt();
		
		int a4=a1;
		int a3=a2;
		
		//First find GCD
		
		while(a1!=a2)
		{
			if(a1>a2)
				a1=a1-a2;
			
			else
				a2=a2-a1;
		}
		int gcd= a2;
		
		System.out.println("GCD is "+gcd);
		
		//Now find LCM
		
		int lcm= (a4*a3)/gcd;
		
		System.out.println("LCM of both numbers is "+lcm);
	}
}
		
		
		
