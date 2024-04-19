package DP1;

public class MinimumStepsTo1 {
	private static int countPaths(int n) {
		int[] dp = new int[n+1];
		
		return countPathsHelper(n, dp);
	}
	private static int countPathsHelper(int n,int[]dp) {
		if(n==1) {
			return 0;
		}
		if (dp[n]!=0) {
			return dp[n];
		}
		int ans1 = countPathsHelper(n-1, dp);
		int ans2 = Integer.MAX_VALUE;
		int ans3 = Integer.MAX_VALUE;
		
		if (n%2==0) {
			ans2 = countPathsHelper(n/2, dp);
		}
		if (n%3==0) {
			ans3 = countPathsHelper(n/3, dp);
		}
		int myAns =1+ Math.min(ans1, Math.min(ans2, ans3));
		dp[n]= myAns;
		return myAns;
	}
	private static int countPathsDP(int n) {
		int[] dp = new int[n+1];
		dp[1]=0;
		for(int i=2;i<=n;i++) {
			int ans1,ans2 = Integer.MAX_VALUE,ans3 = Integer.MAX_VALUE;
			ans1 = dp[i-1];
			if (i%2==0) {
				ans2 = dp[i/2];
			}
			else if (i%3==0) {
				ans3 = dp[i/3];
			}
				dp[i] = 1+ Math.min(ans1, Math.min(ans2, ans3));
			
		}
		return dp[n];
	}

	public static void main(String[] args) {
		int n = 10;
		System.out.println(countPathsDP(n));
	}

}
