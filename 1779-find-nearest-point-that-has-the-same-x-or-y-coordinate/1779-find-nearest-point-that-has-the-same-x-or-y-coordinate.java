class Solution {
    public int nearestValidPoint(int x, int y, int[][] points) 
    {
        int row = points.length , answer=Integer.MAX_VALUE;
        int ans = Integer.MAX_VALUE;
        int k=0;
            for(int i=0;i<row;i++)
            {
              for(int j=0;j<1;j++)
              {
                    if(x==points[i][j] || y==points[i][j+1])
                    {
                      int dis=Math.abs(x-points[i][j]) + Math.abs(y-points[i][j+1]);
                      if(dis<ans)
                       {
                          ans=dis;
                          k=i;
                       }
                    }
                    else if(x==points[i][j] && y==points[i][j+1] && ans==Integer.MAX_VALUE)
                    {
                    return 0;
                    }
                }
             }
        if(ans==Integer.MAX_VALUE) 
            return -1;
        return k;
    }
}