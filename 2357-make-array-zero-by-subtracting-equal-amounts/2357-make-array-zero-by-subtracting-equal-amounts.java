class Solution {
    public int minimumOperations(int[] nums) {
        Set<Integer> li = new HashSet<>();
        int count =0;
       for(int a:nums){
           if(a>0)
           {
               li.add(a);
           }
       }
        
        return li.size();
    }
}