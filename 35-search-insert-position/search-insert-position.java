class Solution {
    public int searchInsert(int[] nums, int target) {
        int low=0,high=nums.length-1;
        int mid=0;int ind=nums.length;
        while(low<=high)
        {
            mid=(low+high)/2;
            if(nums[mid]>=target)
            {
                ind=Math.min(mid,ind);
                high=mid-1;
            }
            else 
            {
                low=mid+1;
            }
        }
        if(ind==-1)return nums.length;
        else return ind;
    }
}