class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ls=new ArrayList<>();
       for(int i=0;i<1<<nums.length;i++)
       {
            ArrayList<Integer> arr=new ArrayList<>();
            for(int j=nums.length-1;j>=0;j--)
            {
                if((i&(1<<j))!=0)
                {
                    arr.add(nums[j]);
                }
            }
            ls.add(arr);

       }
       return ls;
    }
}