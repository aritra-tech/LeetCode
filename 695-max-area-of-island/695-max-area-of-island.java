class Solution {
    
    boolean seen[][];
    public int maxAreaOfIsland(int[][] grid) {
        
        int area = 0;
        int row = grid.length;
        int column = grid[0].length;
        
        seen = new boolean[row][column];
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                area = Math.max(area, result(i,j,grid));
            }
        }
        return area;
    }
    
    public int result(int row, int column, int[][] grid){
        if(row<0 || row>=grid.length || column<0 || column>=grid[row].length|| seen[row][column] || grid[row][column]==0){
            return 0;
        }
        
        seen[row][column] = true;
        return 1 + result(row+1,column,grid) + result(row-1,column,grid) + result(row,column-1,grid) + result(row,column+1,grid);
    }
}