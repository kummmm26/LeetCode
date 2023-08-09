class Solution {
    public int[] numberOfLines(int[] widths, String s) 
    {
        int lines = 1;  
        int currentWidth = 0;
        
        for (char c : s.toCharArray()) 
        {
            int charWidth = widths[c - 'a'];
            
            if (currentWidth + charWidth > 100) 
            {
                lines++;
                currentWidth = charWidth;
            } 
            else 
            {
                currentWidth += charWidth;
            }
        }
        
        int[] result = { lines, currentWidth };
        return result;
    }
}
