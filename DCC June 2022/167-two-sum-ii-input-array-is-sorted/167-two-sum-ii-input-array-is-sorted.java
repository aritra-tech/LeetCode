class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] a = new int[2];
        if(numbers.length<2){
            return a;
        }
        int s=0 , e=numbers.length-1;
        while(s<e){
            
            int sum = numbers[s]+numbers[e];
            
            if(sum==target)
            {
                a[0]=s+1;
                a[1]=e+1;
                s++;
                e--;
                break;
            }
            else if(sum>target)
            {
                e--;
            }
            else
            {
                s++;
            }
        }
        return a;
    }
}