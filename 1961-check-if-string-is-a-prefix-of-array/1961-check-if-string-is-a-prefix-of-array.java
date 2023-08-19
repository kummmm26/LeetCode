class Solution {
    public boolean isPrefixString(String s, String[] words) 
    {
        StringBuilder ss=new StringBuilder();
        for(String str: words)
        {
            ss.append(str);
            if(s.length()==ss.length())
            {
                return s.equals(ss.toString());
            }
        }
        return false;
    }
}