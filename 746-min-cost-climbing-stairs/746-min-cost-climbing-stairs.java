class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int s1=0;
        int s2=0;
        for(int i=cost.length-1;i>=0;i--){
            int current_steps = cost[i] + Math.min(s1,s2);
            s1=s2;
            s2=current_steps;
        }
        return Math.min(s1,s2);
    }
}