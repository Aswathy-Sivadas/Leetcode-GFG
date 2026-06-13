class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]%2==0)nums[i]=0;
            else nums[i]=1;
        }
        HashMap<Integer,Integer>hm=new HashMap<>();
        int count=0,l=0,sum=0;
        hm.put(0,1);
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
            int diff=(sum-k);
            if(hm.containsKey(diff))count+=hm.get(diff);
            hm.put(sum,hm.getOrDefault(sum,0)+1);
        }
        return count;
    }
}