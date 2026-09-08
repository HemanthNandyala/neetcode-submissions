class Solution {

    
    public int[] twoSum(int[] nums, int target) {
        
        /*Brute force
        int n = nums.length;
        int[] result = new int[2];
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(nums[i] + nums[j] == target)
                {
                   return new int[]{i,j};
                }
            }
        }
        return new int[]{}; */
       HashMap<Integer , Integer> hmap = new HashMap<>();
       for(int i=0;i<nums.length;i++)
       {
        int anotherElement = target - nums[i];
            if(hmap.containsKey(anotherElement))
            {
                return new int[]{hmap.get(anotherElement), i};
            }
        hmap.put(nums[i],i);
       }
       return new int[]{};
    }
}
