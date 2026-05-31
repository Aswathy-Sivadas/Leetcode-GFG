class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max=0,l=0;
        HashMap<Character,Integer> hm=new HashMap<>();
        for(int r=0;r<s.length();r++)
        {
            if((hm.containsKey(s.charAt(r))&&(hm.get(s.charAt(r))>=l)))
            {
                l=(hm.get(s.charAt(r)))+1;
            }
            hm.put(s.charAt(r),r);
            int len=((r-l)+1);
            max=Math.max(max,len);

        }
        return max;
    }
}