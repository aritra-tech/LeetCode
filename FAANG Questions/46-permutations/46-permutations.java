class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result,nums,0);
        return result;
    }
    
    public void backtrack(List<List<Integer>> result , int[] nums, int s){
        if(s == nums.length){
            result.add(toList(nums));
        }
        for(int i=s;i<nums.length;i++){
            swap(i,s,nums);
            backtrack(result,nums,s+1);
            swap(i,s,nums);
        }
    }
    
    public List<Integer> toList(int[] nums){
        List<Integer> res = new ArrayList<>();
        for(int i:nums)
            res.add(i);
        return res;
    } 
    
    public void swap(int i, int j, int[] nums){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}