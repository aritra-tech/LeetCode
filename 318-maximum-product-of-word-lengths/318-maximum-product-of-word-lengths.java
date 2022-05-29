class Solution {
    public int maxProduct(String[] words) {
        int n = words.length;
        int[] bits = new int[n];
        for(int i = 0; i < n; i++)
            for(int j=0; j<words[i].length(); j++) 
                bits[i] |= 1 << (words[i].charAt(j) - 'a');
            
        int result = 0;
        for(int i=0; i < n; i++) 
            for(int j = i+1; j < n; j++) 
                if((bits[i] & bits[j]) == 0) 
                    result = Math.max(result, words[i].length() * words[j].length());
            
        return result;
    }
}