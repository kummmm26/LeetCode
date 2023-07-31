class Solution {
    public int maxDivScore(int[] nums, int[] divisors) 
    {
        int count=0,ans=0,curr=0;
      for(int i=0;i<divisors.length;i++)
      {   count =0;
          for(int j=0;j<nums.length;j++)
              if(nums[j]%divisors[i]==0)
              {
                  count++;
              }
          if(count>ans)
          {
              ans=count;
              curr=divisors[i];
          }
          if(count==ans)
          {
              curr=Math.min(curr,divisors[i]);
          }
      }
        if(curr==0)
        {
            Arrays.sort(divisors);
            
            curr=divisors[0];
        }
        return curr;
    }
}