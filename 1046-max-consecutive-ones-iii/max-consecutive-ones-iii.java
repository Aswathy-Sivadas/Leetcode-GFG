class Solution {
    public int longestOnes(int[] nums, int k) {
        int max=0,len=0;
        for(int i=0;i<nums.length;i++)
        {
            int m=k;
            len=0;
            
            for(int j=i;j<nums.length;j++)
            {
                
                if(nums[j]==0)
                {
                    if(m<=0)break;
                    m--;
                }
                len++;
                max=Math.max(len,max);
            }
        }
        return max;
    }
}