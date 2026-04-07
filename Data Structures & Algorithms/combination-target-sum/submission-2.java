class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();

        Arrays.sort(nums);
        backtracking(nums, target, 0, result, list);
        return result;
    }

    private void backtracking(int[] nums, int remain, int start, List<List<Integer>> result, List<Integer> list){
        if(remain == 0){
            result.add(new ArrayList<>(list));
            return;
        }

        if(remain < 0){
            return;
        }

        for(int i = start; i < nums.length; i++){
            if(nums[i] > remain) break;
            list.add(nums[i]);
            backtracking(nums, remain - nums[i], i, result, list);
            list.remove(list.size() - 1);
        }


    }
}
/*
Constraints
What is the range of each number in nums
=> 2 to 30
What is the range length
=> 1 to 20

This is unsorted or sorted array ?
=> sorted
*/