class Solution {
    public boolean find132pattern(int[] nums) {
        Stack<Integer> st = new Stack<>();
        int a = Integer.MIN_VALUE;
        for(int i= nums.length-1 ; i>=0 ; i--){
            if(nums[i] < a) return true;
            while(!st.isEmpty() && st.peek() < nums[i]) a = st.pop();
            st.push(nums[i]);
        }
        return false;
    }
}