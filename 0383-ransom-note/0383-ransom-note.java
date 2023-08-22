// class Solution {
//     public boolean canConstruct(String ransomNote, String magazine) {
//         StringBuilder r=new StringBuilder();
//         r.append(ransomNote);

//         if(ransomNote.length() > magazine.length())
//         {
//              return false;
//         }
//             for(int i=0;i<magazine.length();i++)
//             {
//                 for(int j=0;j<r.length();j++)
//                 {
//                     if(r.charAt(j)== magazine.charAt(i))
//                        {
//                            r.setCharAt(j,' ');
//                            break;
//                        }
//                 }
//             }
//         for(int i=0;i<r.length();i++)
//         {
//             if(!Character.isWhitespace(r.charAt(i)))
//                 return false;
//         }
//         return true;
//     }
// }
class Solution 
{
    public boolean canConstruct(String ransomNote, String magazine) 
    {
        if (ransomNote.length() > magazine.length()) 
        {
            return false;
        }

        int[] charCount = new int[26]; 

        for (char c : magazine.toCharArray()) {
            charCount[c - 'a']++;
        }

        for (char c : ransomNote.toCharArray()) {
            if (charCount[c - 'a'] > 0) {
                charCount[c - 'a']--;
            } else {
                return false;
            }
        }

        return true;
    }
}
