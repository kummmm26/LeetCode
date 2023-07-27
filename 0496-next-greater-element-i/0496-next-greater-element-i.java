class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) 
    {
        int arr[]=new int[nums1.length]; 
        for(int i=0;i<nums1.length;i++)
        {
            for(int j=0;j<nums2.length;j++)
            {
                if(nums1[i]==nums2[j])
                {
                    int a=nums1[i];
                     if(j==nums2.length-1)
                     {
                         arr[i]= -1;
                     }
                    else 
                    {
                        int c=0;
                        for(int s= j+1;s<nums2.length;s++)
                        {
                            
                            if(a<nums2[s])
                            {
                                arr[i]=nums2[s];
                                c++;
                                break;
                               
                            }
                        }
                        if(c<1)
                        {
                            arr[i]=-1;
                            break;
                        }
                    }
                }
            }
        }
        
        return arr;
    }
}