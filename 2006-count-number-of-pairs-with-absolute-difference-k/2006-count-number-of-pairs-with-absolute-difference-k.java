class Solution {
    public int countKDifference(int[] nums, int k) {
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            // As per the given formula |nums[i] - nums[j]| == k
            int anotherOne = nums[i] + k;
            for(int j = 0; j < nums.length; j++){
                // Check for that element in the whole array
                if(anotherOne == nums[j]){
                    count++;
                }
            }          
        }
        return count;
    }
}