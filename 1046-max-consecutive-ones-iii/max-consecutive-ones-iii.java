class Solution {
    public int longestOnes(int[] nums, int k) {
        int max=0,len=0,l=0;
        for(int r=0;r<nums.length;r++)
        {
            if(nums[r]==0)
            {
                
                if(k<=0)
                {
                while(nums[l]!=0)
                {
                    l++;
                }
                l++;
                k++;
                }
                k--;
            }
        
            len=(r-l)+1;
            max=Math.max(len,max);
        }
        return max;
    }
}