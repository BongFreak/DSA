package DP1;

import java.util.Scanner;

public class ClimbStairs {
	private static int countPaths(int n) {
		int[] dp = new int[n+1];
		return countPathsHelper(n, dp);
	}
	private static int countPathsHelper(int n,int[]dp) {
		if(n==0) {
			return 1;
		}
		if (n<0) {
			return 0;
		}
		if (dp[n]>0) {
			return dp[n];
		}
		int nm1= countPathsHelper(n-1, dp);
		int nm2= countPathsHelper(n-2, dp);
		int nm3= countPathsHelper(n-3, dp);
		int cp = nm1+nm2+nm3;
		dp[n] = cp;
		return cp;
	}
	private static int countPathsDP(int n) {
		int[] dp = new int[n+1];
		dp[0]=1;

		for(int i=1;i<=n;i++) {
			if (i==1) {
				dp[i] = dp[i-1];
			}else if (i==2) {
				dp[i] = dp[i-1]+dp[i-2];
			}else {
				dp[i] = dp[i-1]+dp[i-2]+dp[i-3];
			}
		}
		return dp[n];
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(countPaths(n));
		System.out.println(countPathsDP(n));
	}

}
