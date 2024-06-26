package DP2;

public class MinimumCostPath {
	public static int minCostDP(int[][] cost) {
		int m = cost.length;//row length
		int n = cost[0].length;//column length
		
		int[][] dp = new int[m+1][n+1];
		for(int i=0;i<dp.length;i++) {
			for(int j=0;j<dp[0].length;j++) {
				dp[i][j] = Integer.MAX_VALUE;
			}
		}
		for(int i=m-1;i>0;i--) {
			for(int j=n-1;j>0;j--) {
				if (i==m-1 && j==n-1) {
					dp[i][j] = cost[i][j];
					continue;
				}
				int ans1 = dp[i][j+1];
				int ans2 = dp[i+1][j];
				int ans3 = dp[i+1][j+1];
				dp[i][j] = cost[i][j]+ Math.min(ans1, Math.min(ans2, ans3));
			}
		}
		return dp[0][0];
	}
	public static int minCostMemoization(int[][] cost,int i, int j,int[][]dp) {
		int m = cost.length;//row length
		int n = cost[0].length;//column length
		
		//Spcl Case
		if (i==m-1 && j==n-1) {
			return cost[i][j];
		}
		//Base Case
		if (i>=m || j>=n) {
			return Integer.MAX_VALUE;
		}
		
		int ans1,ans2,ans3;
		if (dp[i+1][j]==Integer.MIN_VALUE) {
			ans1 = minCostMemoization(cost, i+1, j,dp);
			dp[i+1][j]= ans1;
		}else {
			ans1 = dp[i+1][j];
		}
		if (dp[i][j+1]==Integer.MIN_VALUE) {
			ans2 = minCostMemoization(cost, i, j+1,dp);
			dp[i][j+1]= ans2;
		}else {
			ans2 = dp[i][j+1];
		}
		if (dp[i+1][j+1]==Integer.MIN_VALUE) {
			ans3 = minCostMemoization(cost, i+1, j+1,dp);
			dp[i+1][j+1]= ans3;
		}else {
			ans3 = dp[i+1][j+1];
		}
		
		
		
		int myans = cost[i][j]+Math.min(ans1, Math.min(ans2, ans3));
		return myans;
	}
	public static int minCostRecursive(int[][] cost,int i, int j) {
		int m = cost.length;//row length
		int n = cost[0].length;//column length
		
		//Spcl Case
		if (i==m-1 && j==n-1) {
			return cost[i][j];
		}
		//Base Case
		if (i>=m || j>=n) {
			return Integer.MAX_VALUE;
		}
		
		
		int ans1 = minCostRecursive(cost, i+1, j);
		int ans2 = minCostRecursive(cost, i, j+1);
		int ans3 = minCostRecursive(cost, i+1, j+1);
		int myans = cost[i][j]+Math.min(ans1, Math.min(ans2, ans3));
		return myans;
	}

	public static void main(String[] args) {
		int [][] cost = {{1,5,11},{8,13,12},{2,3,7},{15,16,18}};
//		int[][] dp = new int[cost.length+1][cost[0].length+1];
//		for (int i = 0;i<dp.length;i++) {
//			for (int j = 0;j<dp[0].length;j++) {
//				dp[i][j] = Integer.MIN_VALUE;
//			}
//		}
//		System.out.println(minCostRecursive(cost, 0, 0));
//		System.out.println(minCostMemoization(cost, 0, 0, dp));
		int ans = minCostDP(cost);
		System.out.println(ans);
	}

}
