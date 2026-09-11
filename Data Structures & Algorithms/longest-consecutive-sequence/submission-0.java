class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
       
        for(int i : nums)
        {
            set.add(i);            
        }
        
        int maxLen =0;
        for(Integer num :set)
        {
             
            if(!set.contains(num-1))
            {
                int currentNumber = num;
                int currentLength = 1;
                while(set.contains(currentNumber+1))
                {
                    currentNumber++;
                    currentLength++;
                }
                maxLen = Math.max(maxLen,currentLength);
            }
        }
        return maxLen;
    }
}
