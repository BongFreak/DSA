package DP2;

public class LongestCommonSubsequence {
	public static int lcsMemoization(String str1, String str2, int i, int j, int[][] dp) {
	    if (i == str1.length() || j == str2.length()) {
	        return 0;
	    }
	    
	    if (dp[i][j] != -1) {
	        return dp[i][j];
	    }
	    
	    int myAns;
	    if (str1.charAt(i) == str2.charAt(j)) {
	        int smallAns = lcsMemoization(str1, str2, i + 1, j + 1, dp);
	        myAns = 1 + smallAns;
	    } else {
	        int ans1 = lcsMemoization(str1, str2, i + 1, j, dp);
	        int ans2 = lcsMemoization(str1, str2, i, j + 1, dp);
	        myAns = Math.max(ans1, ans2);
	    }
	    
	    dp[i][j] = myAns;
	    return myAns;
	}

//	public static int lcsMemoization(String str1,String str2,int i, int j,int[][]dp ) {
//		if (i==str1.length() || j==str2.length()) {
//			return 0;
//		}
//		int myAns;
//		if (str1.charAt(i)==str2.charAt(j)) {
//			int smallans;
//			if (dp[i+1][j+1]==-1) {
//				smallans = lcsMemoization(str1, str2, i+1, j+1,dp);
//				dp[i+1][j+1]= smallans;
//			}else {
//				smallans=dp[i+1][j+1];
//			}
//			 
//			myAns = 1 + smallans;
//		}else {
//			int ans1;
//			if (dp[i+1][j]==-1) {
//				ans1 =lcsMemoization(str1, str2, i+1, j,dp);
//				dp[i+1][j]= ans1;
//			}else {
//				 ans1=dp[i+1][j];
//			}
//			int ans2;
//			if (dp[i][j+1]==-1) {
//				ans2 = lcsMemoization(str1, str2,i, j+1,dp);
//				dp[i][j+1]= ans2;
//			}else {
//				 ans2=dp[i][j+1];
//			}
//			
//			
//			myAns = Math.max(ans1, ans2);
//		}
//		return myAns;
//	}
	
	public static int lcsRecursive(String str1,String str2,int i, int j ) {
		if (i==str1.length() || j==str2.length()) {
			return 0;
		}
		int myAns;
		if (str1.charAt(i)==str2.charAt(j)) {
			int smallans = lcsRecursive(str1, str2, i+1, j+1);
			myAns = 1 + smallans;
		}else {
			int ans1 = lcsRecursive(str1, str2, i+1, j);
			int ans2 = lcsRecursive(str1, str2, i, j+1);
			myAns = Math.max(ans1, ans2);
		}
		return myAns;
	}

	public static void main(String[] args) {
		String str1 = "bedgmc";
		String str2 = "abdfglc";
		int[][] dp = new int [str1.length()+1][str2.length()+1];
		for(int i=0;i<dp.length;i++) {
			for(int j=0;j<dp[0].length;j++) {
				dp[i][j]=-1;
			}
		}
		int ans = lcsMemoization(str1,str2,0,0,dp);
		System.out.println(ans);
	}

}
