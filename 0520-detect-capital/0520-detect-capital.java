class Solution {
    public boolean detectCapitalUse(String word) 
    {
        boolean ans = true;
        int n=0;
        for(int i=0;i<word.length();i++)
        {
            if(!Character.isUpperCase(word.charAt(i)))
            {
                ans= false;
                n++;
                if(Character.isUpperCase(word.charAt(0)) && n== word.length()-1)
                {
                    ans = true;
                }
            }
            
        }
        if(n==word.length())
        {
            ans= true;
        }
        return ans;
    }
}