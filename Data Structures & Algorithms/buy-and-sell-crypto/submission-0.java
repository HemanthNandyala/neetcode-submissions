class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int maxProfit = 0;
        int l = 0;
        int r =1;
        while(r<n)
        {
            if(prices[l] >= prices[r])
            {
                l= r;
            }
            else
            {
                int tempProfit = prices[r] - prices[l];
                maxProfit = Math.max(tempProfit, maxProfit);
                
            }
            r++;
        }
       
       return maxProfit;
    }
}
