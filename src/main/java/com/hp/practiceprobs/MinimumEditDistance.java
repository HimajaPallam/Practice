package com.hp.practiceprobs;

public class MinimumEditDistance {

	int minDistance(String w1, String w2) {
		int m = w1.length();
		int n = w2.length();
		
		int[][] dp = new int[m+1][n+1];
		
		for(int i=1;i<=m;i++)
			dp[i][0] = i;
		for(int j=1;j<=n;j++)
			dp[0][j] = j;
		
		for(int i=1;i<=m;i++) {
			for(int j=1;j<=n;j++) {
				if(w1.charAt(i-1) == w2.charAt(j-1)) {
					dp[i][j] = dp[i-1][j-1];
				} else {
					int topleft = dp[i-1][j-1];
					int top = dp[i-1][j];
					int left = dp[i][j-1];
					dp[i][j] = 1+ Math.min(topleft,Math.min(top,left));
				}
			}
		}
		
		return dp[m][n];
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MinimumEditDistance md = new MinimumEditDistance();
		String s2= "horse";
		String s1 = "ros";
		System.out.println(md.minDistance(s1,s2));
	}

}
