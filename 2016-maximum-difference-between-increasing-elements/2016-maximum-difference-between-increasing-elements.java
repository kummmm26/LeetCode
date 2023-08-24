class Solution {
    public int maximumDifference(int[] nums)
    {
        int ans=-1,diff;
        for(int i=nums.length-1;i>0;i--)
        {
            for(int j=i-1;j>=0;j--)
            {
                if(nums[i]>nums[j])
                {
                    diff=nums[i]-nums[j];
                    if(diff>ans)
                    {
                        ans=diff;
                    }
                }
            }
        }
        return ans;
    }
}