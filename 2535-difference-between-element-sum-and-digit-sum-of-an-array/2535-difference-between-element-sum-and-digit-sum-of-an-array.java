// class Solution {
//     public int differenceOfSum(int[] nums) 
//     {//2441 2455
//         int n=nums.length;
//         int sum=0;
//         int digitsum=0;
//         int r=0;
//         for(int i=0;i<n;i++)
//         {
//             sum=sum+nums[i];
//             if(nums[i]<10)
//             {
//                 digitsum=digitsum+nums[i];
//             }
//             else
//             {
//                 while(nums[i]>0)
//                 {
//                    r=nums[i]%10;
//                    nums[i]=nums[i]/10;
//                    digitsum=digitsum+r;
//                 }
//             }
//         }
//         return Math.abs(sum-digitsum);
//     }
// }
class Solution {
    public int differenceOfSum(int[] nums) {
        int n = nums.length;
        int sum = 0;
        int[] digitSum = new int[10]; // Array to store precalculated digit sum for numbers less than 10
         int digitsum=0;
        for (int i = 1; i < 10; i++) {
            digitSum[i] = i;
        }

        for (int i = 0; i < n; i++) {
            sum += nums[i];
            if (nums[i] >= 10) {
                int num = nums[i];
                while (num > 0) {
                    int r = num % 10;
                    num /= 10;
                    digitsum += r;
                }
            } else {
                digitsum += digitSum[nums[i]]; // Use precalculated digit sum
            }
        }

        return Math.abs(sum - digitsum);
    }
}
