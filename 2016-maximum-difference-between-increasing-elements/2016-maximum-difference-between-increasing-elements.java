// class Solution {
//     public int maximumDifference(int[] nums)
//     {
//         int ans=-1,diff;
//         for(int i=nums.length-1;i>0;i--)
//         {
//             for(int j=i-1;j>=0;j--)
//             {
//                 if(nums[i]>nums[j])
//                 {
//                     diff=nums[i]-nums[j];
//                     if(diff>ans)
//                     {
//                         ans=diff;
//                     }
//                 }
//             }
//         }
//         return ans;
//     }
// }
class Solution {
    public int maximumDifference(int[] nums) {
        int res=-1;
        int minEle = Integer.MAX_VALUE;
        for(int i=0; i<nums.length; i++) {
            minEle = Math.min(minEle,nums[i]);
            if(nums[i]!=minEle)
                res=Math.max(res,nums[i]-minEle);
        }
        return Math.max(res,-1);
    }
}