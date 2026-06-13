class Solution {
    public boolean isAnagram(String s, String t) {
        int[] arr=new int[26];
        int[] brr=new int[26];
        if(s.length()!=t.length())return false;
        for(int i=0;i<s.length();i++)
        {
            arr[s.charAt(i)-'a']++;
            brr[t.charAt(i)-'a']++;
        }
        for(int i=0;i<s.length();i++)
        {
            if(arr[s.charAt(i)-'a']!=brr[s.charAt(i)-'a'])
            {
                return false;
            }
        }
        return true;
        
    }
}