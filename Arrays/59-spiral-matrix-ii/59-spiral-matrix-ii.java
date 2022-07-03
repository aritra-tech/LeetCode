class Solution {
    public int[][] generateMatrix(int n) {
        int[][] result = new int[n][n];
        
        
        int rowbegin = 0;
        int rowend = n-1;
        int columnbegin = 0;
        int columnend = n-1;
        
        int counter = 1;
        
        while(rowbegin <= rowend && columnbegin <= columnend){
            
            for(int i=columnbegin; i<=columnend; i++)
                result[rowbegin][i] = counter++;
            
            rowbegin++;
            
            for(int i=rowbegin;i<=rowend;i++)
                result[i][columnend] = counter++;
            
            columnend--;
            
            if(rowbegin <= rowend){
                for(int i=columnend;i>=columnbegin;i--)
                    result[rowend][i] = counter++;
            }
            rowend--;
            
            if(columnbegin <= columnend){
                for(int i=rowend;i>=rowbegin;i--)
                    result[i][columnbegin] = counter++;
            }
            columnbegin++;
        }
        return result;
    }
}