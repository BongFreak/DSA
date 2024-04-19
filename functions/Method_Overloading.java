package functions;
import java.util.*;
public class Method_Overloading 
{
	static void foo() 
	{	
		System.out.println(" Good Morning Bro");
	}
	static void foo(int a) 
	{	
		System.out.println(" Good Morning "+a+" Bro");
	}
	static void foo(int a, int b) 
	{	
		System.out.println(" Good Morning "+a+" Bro");
		System.out.println(" Good Morning "+b+" Bro");
	}
	public static void main(String[] args) 
	{
		foo();
		foo(100);
		foo(200, 300);
	}
}
