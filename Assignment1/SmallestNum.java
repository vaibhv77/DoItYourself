

//13.Write a Java Program to find the smallest of 3 numbers (a,b,c) without using < or > symbol? 



public class SmallestNum
{
	public static int fun1(int a,int b,int c)
	{
		int count=0;
		
		while(a!=0 && b!=0 && c!=0)
		{
			a--;
			b--;
			c--;
			count++;
		}
		return count;
	}
	
	
	public static void main(String args[])
	{
		int a=10, b=20, c=25;
		
		int smallest=fun1(a,b,c);
		
		System.out.println("Smallest number is "+smallest);
	}
}
		