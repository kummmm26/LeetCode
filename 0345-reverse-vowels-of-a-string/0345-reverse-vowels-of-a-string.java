class Solution {
    public String reverseVowels(String s) 
    {
        Stack<Character> v=new Stack<Character>();
        String newstring="";
        for(int i=0;i<s.length();i++)
        {
           if(s.charAt(i)== 'a' || s.charAt(i)=='e' ||s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u' || s.charAt(i)== 'A' || s.charAt(i)=='E' ||s.charAt(i)=='I' || s.charAt(i)=='O' || s.charAt(i)=='U')
           {
               v.push(s.charAt(i));
           }
        }
        for(int i=0;i<s.length();i++)
        {
             if(s.charAt(i)== 'a' || s.charAt(i)=='e' ||s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u' || s.charAt(i)== 'A' || s.charAt(i)=='E' ||s.charAt(i)=='I' || s.charAt(i)=='O' || s.charAt(i)=='U')
           {
               newstring +=v.pop();
           }
            else
            {
                newstring+=s.charAt(i);        }
        }
        return newstring;
        
    }
}