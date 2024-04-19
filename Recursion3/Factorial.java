package Recursion3;

public class Factorial {
	public static int factorialhelper(int n)
	{
		if(n==0 || n==1) 
		{
			return 1;
		}
		else 
		{
			return n*factorialhelper(n-1);
		}
	}
	public static void factorial1(int n) {
		int out = factorialhelper(n);
		System.out.println(out);
	}
	public static void factorial2(int n,int ans) {
		if (n==0) {
			System.out.println(ans);
			return;
		}
		ans=ans*n;
		factorial2(n-1, ans);
	}
	

	public static void main(String[] args) {
		int n = 5;
		factorial2(n,1);
	}

}
