//{ Driver Code Starts
import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        
        //taking input using Scanner class
        Scanner sc = new Scanner(System.in);
        
        //taking total testcases
        int t = sc.nextInt();
        while(t > 0){
            
            //taking size of array
            int n = sc.nextInt();
            int array[] = new int[n];
            
            //inserting elements in the array
            for (int i = 0; i < n; ++i)
            {
                array[i] = sc.nextInt();
            }
            
            //creating an object of class Solution
            Solution ob = new Solution();
            
            //calling longestSubsequence() method of class
            //Solution
            System.out.println(ob.longestSubsequence(n,array));
            t--;
        }
    } 
} 
// } Driver Code Ends



class Solution 
{
    static int longestSubsequence(int n, int arr[])
    {
        List<Integer> piles = new ArrayList<>();
        
        for (int num : arr) {
            int pileIndex = lowerBound(piles, num);
            
            if (pileIndex == piles.size()) {
                piles.add(num);
            } else {
                piles.set(pileIndex, num);
            }
        }
        
        return piles.size();
    }
    
    // Binary search for the lower bound
    static int lowerBound(List<Integer> list, int target) {
        int left = 0, right = list.size();
        
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (list.get(mid) < target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        
        return left;
    }
}




