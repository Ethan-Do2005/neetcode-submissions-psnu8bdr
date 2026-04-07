class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        boolean[] visited = new boolean[nums.length];

        backtrack(nums, visited, list, result);
        return result; 
    }

    private void backtrack(int[] nums, boolean[] visited, List<Integer> list, List<List<Integer>> result){
        //Base case -> reach list size
        if(list.size() == nums.length){
            result.add(new ArrayList<>(list));
            return;
        }


        for(int i = 0; i < nums.length; i++){
            if(visited[i]) continue;

            visited[i] = true;
            list.add(nums[i]);
            backtrack(nums, visited, list, result);

            visited[i] = false;
            list.remove(list.size() - 1);
        }
    }
}
