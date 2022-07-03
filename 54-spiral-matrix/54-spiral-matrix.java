class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList();
        
        if(matrix.length == 0) return result;
        
        int rowbegin = 0;
        int rowend = matrix.length-1;
        int columnbegin = 0;
        int columnend = matrix[0].length-1;
        
        while(rowbegin <= rowend && columnbegin <= columnend){
            
            for(int i=columnbegin; i<=columnend; i++)
                result.add(matrix[rowbegin][i]);
            
            rowbegin++;
            
            for(int i=rowbegin;i<=rowend;i++)
                result.add(matrix[i][columnend]);
            
            columnend--;
            
            if(rowbegin <= rowend){
                for(int i=columnend;i>=columnbegin;i--)
                    result.add(matrix[rowend][i]);
            }
            rowend--;
            
            if(columnbegin <= columnend){
                for(int i=rowend;i>=rowbegin;i--)
                    result.add(matrix[i][columnbegin]);
            }
            columnbegin++;
        }
        return result;
    }
}