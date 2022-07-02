class Solution {
    public int longestPalindrome(String s) {
        int[] frequency = new int[128];        
        for(char c:s.toCharArray()) {
            ++frequency[c];
        }
        int OddGroup = 0;
        for(int i:frequency){
            OddGroup += i & 1;
        }
        return s.length() - OddGroup + (OddGroup > 0 ? 1:0);  // Waiting for a better way to convert boolean into int  
    }
}