class Solution {
    public int missingNumber(int[] nums)
    {
        int n=nums.length,k=0;
        Arrays.sort(nums);
        int i=0;
        while(i<n && nums[i]==i)
        {
            i++;
        }
        if(i<n)
        {
           k=nums[i]-1;  
        }
        else
        {
            k=n;
        }
        return k;
    }
}