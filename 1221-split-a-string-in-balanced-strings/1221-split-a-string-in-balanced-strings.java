class Solution {
    public int balancedStringSplit(String s) {
        int r=0;
        int l=0;
        int c=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='R'){
                r++;
            }
            else if(ch=='L'){
                l++;
            }
            if(r==l){
                c++;
                r=0;
                l=0;
            }
        }
        return c;
    }
}