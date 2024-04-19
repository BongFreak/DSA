package Recursion;

public class Factorial 
{	//n* factroial(n-1)
	public static int factorial(int n)
	{
		if(n==0 || n==1) 
		{
			return 1;
		}
		else 
		{
			return n*factorial(n-1);
		}
	}

	public static void main(String[] args) 
	{
		int a = 5;
		System.out.println("The factorial of a is..."+factorial(a));

	}

}
