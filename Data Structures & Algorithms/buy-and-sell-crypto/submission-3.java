class Solution {
    public int maxProfit(int[] prices) {
        int l = 0;
        int r = 1;
        int max = 0;

        while(r < prices.length){
            if(prices[l] < prices[r]){
                int cal = prices[r] - prices[l];
                max = Math.max(cal, max);
            }
            else {
                l = r;
            }
            r++;
        }

        return max;
    }
}
/*
i= buy
j = sell
sell > buy
if sell >= buy
    j++;
if sell < buy

*/