class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<Integer> subset = new ArrayList<>();
        backtrack(nums, target, subset, 0);
        return res;
    }

    private void backtrack(int[] nums, int target, List<Integer> subset, int i){
        if(target == 0){
            res.add(new ArrayList<>(subset));
            return;
        }

        if(target < 0 || i >= nums.length){
            return;
        }

        subset.add(nums[i]);
        backtrack(nums, target - nums[i], subset, i);
        subset.remove(subset.size() - 1);
        backtrack(nums,target, subset, i + 1);
    }
}
/*
[2,5,6,9]
result[[],[],...]
subset[]
backtrack(nums[2,5,6,9], 9, [], 0)
    subset[2]
    backtrack(nums, 7, [2], 0)
        subset[2, 2]
        backtrack(nums, 5, [2,2], 0);
            subset[2,2,2]
            backtrack(nums, 3, [2,2,2], 0);
                subset[2,2,2,2]
                backtrack(nums, 1, [2,2,2,2], 0);
                    subset[2,2,2,2,2] => false
            subset[2,2,2];
            backtrack(nums,1,[2,2,2], 1);
                subset[2,2,2,5]
                backtrack(nums,-4,[2,2,2,5], 1);
                    [2,2,2,5] => false;
                
*/
/*
My idea:
Using backtracking
to insert each index until it unsatisfy the target

*/
