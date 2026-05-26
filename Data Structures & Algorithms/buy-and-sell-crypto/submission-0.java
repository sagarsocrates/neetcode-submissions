class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int n = prices.length;
        int boughtPrice = prices[0];
        for(int i=1; i<n; i++){
            if(prices[i] > boughtPrice){
                profit = Math.max(profit ,prices[i] - boughtPrice);
                continue;
            }
            else{
                boughtPrice = prices[i];
            }
        }
        return profit;
    }
}
