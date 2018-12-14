public class Solution {
    public ArrayList<Integer> maxset(ArrayList<Integer> A) {
        int l=0,r=0;
        int cl=0;
        long s=0,cs=0,m=0;
        int f=0,i=0;
        for(i=0;i<A.size();i++)
        {
            int x=A.get(i);
            if(x>=0)
            {
                cs+=x;
                f=1;
                // cm=i;
            }
            else
            {
                // System.out.println(i);
                if(cs>m)
                {
                    m=cs;
                    l=cl;
                    r=i-1;

                }
                else if(cs==m)
                {
                    if(r-l<=i-cl-1)
                    {
                        l=cl;
                        r=i-1;
                    }
                }
                cs=0;
                cl=i+1;
            }
        }
        if(cs>m)
        {
            l=cl;
            r=i-1;
        }
        ArrayList<Integer> al = new ArrayList<Integer>();
        if(f==0)
            return al;
        for(i=l;i<=r;i++)
        {
            al.add(A.get(i));
        }
        return al;
    }
}
