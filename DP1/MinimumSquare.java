package DP1;

public class MinimumSquare {
	private static int minWithRecursion(int n) {
		if (n<=3) {
			return n;
		}
		int minAns = Integer.MAX_VALUE;
		for(int i=1;i*i<=n;i++) {
			int currentAns = minWithRecursion(n-i*i);
			if (minAns>currentAns) {
				minAns=currentAns;
			}
		}
		int ans = 1+minAns;
		return ans;
	}
	private static void minSquare(int n) {
		int[]dp = new int[n+1];
		System.out.println(minSquareHelper(n, dp));
	}
	private static int minSquareHelper(int n,int[]dp) {
		if (n<=3) {
			return n;
		}
		int minAns = Integer.MAX_VALUE;
		for(int i=1;i*i<=n;i++) {
			int currentAns;
			if (dp[n-i*i]==0) {
				currentAns = minSquareHelper(n-i*i,dp);
				dp[n-i*i]=currentAns;
			}else {
				currentAns = dp[n-i*i];
			}
			if (minAns>currentAns) {
				minAns=currentAns;
			}
		}
		int ans = 1+minAns;
		return ans;
	
	}

	public static void main(String[] args) {
		int n = 41;
		System.out.println(minWithRecursion(n));
		minSquare(n);
	}

}
