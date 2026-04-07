class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();
        boolean[] used = new boolean[nums.length];
        backtrack(nums, used, res, subset);
        return res;
    }

    private void backtrack(int[] nums, boolean[] used, List<List<Integer>> res, List<Integer> subset){
        if(subset.size() == nums.length){
            res.add(new ArrayList<>(subset));
            return;
        }

        for(int i = 0; i < nums.length; i++){
            if(used[i]) continue;
            used[i] = true;
            subset.add(nums[i]);
            backtrack(nums, used, res, subset);
            subset.remove(subset.size() -1);
            used[i] = false;
        }
    }

    
}
