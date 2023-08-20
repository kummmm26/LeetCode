class Solution {
    public List<String> fizzBuzz(int n) 
    {
        List<String> L=new ArrayList<String>();
        String s="";
        for(int i=1;i<=n;i++)
        {
        if(i%3==0 && i%5==0)
        {
           L.add("FizzBuzz");
        }
        else if(i%5==0)
        {
            L.add("Buzz");
        }
        else if(i%3==0 )
        {
            L.add("Fizz");
        }
        else
        {   
            s=Integer.toString(i);
            L.add(s);
        }
        }
    return L;
    }
}