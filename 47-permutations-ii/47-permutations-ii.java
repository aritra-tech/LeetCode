class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums == null || nums.length == 0) {
            return result;
        }

        HashMap<Integer, Integer> countMap = new HashMap<>();
        for (int n : nums) {
            countMap.put(n, countMap.getOrDefault(n, 0) + 1);
        }

        permuteUniqueHelper(result, nums.length, countMap, new ArrayList<>());
        return result;
    }

    private void permuteUniqueHelper(List<List<Integer>> result, int inputLength, HashMap<Integer, Integer> countMap, List<Integer> tempList) {
        if (tempList.size() == inputLength) {
            result.add(new ArrayList<>(tempList));
            return;
        }
        for (int num : countMap.keySet()) {
            int count = countMap.get(num);
            if (count == 0) {
                continue;
            }
            countMap.put(num, count - 1);
            tempList.add(num);
            permuteUniqueHelper(result, inputLength, countMap, tempList);
            tempList.remove(tempList.size() - 1);
            countMap.put(num, count);
        }
    }
}