class Solution {
    public int climbStairs(int n) {
        int count;
        if(n<=2 && n>=1)
        {
            return n;
        }
        int a =1,b=2,c=0;
        for(int i=3;i<=n;i++)
        {
           c = a+b;
           a=b;
           b=c;
           
        }
        return c;
    }
}