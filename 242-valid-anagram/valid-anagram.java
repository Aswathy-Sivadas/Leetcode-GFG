class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> hm=new HashMap<>();
        HashMap<Character,Integer> sm=new HashMap<>();
        if(s.length()!=t.length())return false;
        for(int i=0;i<s.length();i++)
        {
            hm.put(s.charAt(i),hm.getOrDefault(s.charAt(i),0)+1);
            sm.put(t.charAt(i),sm.getOrDefault(t.charAt(i),0)+1);
        }
        return hm.equals(sm);
    }
}