class Solution {
    public int reverse(int x) {
        long rev =0;
        while(x!=0){
            int remainder = x%10;   //123%10 = 3
            rev = rev*10+remainder;  // 0*10+3 =0+3 = 3 
            x=x/10; // 123/10 = 12   [and this process goes on upto x becomes 0]
        }
        if(rev>=Integer.MIN_VALUE && rev<=Integer.MAX_VALUE){
            return (int)rev;
        }else{
            return 0;
        }
    }
}