

//9.Write a Java Program to Print 1 To 10 Without Using Loop.(Recursion)


public class Numbers1
{
	
	public static void fun1(int a)
	{
		if(a<=10){
			System.out.println(a);
			fun1(a+1);
		}
	}
	
	public static void main(String args[])
	{
		fun1(1);
	}
}
		
