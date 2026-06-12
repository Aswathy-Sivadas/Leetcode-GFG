class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> hs=new HashMap<>();
        HashMap<Character,Character> hm=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            char one=s.charAt(i);
            char two=t.charAt(i);
            if(hs.containsKey(one)&& (hs.get(one)!=two))
            {
                return false;
            }
            if(hm.containsKey(two)&& (hm.get(two)!=one))
            {
                return false;
            }
            hs.put(one,two);
            hm.put(two,one);
        
        }
        return true;
    }
}