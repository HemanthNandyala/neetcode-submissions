class Solution {
    public boolean isAnagram(String s, String t) {
         if(s.length() != t.length())
        {
            return false;
        }
    /* Brute force
       
        
            char[] sc = s.toCharArray();
            char[] tc = t.toCharArray();
            Arrays.sort(sc);
            Arrays.sort(tc);
           
        return Arrays.equals(sc,tc); */

        int[] freq = new int[26];
        for(int i=0;i<s.length();i++)
        {
            freq[s.charAt(i)-'a']++;
            freq[t.charAt(i)-'a']--;
        }

        for(int value: freq)
        {
            if(value != 0)
            {
                return false;
            }
        }
        return true;

    }
}
