class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;

        if(n==0) return 0;
        if(n==1) return cost[0];

        int first = cost[0];
        int second = cost[1];
        int cur = 0;
        for(int i = 2 ; i < n; i++){
            cur = cost[i] + Math.min(second,first);
            first = second;
            second = cur;
        }
        return Math.min(first,second);
    }

}
