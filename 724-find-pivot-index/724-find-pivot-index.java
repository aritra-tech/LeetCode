class Solution {
    public int pivotIndex(int[] nums) {
        if(nums.length == 0) return -1;
        int n = nums.length;
        int sum=0,leftsum=0;
        for(int i: nums){
            sum+=i;
        }
        for(int i=0;i<n;i++){
            if(leftsum == (sum -nums[i])){
                return i;
            }
            else{
                leftsum+=nums[i];
                sum-=nums[i];
            }
        }
        return -1;
    }
}