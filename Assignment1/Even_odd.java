import java.util.Scanner;

//1.Check the given number is EVEN or ODD. 

public class Even_odd
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter number");
		int a= sc.nextInt();
		
		if(a%2==0)
			System.out.println("Even number");
			
		else
			System.out.println("Odd number");
	}
}
		
