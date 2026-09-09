class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] left= new int[n];
        int[] right = new int[n];
        int[] res = new int [n];
        left[0] =1;

        res[0] =1;
        for(int i=1;i<n;i++)
        {
            res[i] = res[i-1] * nums[i-1];
        }
        int suffix =1;
        for(int i= n-1;i>=0;i--)
        {
            
            res[i] = res[i]* suffix;
            suffix= suffix * nums[i];
        }

        //Optimal approach with space O(1)


        /*left right array approach
        for(int i=1;i<n;i++)
        {
            left[i] = left[i-1] * nums[i-1];

        }
        right[n-1] = 1;
        for(int i=n-2;i>=0;i--)
        {
            right[i] = right[i+1]* nums[i+1];

        }

        for(int i=0;i<res.length;i++)
        {
            res[i] = left[i] * right[i];
        }
      //  for left and right array approach
     //   Time complexxity  : O(N)
      //  Space complexity : O(N) */


        /*Brute Force
        int[] res = new int [n];
        for(int i=0;i<n;i++)
        {
            int product =1;
            for(int j=0; j<n;j++)
            {
                if(i != j)
                {
                    product = product* nums[j];
                }
            }
            res[i] = product;
        } */

        return res;
    }
}  
