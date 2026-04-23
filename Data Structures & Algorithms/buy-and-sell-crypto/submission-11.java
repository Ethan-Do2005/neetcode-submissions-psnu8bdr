class Solution {
    public int maxProfit(int[] prices) {
        int left = 0;
        int right = 1;
        int profitMax = 0;

        while(right < prices.length){
            if(prices[left] < prices[right]){
                profitMax = Math.max(profitMax, prices[right] - prices[left]);
            } else{
                left = right;
            }

            right++;
        }

        return profitMax;    
    }
}
