class Solution {
    public int sumOfSquares(int[] nums)
    {
        int sum=0;
        int n=nums.length;
        for(int i=0,j=1;i<nums.length;i++,j++)
        {
            if(n % j==0)
            {
                sum = sum + nums[i] * nums[i];
            }
        }
        return sum;
    }
}

// class Solution {
//   public int sumOfSquares(int[] nums) 
//   {
//     int n = nums.length;
//     int ans = 0;
//     for (int i = 0; i < n; ++i)
//     {
//       if (n % (i + 1) == 0)
//       {
//         ans =ans + nums[i] * nums[i];
//       }
//     }

//     return ans;
//   }
// }