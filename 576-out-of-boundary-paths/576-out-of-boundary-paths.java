class Solution {
    
    
    public int findPaths(int m, int n, int maxMove, int startRow, int startColumn) {
       
        Integer[][][] dp = new Integer[m][n][maxMove+1];  
        
        return recHelper (m, n, maxMove, startRow, startColumn, dp);
        
    }
    
    
    
    private int recHelper (int m, int n, int move, int i, int j, Integer[][][] dp) {
        
        int mod = 1000000007;
        
        
        if (i < 0 || j < 0 || i >= m || j >= n) {
            return 1;
        }
        
        if (move <= 0) {
            return 0;
        }
        
        if (dp[i][j][move] != null) {
            return dp[i][j][move];
        }
        
        int count = 0;
        
        
        count = count % mod + recHelper(m, n, move - 1, i-1, j, dp) % mod;
        count = count % mod + recHelper(m, n, move - 1, i+1, j, dp) % mod;
        count = count % mod + recHelper(m, n, move - 1, i, j-1, dp) % mod;
        count = count % mod + recHelper(m, n, move - 1, i, j+1, dp) % mod;
        
        dp[i][j][move] = count % mod;
        
        return dp[i][j][move];

    }
    
    
    
    
}