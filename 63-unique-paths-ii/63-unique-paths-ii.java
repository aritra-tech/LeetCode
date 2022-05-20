class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int dp[][] = new int[m][n];
        return helper(obstacleGrid,0,0,m,n,dp);
    }
    public int helper(int[][] grid,int r,int c,int m,int n,int[][] dp){
        if(r == m || c == n || grid[r][c] == 1)return 0;
        if(r == m-1 && c == n-1){
            if(grid[r][c] == 1)return 0;
            return 1;
        }
        if(dp[r][c] > 0)return dp[r][c];
        return dp[r][c] = helper(grid,r+1,c,m,n,dp)+helper(grid,r,c+1,m,n,dp);
    }
}