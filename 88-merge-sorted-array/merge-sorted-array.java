class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int l=nums1.length-1;
        
        m--;n--;

        if(m<0 && n==0)
        {
            nums1[0]=nums2[0];
        }
        
        while(l>=0 && n>=0)
        {
            if(m==-1)
            {
                nums1[l]=nums2[n];
                n--;
                l--;
            }
            else{
            if(nums2[n]>=nums1[m])
            {
                nums1[l]=nums2[n];
                n--;
                l--;
            }
            else
            {
                nums1[l]=nums1[m];
                m--;
                l--;

            }}
        }
        
    }
}