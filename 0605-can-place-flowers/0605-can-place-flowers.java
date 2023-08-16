class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) 
    {
        int l = flowerbed.length;
        boolean b=false;
        int count=0;
        for(int i=0;i<l;i++)
        {
             if (flowerbed[i] == 0) 
             {
                if (i == 0 || flowerbed[i - 1] == 0) 
                {
                    if (i == l - 1 || flowerbed[i + 1] == 0) 
                    {
                        flowerbed[i] = 1;
                        count++;
                    }
                }
            }
        }
        return count >= n;
        
    }
}