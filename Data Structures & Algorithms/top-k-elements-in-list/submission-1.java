class Solution {
    public int[] topKFrequent(int[] nums, int k) 
    {
        
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num: nums)
        {
            map.put(num, map.getOrDefault(num,0)+1);
        }
        List<Integer> keysList = new ArrayList<>(map.keySet());
        keysList.sort((a,b)-> map.get(b) - map.get(a));

        int[] result = new int[k];
        for(int i=0;i<k;i++)
        {
            result[i] = keysList.get(i);
        }

        return result;
        /* Time Complexity: O(N log N) or O(U log U), where U is unique elements count). Sorting valla log factor vachindi.Space Complexity: O(N) (HashMap and List store cheyadaniki).*/
    }
}
