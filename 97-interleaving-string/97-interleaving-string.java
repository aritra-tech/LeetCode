class Solution {
    public boolean isInterleave(String s1, String s2, String s3) {
        int n = s1.length() + 2, m = s2.length() + 2;
        char[] sc1 = s1.toCharArray(), sc2 = s2.toCharArray(), sc3 = s3.toCharArray();
        if (n + m - 4 != s3.length()) return false;
        boolean[] dp = new boolean[m];
        dp[1] = true;
        for (int i = 1; i < n; i++)
            for (int j = 1; j < m; j++) {
                boolean up = dp[j] && (i < 2 || sc1[i-2] == sc3[j+i-3]),
                    left =dp[j-1] && (j < 2 || sc2[j-2] == sc3[j+i-3]);
                dp[j] = up || left;
            }
        return dp[m-1];
    }
}