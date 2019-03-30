public class Solution {
    public int colorful(int A) {
        HashSet<Integer> hs = new HashSet<Integer>();
        return Solution(hs,A,1);
    }
    int Solution(HashSet<Integer> hs,int n,int c)
    {
        String s=String.valueOf(n);
        if(c>s.length())
            return 1;
        
        for(int i=0;i+c<=s.length();i++)
        {
            String s2=s.substring(i,i+c);
            int x=Integer.parseInt(s2);
            int p=prod(x);
            if(hs.contains(p))
                return 0;
            else
                hs.add(p);
        }
        return Solution(hs,n,c+1);
    }
    int prod(int x)
    {
        int p=1;
        while(x>0)
        {
            p*=x%10;
            x=x/10;
        }
        return p;
    }
}
