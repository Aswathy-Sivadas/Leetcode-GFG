class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        int sum=0,diff=0,count=0;
        hm.put(0,1);
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
            
                diff=(sum-goal);
                if(hm.containsKey(diff))
                {
                count+=hm.get(diff);
                }

            
            hm.put(sum,hm.getOrDefault(sum,0)+1);
        }
        return count;
    }
}