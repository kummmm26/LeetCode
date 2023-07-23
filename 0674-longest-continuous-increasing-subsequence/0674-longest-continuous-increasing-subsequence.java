class Solution {
    public int findLengthOfLCIS(int[] nums) {
          int res = 1;
        for (int i = 0, n = nums.length; i < n;) {
            int j = i + 1;
            while (j < n && nums[j] > nums[j - 1]) {
                ++j;
            }
            res = Math.max(res, j - i);
            i = j;
        }
        return res;
        
    }
}