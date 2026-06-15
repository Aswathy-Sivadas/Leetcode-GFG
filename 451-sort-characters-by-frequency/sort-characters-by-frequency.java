class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> hm=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {

            hm.put(s.charAt(i),hm.getOrDefault(s.charAt(i),0)+1);
        }
        ArrayList<Character> arr=new ArrayList<>(hm.keySet());
        arr.sort((a,b)->hm.get(b)-hm.get(a));
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<arr.size();i++)
        {
            for(int j=0;j<hm.get(arr.get(i));j++)
            {
                sb.append(arr.get(i));
            }
        }
       return sb.toString();


    }
}