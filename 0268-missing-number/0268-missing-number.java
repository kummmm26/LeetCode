class Solution {
    public int missingNumber(int[] nums)
    {
        int k=0;
        Arrays.sort(nums);
        int i=0;
        while(i<nums.length && nums[i]==i)
        {
            i++;
        }
        if(i<nums.length)
        {
           k=nums[i]-1;  
        }
        else
        {
            k=nums.length;
        }
        return k;
    }
}