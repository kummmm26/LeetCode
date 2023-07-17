class Solution {
    public int majorityElement(int[] nums) 
    {
        int ans=0,c=1,res=0;
        if(nums.length < 2)
        {
            ans= nums[0];
        }
        else
        {
            Arrays.sort(nums);
            for(int i=0;i<nums.length -1 ;i++)
            {
                if(nums[i]!=nums[i+1])
                {
                    if(c>res)
                    {
                        res=c;
                        ans= nums[i];
                    }
                    c=1;
                }
                else 
                {
                    c++;
                }
                
                if(i==nums.length -2)
                {
                    if(c>res)
                    {
                        res=c;
                        ans=nums[i];
                    }
                }
                
            }
        }
        return ans;
    }
}