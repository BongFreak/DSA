package DP1;
import java.util.*;
public class Fibonacci {
	private static int fibbM(int n) {
		int[] dp = new int[n+1];
		for(int i=0;i<dp.length;i++) {
			dp[i]= -1;
		}
		return fibbMhelper(n, dp);
	}
	private static int fibbMhelper(int n,int[] dp) {
		if (n==0 || n==1) {
			dp[n]=n;
			return dp[n];
		}
		
		if (dp[n]!=-1) {
		return dp[n];
		}
		dp[n]= fibbMhelper(n-1,dp)+fibbMhelper(n-2,dp);
		return dp[n];
	}
	private static int fibbDP(int n) {
		int[] dp = new int[n+1];
		dp[0]=0;
		dp[1]=1;
		for(int i=2;i<=n;i++) {
			dp[i]=dp[i-1]+dp[i-2];
		}
		return dp[n];
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.println(fibbM(n));
		System.out.println(fibbDP(n));
	}

}
