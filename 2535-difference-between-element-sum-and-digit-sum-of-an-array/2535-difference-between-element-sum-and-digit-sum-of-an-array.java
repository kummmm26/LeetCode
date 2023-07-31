class Solution {
    public int differenceOfSum(int[] nums) 
    {
        int n=nums.length;
        int sum=0;
        int digitsum=0;
        int r=0;
        for(int i=0;i<n;i++)
        {
            sum=sum+nums[i];
            if(nums[i]<10)
            {
                digitsum=digitsum+nums[i];
            }
            else
            {
                while(nums[i]>0)
                {
                   r=nums[i]%10;
                   nums[i]=nums[i]/10;
                   digitsum=digitsum+r;
                }
            }
        }
        return Math.abs(sum-digitsum);
    }
}