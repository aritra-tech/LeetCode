class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> map = new HashMap();
        for(int i=0; i<s.length(); i++){
            char temp = s.charAt(i);
            if(map.get(temp) != null) map.remove(temp);
            else map.put(temp, i);
        }
        if(map.size() <= 1) return s.length();
        return s.length() - map.size() + 1;
    }
}