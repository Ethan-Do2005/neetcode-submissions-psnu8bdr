class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<Integer> list = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(candidates);
        backtrack(candidates, target, 0, list, result);
        return result;
    }

    private void backtrack(int[] candidates, int remain, int start, List<Integer> list, List<List<Integer>> result){
        if(remain == 0){
            result.add(new ArrayList<>(list));
            return;
        }

        if(remain < 0){
            return;
        }

        for(int i = start; i < candidates.length; i++){
            if(i > start && candidates[i] == candidates[i-1]) continue;
            list.add(candidates[i]);
            backtrack(candidates, remain - candidates[i], i + 1, list, result);
            list.remove(list.size() - 1);
        }
    }
}
