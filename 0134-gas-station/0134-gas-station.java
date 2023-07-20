class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int cur=0,total=0,start=0;
        for(int i=0;i<gas.length;i++)
            {
              int   rem=gas[i]-cost[i];
                if(cur<0)
                {
                    start=i;
                    cur=rem;
                }
                else
                {
                    cur=cur+rem;
                }
                
                total=total+rem;
            }
            
            if(total<0)
            {
                return -1;
            }
            else
            {
                return start;
            }
    }
}