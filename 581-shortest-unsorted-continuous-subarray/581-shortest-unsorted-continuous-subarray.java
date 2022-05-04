class Solution {
    public int findUnsortedSubarray(int[] nums) {
        if(nums == null || nums.length == 0 || nums.length ==1) return 0;
        
        int n = nums.length;
        int s = n;
        int[] k = Arrays.copyOf(nums,n);
        Arrays.sort(k);
        
        int l=0,h=n-1;
        while(l< n && k[l] == nums[l]) l++;
        
        if(l == n) return 0;
        
        while(h>=0 && k[h] == nums[h]) h--;
        
        return h-l+1;
    }
}