class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        backtrack(ans, new ArrayList<Integer>(), k, n, 1);
        return ans;
    }

    private void backtrack(List<List<Integer>> ans, List<Integer> temp, int k, int remain, int start) {
        if (temp.size() > k) { 
            return; 
        } else if (temp.size() == k && remain == 0) {
            ans.add(new ArrayList<Integer>(temp));
        } else{
            for (int i = start; i <= 9; i++) {
                temp.add(i);
                backtrack(ans, temp, k, remain - i, i + 1);
                temp.remove(temp.size() - 1);
            }
        }
    }
}