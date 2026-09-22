class Solution {
    public int[] topKFrequent(int[] nums, int k) 
    {
        
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num: nums)
        {
            map.put(num, map.getOrDefault(num,0)+1);
        }

        /*
        List<Integer> keysList = new ArrayList<>(map.keySet());
        keysList.sort((a,b)-> map.get(b) - map.get(a));

        int[] result = new int[k];
        for(int i=0;i<k;i++)
        {
            result[i] = keysList.get(i);
        }

        return result;
        Time Complexity: O(N log N) or O(U log U), where U is unique elements count). Sorting valla log factor vachindi.Space Complexity: O(N) (HashMap and List store cheyadaniki).
        */

        //Bucket Sort Algorithm
        //Step 2: Bucket array creation (Index: Frequency, Value: List of numbers)
        List<Integer>[]  buckets = new List[nums.length+1];
        for(int key: map.keySet())
        {
            int frequency = map.get(key);
           if(buckets[frequency] == null)
           {
             buckets[frequency] = new ArrayList<>();
           }
           buckets[frequency].add(key);
        }

        int[] resultArray = new int[k];
        int index = 0;

        for(int i = buckets.length-1; i>0  && index<k;i--)
        {
            if(buckets[i] != null)
            {
                for(int num : buckets[i])
                {
                    resultArray[index] = num;
                    index++;
                    if(index == k)
                    {
                        return resultArray;
                    }
                } 
            }
          
        }
        return resultArray;

    }
}
