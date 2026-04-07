class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();

        backtrack(nums, 0, list, result);
        return result;
    }

    private void backtrack(int[] nums, int start, List<Integer> list, List<List<Integer>> result){
        //Base case
        result.add(new ArrayList<>(list));

        for(int i = start; i < nums.length; i++){
            list.add(nums[i]);
            backtrack(nums, i + 1, list, result);
            list.remove(list.size() - 1);
        }
    }
}
