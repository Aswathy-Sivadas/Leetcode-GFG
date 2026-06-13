class Solution {
    public String reverseWords(String s) {
        String t=s.trim();
        String[] sr=t.split("\\s+");
        StringBuffer sb=new StringBuffer();
        for(int i=sr.length-1;i>=0;i--)
        {
            sb.append(sr[i].trim()+" ");
        }
        return sb.toString().trim();

    }
}