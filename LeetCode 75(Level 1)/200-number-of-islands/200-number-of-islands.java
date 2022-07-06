class Solution {
    public int numIslands(char[][] grid) {
        int island =0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j] == '1'){
                    island++;
                    dfs(grid,i,j);
                }
            }
        }
        return island;
    }
    public void dfs(char[][] grid , int i , int j){
        if(i>=0 && i<grid.length && j>=0 && j<grid[i].length && grid[i][j]=='1'){  // boundary check
            grid[i][j]='0';
            dfs(grid,i+1,j); // up
            dfs(grid,i-1,j); // down
            dfs(grid,i,j+1); // left
            dfs(grid,i,j-1); // right
        }
    }
}