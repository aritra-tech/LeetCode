class Solution {
    public boolean backspaceCompare(String s, String t) {
        return getresult(s).equals(getresult(t));
    }
    public String getresult(String st){
        int n = st.length(),count=0;
        String result ="";
        for(int i=n-1; i>=0; i--) {
            char ch=st.charAt(i);
            if(ch=='#') 
                count++;
            else {
                if(count>0)
                    count--;
                else {
                    result+=ch;
                }                     
            }
        }
        return result;
    }
}