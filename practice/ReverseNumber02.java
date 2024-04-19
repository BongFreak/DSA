package practice;
import java.util.*;
public class ReverseNumber02 
{ 
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();//1234
		int ans=0;
		while(n>0) 
		{
			int a = n%10;//4
			n= n/10;//123
			ans=(ans*10+a);//(0*10+4)=4
		}
		System.out.println(ans);
	}
		

}


