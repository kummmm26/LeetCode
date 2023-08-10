class Solution {
    public int distributeCandies(int[] candyType)
    {
        Arrays.sort(candyType);
        int type=1,candy=candyType[0],n=candyType.length/2;
        for(int i=0;i<candyType.length;i++)
        {
            if(candyType[i]!=candy)
            {
                type++;
                candy =candyType[i];
            }
        }
//         for(int i=0;i<candyType.length -1;i++)
//         {
//             for(int j=i+1;j<candyType.length;j++)
//             {
//              if(candyType[i]!=candyType[j])
//                 {
//                 type++;
//                 candy =candyType[j];
                 
//                 }
//             }
//         }
        if(type < n)
        {
            return type;
        }
        else
        {
            return n;
        }
    }
}