class Solution {
    public int maxProfit(int[] prices) {
        int l = 0;
        int r = 1;
        int max = 0;

        while(r < prices.length){
            if(prices[l] >= prices[r]){
                l = r;
            }else if(prices[l] < prices[r]){
                int profit = prices[r] - prices[l];
                max = Math.max(profit,max);
            }
            r++;
        }
        return max;
    }
}

/*
[7,1,5,3,6,4]
l = 0
r = 1
max = 0
1 < 6
    7 > 1
    l = r => l = 1

r++ => r = 2

2 < 6 {
    1 <5
}



prices[left] >= prices[right] 
    left = right;
prices[left] < prices[right]
    profit = prices[right] - prices[left];
    max = Math.max(profit, max);

r++

10 > 1 
    l = 1

r++ : r = 2 

1 < 5 
*/