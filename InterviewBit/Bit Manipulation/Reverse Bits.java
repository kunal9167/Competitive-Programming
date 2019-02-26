public class Solution {
    public long reverse(long a) {
        long b=0;
        int c=1;
        while(c<=32)
        {
            b=b<<1;
            if((a&1)==1)
                b|=1;
            a=a>>1;
            c++;
        }
        return b;
    }
}
