public class Solution {
    public int pow(int x, int n, int d) {
        if(x==0)
            return 0;
        if(n==0)
            return 1;
        
        long res=1,f=0;
        if(x<0)
        {
            x=Math.abs(x);
            if(n%2==1)
                f=1;
        }
        x=(int)x%d;
        // System.out.println(-1%20);
        while(n>0)
        {
            if(n%2==1)
                res=(res*x)%d;
            n=n/2;
            x=(x*x)%d;
        }
        if(f==1)
            return (int)(d-res);
        return (int)res;
    }
}

