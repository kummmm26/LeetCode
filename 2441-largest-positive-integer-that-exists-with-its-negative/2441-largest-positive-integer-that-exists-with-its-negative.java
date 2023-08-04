class Solution {
    public int findMaxK(int[] nums) 
    {
        int ans=0;
       for(int i=0;i<nums.length-1;i++)
       {
           for(int j=i+1;j<nums.length;j++)
           {
               if((Math.abs(nums[i])==Math.abs(nums[j]))  && nums[i]!=nums[j])
               {
                   if (Math.abs(nums[i]) > ans)
                   {
                       ans=Math.abs(nums[i]);
                   }
               }
           }
       }
    if(ans==0)
  {
    return -1;           
  }
    return ans;
    }
}  