class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int n = prices.length;
        int minPriceSoFar = prices[0];
        for(int i=1; i<n; i++){
            if(prices[i] > minPriceSoFar){
                profit = Math.max(profit ,prices[i] - minPriceSoFar);
            }
            else{
                minPriceSoFar = prices[i];
            }
        }
        return profit;
    }
}
