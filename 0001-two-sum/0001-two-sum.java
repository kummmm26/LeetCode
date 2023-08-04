class Solution
{
    public int[] twoSum(int[] nums, int target)
    {
    int[] result = new int[2];
    Map<Integer, Integer> map = new HashMap<>();

 
    for(int i=0; i<nums.length; i++)
        map.put(nums[i],i);
    
    
    for(int i=0; i<nums.length; i++)
    {
        int index = i;
        int anotherValue = target-nums[index];
        
        if(map.get(anotherValue)!=null && map.get(anotherValue)!=i)
        {
            result[0] = index;
            result[1] = map.get(target-nums[index]);
            
            System.err.println("result[0]: " + result[0]);
            System.err.println("result[1]: " + result[1]);
            
            return result;
        }
    }        
    return result;
    }
}