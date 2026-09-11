class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        //int maxProfit = 0;
        /*
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
        */

        //Optimal approach

        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i =0;i<prices.length;i++)
        {
            if(prices[i] < minPrice)
            {
                minPrice = prices[i];
            }
            else
            {
                maxProfit = Math.max(maxProfit, prices[i] - minPrice);
            }
        }
       
       return maxProfit;
    }
}
