class Solution {
    public int maxProfit(int[] prices) {
        int sell = 0;
        int buy = 0;
        int maxProfit = 0;

        while(sell < prices.length){
            if(prices[sell] < prices[buy]){
                buy = sell;
            }
            maxProfit = Math.max(maxProfit, prices[sell] - prices[buy]);
            sell++;
        }

        return maxProfit;
    }
}
/*
first buy, then sell
sell > buy
profit = (prices[sell] - prices[buy])

[10,1,5,6,7,1]
sell = 0;
buy = 0;

10 = 10
sell buy
1   <  10
5   >  1  = 4
6   >  1 = 5
7   >  1 = 
1   =  1 => buy = sell
*/