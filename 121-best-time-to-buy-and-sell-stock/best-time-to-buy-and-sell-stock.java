class Solution {
    public int maxProfit(int[] prices) {
        if(prices == null || prices.length <2)
        {
            return 0;
        }
        int minPrice = prices[0];
        int maxProfit = 0;
        for(int i = 1; i<prices.length;i++)
        {
           if(prices[i]>minPrice)
            {
             int profit = prices[i] - minPrice;
            if(profit > maxProfit)
            {
                maxProfit = profit;
            }
             
           }  
           else
           {
            minPrice = prices[i];
           }
        }
        return maxProfit;
    } 
}