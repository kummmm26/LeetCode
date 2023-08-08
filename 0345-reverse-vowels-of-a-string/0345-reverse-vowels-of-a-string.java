// class Solution {
//     public String reverseVowels(String s) 
//     {
//         Stack<Character> v=new Stack<Character>();
//         String newstring="";
//         for(int i=0;i<s.length();i++)
//         {
//            if(s.charAt(i)== 'a' || s.charAt(i)=='e' ||s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u' || s.charAt(i)== 'A' || s.charAt(i)=='E' ||s.charAt(i)=='I' || s.charAt(i)=='O' || s.charAt(i)=='U')
//            {
//                v.push(s.charAt(i));
//            }
//         }
//         for(int i=0;i<s.length();i++)
//         {
//              if(s.charAt(i)== 'a' || s.charAt(i)=='e' ||s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u' || s.charAt(i)== 'A' || s.charAt(i)=='E' ||s.charAt(i)=='I' || s.charAt(i)=='O' || s.charAt(i)=='U')
//            {
//                newstring +=v.pop();
//            }
//             else
//             {
//                 newstring+=s.charAt(i);        }
//         }
//         return newstring;
        
//     }
// }

class Solution {
    public String reverseVowels(String s) {
        boolean[] vowels = new boolean[128];
        for (char c : "aeiouAEIOU".toCharArray()) {
            vowels[c] = true;
        }
        char[] cs = s.toCharArray();
        int i = 0, j = cs.length - 1;
        while (i < j) {
            while (i < j && !vowels[cs[i]]) {
                ++i;
            }
            while (i < j && !vowels[cs[j]]) {
                --j;
            }
            if (i < j) {
                char t = cs[i];
                cs[i] = cs[j];
                cs[j] = t;
                ++i;
                --j;
            }
        }
        return String.valueOf(cs);
    }
}