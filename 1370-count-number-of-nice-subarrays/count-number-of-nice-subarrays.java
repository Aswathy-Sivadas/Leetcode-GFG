class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]%2==0)nums[i]=0;
            else nums[i]=1;
        }
        int c1=0,l=0,c2=0,sum=0,sum2=0;
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
            while(sum>k)
            {
                sum-=nums[l];
                l++;
            }
            c1+=(i-l+1);
        }
        l=0;
        for(int i=0;i<nums.length;i++)
        {
            sum2+=nums[i];
            while(sum2>(k-1))
            {
                sum2-=nums[l];
                l++;
            }
            c2+=(i-l+1);
        }
        c1-=c2;
        return c1;
    }

}