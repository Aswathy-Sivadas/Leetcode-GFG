class Solution {
    public String longestCommonPrefix(String[] strs) {
        String s=strs[0];int max=s.length();
        for(int i=1;i<strs.length;i++)
        {
            int len=0;
            for(int j=0;j<Math.min(s.length(),strs[i].length());j++)
            {
                if(strs[i].charAt(j)==s.charAt(j))
                {
                    len++;
                }
                else{
                    break;
                }
            }

            max=Math.min(max,len);
            if(max==0)return "";

        }
        return strs[0].substring(0,max);
    }
}