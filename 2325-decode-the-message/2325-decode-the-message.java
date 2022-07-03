class Solution {
    public String decodeMessage(String key, String message) {
        int ht[]=new int[26],i,kht[]=new int[26],ind=0;
        HashSet<Integer> hh=new HashSet<Integer>();
        String res="";
        for(i=0;i<key.length();i++){
            int val=(int)key.charAt(i)-'a';
            if(!hh.contains(val) && val>=0){
                hh.add(val);
                //System.out.println(ind+" "+val);
                ht[ind++]=val;
            }
        }
        for(i=0;i<26;i++){
            kht[ht[i]]=i;
        }
        for(i=0;i<message.length();i++){
            if(message.charAt(i)!=' ')
                res=res+(char)('a'+kht[(int)message.charAt(i)-'a']);
            else res=res+" ";
        }
        return res;
    }
}