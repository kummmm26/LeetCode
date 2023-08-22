class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        StringBuilder r=new StringBuilder();
        r.append(ransomNote);

        if(ransomNote.length() > magazine.length())
        {
             return false;
        }
        else
        {
            for(int i=0;i<magazine.length();i++)
            {
                for(int j=0;j<r.length();j++)
                {
                    if(r.charAt(j)== magazine.charAt(i))
                       {
                           r.setCharAt(j,' ');
                           break;
                       }
                }
            }
        }
       // System.out.print(r.toString());
        for(int i=0;i<r.length();i++)
        {
            if(!Character.isWhitespace(r.charAt(i)))
                return false;
        }
        return true;
    }
}