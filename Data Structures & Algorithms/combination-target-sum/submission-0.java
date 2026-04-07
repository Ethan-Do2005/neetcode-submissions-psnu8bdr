class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();
        backtracking(nums, 0, target, subset, res);
        return res;
    }

    private void backtracking(int[] nums, int i, int target, List<Integer> subset, List<List<Integer>> res){
        if(target == 0){
            res.add(new ArrayList<>(subset));
            return;
        }
        if(target < 0 || i >= nums.length){
            return;
        }
        subset.add(nums[i]);
        backtracking(nums, i, target - nums[i], subset, res);
        subset.remove(subset.size() -1);
        backtracking(nums, i + 1, target, subset, res);
    }
}
