package DP2;

public class EditDstance {
	public static int editDistance(String s, String t) {
	int m = s.length();
	int n = t.length();
	int dp[][] = new int[n+1][m+1];
	for(int i=n;i>=0;i--) {
		dp[m][i] = n-i;
	}
	for(int j=m;j>=0;j--) {
		dp[j][n] = m-j;
	}
	for(int i=m-1;i>=0;i--) {
	
	for(int j=n-1;j>=0;j--) {
		if (s.charAt(i)==t.charAt(j)) {
			dp[i][j] = dp[i+1][j+1];
		}else {
			int ans1 =  dp[i+1][j+1];
			int ans2 = dp[i+1][j];
			int ans3 = dp[i][j+1];
			dp[i][j] = Math.min(ans1, Math.min(ans2, ans3))+1;
		}
		}
	}
	return dp[0][0];
}

	public static void main(String[] args) {
		String str1 = "abc"

	}

}
