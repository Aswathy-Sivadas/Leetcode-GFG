class Solution {
    public int numberOfSubstrings(String s) {
        int count=0;
        int l=0,n=s.length();
        
        long total=(long)n*(n+1)/2;
        int[] freq=new int[3];
        for(int r=0;r<n;r++)
        {
            freq[s.charAt(r)-'a']++;
            while(freq[0]>0 && freq[1]>0 && freq[2]>0)
            {
                freq[s.charAt(l)-'a']--;
                l++;
            }
            count+=(r-l)+1;

        }
        return (int)(total-count);
    }
}